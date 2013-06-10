package XMPP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.ConnectionConfiguration.SecurityMode;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.ServiceDiscoveryManager;
import org.jivesoftware.smackx.packet.DiscoverItems;
import org.jivesoftware.smackx.pubsub.AccessModel;
import org.jivesoftware.smackx.pubsub.ConfigureForm;
import org.jivesoftware.smackx.pubsub.FormType;
import org.jivesoftware.smackx.pubsub.Item;
import org.jivesoftware.smackx.pubsub.LeafNode;
import org.jivesoftware.smackx.pubsub.PayloadItem;
import org.jivesoftware.smackx.pubsub.PubSubManager;
import org.jivesoftware.smackx.pubsub.PublishModel;
import org.jivesoftware.smackx.pubsub.SimplePayload;
import org.jivesoftware.smackx.pubsub.Subscription;

public class PubSub {
	
	private XMPPConnection connection;
	private PubSubManager mgr;
	
	public void connect(String host, int port, String user, String pass) throws XMPPException{
		
		ConnectionConfiguration config = new ConnectionConfiguration(host,port);
        config.setSASLAuthenticationEnabled(false);
        config.setSecurityMode(SecurityMode.disabled);
        
        this.connection = new XMPPConnection(config);
        
        this.mgr = new PubSubManager(connection);
       
        connection.connect();
        connection.login(user, pass);
        System.out.println("Server verbunden\n");
        
	}
	
	public void disconnect(){
		
		connection.disconnect();
		System.out.println("Verbindung geschlossen");
		
	}
	
	public void createNode(String node, Boolean payload) throws XMPPException{
		
		LeafNode leaf = mgr.createNode(node);
        ConfigureForm form = new ConfigureForm(FormType.submit);
        form.setAccessModel(AccessModel.open);
        form.setDeliverPayloads(payload);
        form.setNotifyRetract(true);
        form.setPersistentItems(true);
        form.setPublishModel(PublishModel.open);
        leaf.sendConfigurationForm(form);
        System.out.println(node + " angelegt\n");
        
	}
	
	public void deleteNode(String node) throws XMPPException{
		
		mgr.deleteNode(node);
		System.out.println(node + " gelöscht\n");
		
	}
	
	public void subscribe(String nodeName) throws XMPPException{
		
		LeafNode node = mgr.getNode(nodeName);
        node.addItemEventListener(new ItemEventCoordinator<Item>());
        node.subscribe(connection.getUser());
        System.out.println(connection.getUser()+" hat "+nodeName+" abonniert\n");
		
	}
	
	public void unsubscribe(String nodeName) throws XMPPException{
		
		LeafNode node = mgr.getNode(nodeName);
        node.addItemEventListener(new ItemEventCoordinator<Item>());
        node.unsubscribe(connection.getUser());
        System.out.println(connection.getUser()+" hat abonnement von "+nodeName+" gekündigt\n");
		
	}
	
	public void getAllSubscriptions() throws XMPPException{
		
		List<Subscription> subscriptions = mgr.getSubscriptions();
		System.out.println("Abonennten aller Nodes:");
		System.out.println(subscriptions.toString());
		System.out.println("");
		
	}
	
	public void getSubscriptionFromNode(String nodeName) throws XMPPException{
		
		LeafNode node = mgr.getNode(nodeName);
		List<Subscription> subscription = node.getSubscriptions();
		System.out.println("Abonennten von "+nodeName+":");
		System.out.println(subscription.toString());
		System.out.println("");
		
	}
	
	public void addMessage(String Id, String nodeName) throws XMPPException {
		LeafNode node = mgr.getNode(nodeName);
		node.publish(new Item(Id));
		System.out.println("Item wurde erzeugt");
		System.out.println("");
		
	}
	
	public void deleteMessage(String Id, String nodeName) throws XMPPException {
		LeafNode node = mgr.getNode(nodeName);
		node.deleteItem(Id);
		System.out.println("Item wurde gelöscht");
		System.out.println("");
		
	}
	
	public void printMessage(String nodeName, int Id) throws XMPPException{
		LeafNode node = (LeafNode) mgr.getNode(nodeName);
		System.out.println(node.getItems(node.getSubscriptions().get(0).getId()).get(Id));

	}
	
	public void printAllMessagesFromNode(String nodeName) throws XMPPException{
		
		LeafNode node = (LeafNode) mgr.getNode(nodeName);
		System.out.println("Alle Messages von "+nodeName+":");
		for(int i=0;i<node.getItems().size();i++){
			
			System.out.println(node.getItems(node.getSubscriptions().get(0).getId()).get(i));
		
		}
		System.out.println("");

	}

	public void addPayloadMessage(String Id, String nodeName, String titel, String datum, String uhr, int preis) throws XMPPException {
		
		LeafNode node = (LeafNode) mgr.getNode(nodeName);
		SimplePayload payload = new SimplePayload("Schnaeppchen", null, "<schnaeppchen><item><push kategorie=\"" + nodeName + "\" titel=\"" + titel + "\" datum=\"" + datum + "\" uhr=\"" + uhr + "\" preis=\"" + preis + "\"></push></item></schnaeppchen>");
		PayloadItem<SimplePayload> item = new PayloadItem<SimplePayload>(Id, payload);
		node.publish(item);
		System.out.println("Item wurde erzeugt");
		
	}
	
	public List<String> getNodes() throws XMPPException{
		
		ServiceDiscoveryManager sdMgr;
		sdMgr = ServiceDiscoveryManager.getInstanceFor(connection);
		List<String> list = new ArrayList<String>();
		for (Iterator<DiscoverItems.Item> iterator = sdMgr.discoverItems("pubsub.localhost").getItems(); iterator.hasNext();) {
			DiscoverItems.Item item = (DiscoverItems.Item) iterator.next();
			list.add(item.getNode());
		}
		System.out.println("Verfügbare Nodes:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("");
		
		return list;
		
	}

}

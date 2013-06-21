package XMPP;

import org.jivesoftware.smack.XMPPException;

public class XMPPClient {

	private static String host="localhost";
	private static int port = 5222;
	
	private static String user="user1";
	private static String pass="wba";
	
	public static void main(String[] args) throws XMPPException {
		
		PubSub ps = new PubSub();
		
		ps.connect(host, port, user, pass);
		
		//ps.createNode("test2", false);
		//ps.deleteNode("Elektronik");
		
		//ps.getNodes();
		
		//ps.subscribe("Elektronik");
		//ps.getSubscriptionFromNode("Elektronik");
		//ps.isSubscriberof("Elektronik");
		
		//ps.subscribe("Elektronik");
		//ps.unsubscribe("Elektronik");
		
		//ps.getAllSubscriptions();
		//ps.getSubscriptionFromNode("test2");
		
		//ps.addPayloadMessage("0", "Elektronik", "Fernseher", "12.11.2004", "14:44", "499" );
		//ps.addMessage("1", "test");
		//ps.printMessage("Elektronik", 2);
		//ps.deleteMessage("1", "TestKnotenSPL");
		//ps.printAllMessagesFromNode("Elektronik");
		//ps.deleteNode("Elektronik");
		
		//ps.createNode("Elektronik", true);
		//ps.createNode("Reisen", true);
		//ps.createNode("Kueche", true);
		//ps.createNode("Haushalt", true);
		//ps.createNode("Transportmittel", true);
		//ps.createNode("Spielzeug", true);
		//ps.createNode("Kleidung", true);
		//ps.createNode("Freizeit", true);
		//ps.createNode("Buecher", true);
		//ps.createNode("Diverse", true);
		
		ps.disconnect();
        
        
        

       

        // Publish an Item with the specified id
        //node.send(new Item("123abcd"));
        
     // Publish an Item with payload
       // node.send(new PayloadItem("test" + System.currentTimeMillis(), 
        //    new SimplePayload("book", "pubsub:test:book", "test bestanden")));
      //  List<Item> items = node.getItems("G2jgVp31cDAA1UnIOWUSETjrt33vA4s82BAzn0xh");
       // System.out.println(items);
	}
	
}

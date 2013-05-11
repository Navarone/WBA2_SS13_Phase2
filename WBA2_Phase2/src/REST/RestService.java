package REST;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import schnaeppchen.*;
import benutzer.*;

@Path( "/content" )
public class RestService
{
	
	//Schnaeppchen

   @GET 
   @Path("/schnaeppchen")
   @Produces("application/xml")
   public Schnaeppchenxyz getAllSchnaeppchen(@QueryParam("kategorie") String x) throws JAXBException, FileNotFoundException{
	   
	   Schnaeppchenxyz schnaeppchen = new Schnaeppchenxyz();
	   schnaeppchen.ObjectFactory ob = new schnaeppchen.ObjectFactory();
	   schnaeppchen= ob.createSchnaeppchenxyz();
	   JAXBContext context = JAXBContext.newInstance(Schnaeppchenxyz.class);
	   Unmarshaller um = context.createUnmarshaller();
	   schnaeppchen = (Schnaeppchenxyz) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/schnaeppchen/Schnaeppchen.xml"));
	   Schnaeppchenxyz rt = ob.createSchnaeppchenxyz();
	   if(x!=null){
		   for(int i=0; i<schnaeppchen.getSchnaeppchen().size(); i++){
			   if(schnaeppchen.getSchnaeppchen().get(i).getKategorie().equalsIgnoreCase(x)){
				   rt.getSchnaeppchen().add(schnaeppchen.getSchnaeppchen().get(i));
			   }
		   }
		   return rt;
	   }
	   
	   return schnaeppchen;
   }
   
   //Schnaeppchen/{id} 
   
   @GET 
   @Path("/schnaeppchen/{id}")
   @Produces("application/xml")
   public Schnaeppchenxyz getOneSchnaeppchen(@PathParam("id")int i) throws JAXBException, FileNotFoundException{
	   
	   Schnaeppchenxyz schnaeppchen = new Schnaeppchenxyz();
	   schnaeppchen.ObjectFactory ob = new schnaeppchen.ObjectFactory();
	   schnaeppchen= ob.createSchnaeppchenxyz();
	   JAXBContext context = JAXBContext.newInstance(Schnaeppchenxyz.class);
	   Unmarshaller um = context.createUnmarshaller();
	   schnaeppchen = (Schnaeppchenxyz) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/schnaeppchen/Schnaeppchen.xml"));
	   Schnaeppchenxyz rt = ob.createSchnaeppchenxyz();
	   for(int j = 0; j<schnaeppchen.getSchnaeppchen().size(); j++){
		   if(schnaeppchen.getSchnaeppchen().get(j).getID()==i)
			   rt.getSchnaeppchen().add(schnaeppchen.getSchnaeppchen().get(j));
	   }
		   return rt;
   }
   
   	@DELETE
	@Path("schnaeppchen/{id}")
	@Produces("application/xml")
	public Schnaeppchenxyz deleteOneSchnaeppchen(@PathParam("id")int i) throws JAXBException, IOException{
		
		schnaeppchen.ObjectFactory ob = new schnaeppchen.ObjectFactory();
		Schnaeppchenxyz schnaeppchen = ob.createSchnaeppchenxyz();
		JAXBContext context = JAXBContext.newInstance(Schnaeppchenxyz.class);
		Unmarshaller um = context.createUnmarshaller();
		schnaeppchen = (Schnaeppchenxyz) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/schnaeppchen/Schnaeppchen.xml"));
		Schnaeppchenxyz rt = ob.createSchnaeppchenxyz();
					
		rt.getSchnaeppchen().addAll(schnaeppchen.getSchnaeppchen());
		for(int j=0; j<schnaeppchen.getSchnaeppchen().size(); j++){
			if(schnaeppchen.getSchnaeppchen().get(j).getID()==i)
				rt.getSchnaeppchen().remove(schnaeppchen.getSchnaeppchen().get(j));
		}
		// Marshall content to XML-File.
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
		m.marshal(rt, System.out);
		
		Writer w = null;
		w = new FileWriter("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/schnaeppchen/Schnaeppchen.xml");
		m.marshal(rt, w);
		w.close();
		return rt;
	}
   
   //Benutzer
   
   @GET 
   @Path("/benutzer")
   @Produces("application/xml")
   public Benutzerprofile getAllBenutzer() throws JAXBException, FileNotFoundException{
	   
	   Benutzerprofile benutzer = new Benutzerprofile();
	   benutzer.ObjectFactory ob = new benutzer.ObjectFactory();
	   benutzer= ob.createBenutzerprofile();
	   JAXBContext context = JAXBContext.newInstance(Benutzerprofile.class);
	   Unmarshaller um = context.createUnmarshaller();
	   benutzer = (Benutzerprofile) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/benutzer/Benutzer.xml"));
	   return benutzer;
   }
   
   
   //Benutzer/{id}
   
   @GET 
   @Path("/benutzer/{id}")
   @Produces("application/xml")
   public Benutzerprofile getOneBenutzer(@PathParam("id")int i) throws JAXBException, FileNotFoundException{
	   
	   Benutzerprofile benutzer = new Benutzerprofile();
	   benutzer.ObjectFactory ob = new benutzer.ObjectFactory();
	   benutzer= ob.createBenutzerprofile();
	   JAXBContext context = JAXBContext.newInstance(Benutzerprofile.class);
	   Unmarshaller um = context.createUnmarshaller();
	   benutzer = (Benutzerprofile) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/benutzer/Benutzer.xml"));
	   Benutzerprofile rt = ob.createBenutzerprofile();
	   for(int j = 0; j<benutzer.getBenutzer().size(); j++){
		   if(benutzer.getBenutzer().get(j).getId()==i)
			   rt.getBenutzer().add(benutzer.getBenutzer().get(j));
	   }
	   
	   return rt;
   }
   
   	@DELETE
	@Path("benutzer/{id}")
	@Produces("application/xml")
	public Benutzerprofile deleteOneBenutzer(@PathParam("id")int i) throws JAXBException, IOException{
		
		benutzer.ObjectFactory ob = new benutzer.ObjectFactory();
		Benutzerprofile benutzer = ob.createBenutzerprofile();
		JAXBContext context = JAXBContext.newInstance(Benutzerprofile.class);
		Unmarshaller um = context.createUnmarshaller();
		benutzer = (Benutzerprofile) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/benutzer/Benutzer.xml"));
		Benutzerprofile rt = ob.createBenutzerprofile();
		
			
		rt.getBenutzer().addAll(benutzer.getBenutzer());
		for(int j=0; j<benutzer.getBenutzer().size(); j++){
			if(benutzer.getBenutzer().get(j).getId()==i)
				rt.getBenutzer().remove(benutzer.getBenutzer().get(j));
		}
		
		// Marshall content to XML-File.
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
		m.marshal(rt, System.out);
		
		Writer w = null;
		w = new FileWriter("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/benutzer/Benutzer.xml");
		m.marshal(rt, w);
		w.close();
		return rt;
	}
   
   
   //Benutzer/{id}/Schnaeppchen
   
   @GET 
   @Path("/benutzer/{id}/schnaeppchen")
   @Produces("application/xml")
   public Schnaeppchenxyz getSchnaeppchenFromBenutzer(@PathParam("id")int i) throws JAXBException, FileNotFoundException{
	   
	   
	   Schnaeppchenxyz schnaeppchen = new Schnaeppchenxyz();
	   schnaeppchen.ObjectFactory sob = new schnaeppchen.ObjectFactory(); 
	   schnaeppchen= sob.createSchnaeppchenxyz();
	   JAXBContext context = JAXBContext.newInstance(Schnaeppchenxyz.class);
	   Unmarshaller um = context.createUnmarshaller();
	   schnaeppchen = (Schnaeppchenxyz) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/schnaeppchen/Schnaeppchen.xml"));
	   Schnaeppchenxyz rt = sob.createSchnaeppchenxyz();
	   
	   for(int j = 0; j<schnaeppchen.getSchnaeppchen().size(); j++){
		   if(schnaeppchen.getSchnaeppchen().get(j).getBenutzer()==i)
			   rt.getSchnaeppchen().add(schnaeppchen.getSchnaeppchen().get(j));
	   }
	   
	   
	   return rt;
   }

 
}
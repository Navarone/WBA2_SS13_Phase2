package REST;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import schnaeppchen.*;

@Path( "/content" )
public class RestService
{
   @GET 
   @Path("/schnaeppchen")
   @Produces("application/xml")
   public Schnaeppchenxyz getAllSchnaeppchen() throws JAXBException, FileNotFoundException{
	   
	   Schnaeppchenxyz schnaeppchen = new Schnaeppchenxyz();
	   ObjectFactory ob = new ObjectFactory();
	   schnaeppchen= ob.createSchnaeppchenxyz();
	   JAXBContext context = JAXBContext.newInstance(Schnaeppchenxyz.class);
	   Unmarshaller um = context.createUnmarshaller();
	   schnaeppchen = (Schnaeppchenxyz) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/schnaeppchen/Schnaeppchen.xml"));
	   return schnaeppchen;
   }
   
   @GET 
   @Path("/schnaeppchen/{id}")
   @Produces("application/xml")
   public Schnaeppchenxyz getOneSchnaeppchen(@PathParam("id")int i) throws JAXBException, FileNotFoundException{
	   
	   Schnaeppchenxyz schnaeppchen = new Schnaeppchenxyz();
	   ObjectFactory ob = new ObjectFactory();
	   schnaeppchen= ob.createSchnaeppchenxyz();
	   JAXBContext context = JAXBContext.newInstance(Schnaeppchenxyz.class);
	   Unmarshaller um = context.createUnmarshaller();
	   schnaeppchen = (Schnaeppchenxyz) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/schnaeppchen/Schnaeppchen.xml"));
	   Schnaeppchenxyz rt = ob.createSchnaeppchenxyz();
	   rt.getSchnaeppchen().add(schnaeppchen.getSchnaeppchen().get(i+1));
	   return rt;
   }

 
}
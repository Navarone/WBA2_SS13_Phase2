package REST;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Time;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import schnaeppchen.*;
import schnaeppchen.Schnaeppchenxyz.Schnaeppchen;
import benutzer.*;
import benutzer.Benutzerprofile.Benutzer;

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
   /*++++++Problem mit Date und Time+++++++
   	@POST
	@Path("/schnaeppchen")
	@Produces("application/xml")
	public Schnaeppchenxyz createSchnaeppchen(	@FormParam("ID")int id,
												@FormParam("Titel")String titel,
												@FormParam("Benutzer")int benutzer,
												@FormParam("Kategorie")String kategorie,
												@FormParam("Bild")String bild,
												@FormParam("Markt")int markt,
												@FormParam("Preis")String preis,
												@FormParam("Waehrung")String waehrung,
												@FormParam("UVP")String uvp,
												@FormParam("Text")String text,
												@FormParam("Tag")XMLGregorianCalendar tag,
												@FormParam("Uhrzeit")XMLGregorianCalendar uhrzeit,
												@FormParam("KAutor")String kautor,
												@FormParam("KTag")XMLGregorianCalendar ktag,
												@FormParam("KUhrzeit")XMLGregorianCalendar kuhrzeit,
												@FormParam("KText")String ktext
											)throws JAXBException, IOException{
   		
   		Schnaeppchenxyz schnaeppchen = new Schnaeppchenxyz();
   		Schnaeppchen s = new Schnaeppchen();
   		
   		s.setID(id);
   		s.setTitel(titel);
   		s.setBenutzer(benutzer);
   		s.setKategorie(kategorie);
   		s.setBild(bild);
   		s.getMarkt().set(0, markt);
   		s.getPreise().setPreis(preis);
   		s.getPreise().setUVP(uvp);
   		s.getPreise().setWaehrung(waehrung);
   		s.setText(text);
   		s.getDatum().setTag(tag);
   		s.getDatum().setUhrzeit(uhrzeit);
   		s.getKommentare().getKommentar().get(0).setAutor(kautor);
   		s.getKommentare().getKommentar().get(0).setDatum(ktag);
   		s.getKommentare().getKommentar().get(0).setUhrzeit(kuhrzeit);
   		s.getKommentare().getKommentar().get(0).setText(ktext);
		
		schnaeppchen.ObjectFactory ob = new schnaeppchen.ObjectFactory();
		schnaeppchen = ob.createSchnaeppchenxyz();
		JAXBContext context = JAXBContext.newInstance(Schnaeppchenxyz.class);
		Unmarshaller um = context.createUnmarshaller();
		schnaeppchen = (Schnaeppchenxyz) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/schnaeppchen/Schnaeppchen.xml"));
		
		schnaeppchen.getSchnaeppchen().add(schnaeppchen.getSchnaeppchen().size(), s);

		
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
		m.marshal(schnaeppchen, System.out);
		
		Writer w = null;
		w = new FileWriter("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/schnaeppchen/Schnaeppchen.xml");
		m.marshal(schnaeppchen, w);
		w.close();
		
		return schnaeppchen;
		
	}*/
   
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
   
   	@POST
	@Path("/benutzer")
	@Produces("application/xml")
	public Benutzerprofile createSchnaeppchen(	@FormParam("ID")int id,
												@FormParam("Benutzername")String benutzername,
												@FormParam("Passwort")String passwort,
												@FormParam("Name")String name,
												@FormParam("Vorname")String vorname,
												@FormParam("Email")String email,
												@FormParam("Anmeldedatum")String datum,
												@FormParam("Strasse")String strasse,
												@FormParam("Hausnummer")int hausnummer,
												@FormParam("PLZ")int plz,
												@FormParam("Ort")String ort,
												@FormParam("AnzahlSchnaeppchen")int anzschn,
												@FormParam("GemeldeteSchnaeppchen")int gemschn,
												@FormParam("Bewertung")String bewertung
											)throws JAXBException, IOException, DatatypeConfigurationException{
  		
  		Benutzerprofile benutzer = new Benutzerprofile();
  		Benutzer b = new Benutzer();
  		
  		
  		b.setId(id);
  		b.setBenutzername(benutzername);
  		b.setPasswort(passwort);
  		b.setName(name);
  		b.setVorname(vorname);
  		b.setEMail(email);
  		b.setAnmeldedatum(datum);
  		b.getAdresse().setStrasse(strasse);
  		b.getAdresse().setHausnummer(hausnummer);
  		b.getAdresse().setPLZ(plz);
  		b.getAdresse().setOrt(ort);
  		b.setAnzahlSchnaeppchen(anzschn);
  		b.getGemeldeteSchnaeppchen().getSchnaeppchen().set(0, gemschn);
  		b.setBewertung(bewertung);
		
		benutzer.ObjectFactory ob = new benutzer.ObjectFactory();
		benutzer = ob.createBenutzerprofile();
		JAXBContext context = JAXBContext.newInstance(Benutzerprofile.class);
		Unmarshaller um = context.createUnmarshaller();
		benutzer = (Benutzerprofile) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/benutzer/Benutzer.xml"));
		
		benutzer.getBenutzer().add(benutzer.getBenutzer().size(), b);

		
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
		m.marshal(benutzer, System.out);
		
		Writer w = null;
		w = new FileWriter("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/benutzer/Benutzer.xml");
		m.marshal(benutzer, w);
		w.close();
		
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
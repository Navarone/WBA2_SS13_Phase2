package REST;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.List;

import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import schnaeppchen.*;
import schnaeppchen.Schnaeppchenxyz.Schnaeppchen;
import schnaeppchen.Schnaeppchenxyz.Schnaeppchen.Datum;
import schnaeppchen.Schnaeppchenxyz.Schnaeppchen.Kommentare;
import schnaeppchen.Schnaeppchenxyz.Schnaeppchen.Kommentare.Kommentar;
import schnaeppchen.Schnaeppchenxyz.Schnaeppchen.Preise;
import benutzer.*;
import benutzer.Benutzerprofile.Benutzer;
import benutzer.Benutzerprofile.Benutzer.Adresse;
import benutzer.Benutzerprofile.Benutzer.GemeldeteSchnaeppchen;

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
												@FormParam("Tag")String tag,
												@FormParam("Uhrzeit")String uhrzeit,
												@FormParam("KAutor")String kautor,
												@FormParam("KTag")String ktag,
												@FormParam("KUhrzeit")String kuhrzeit,
												@FormParam("KText")String ktext
											)throws JAXBException, IOException{
		
	   Schnaeppchenxyz schnaeppchen = new Schnaeppchenxyz();
	   Schnaeppchen s = new Schnaeppchen();
	   Preise p = new Preise();
	   Datum d = new Datum();
	   Kommentare ke = new Kommentare();
	   Kommentar k = new Kommentar();
		
	   s.setID(id);
	   s.setTitel(titel);
	   s.setBenutzer(benutzer);
	   s.setKategorie(kategorie);
	   s.setBild(bild);
	   s.getMarkt().add(markt);
	   p.setPreis(preis);
	   p.setUVP(uvp);
	   p.setWaehrung(waehrung);
	   s.setPreise(p);
	   s.setText(text);
	   d.setTag(tag);
	   d.setUhrzeit(uhrzeit);
	   s.setDatum(d);
	   k.setAutor(kautor);
	   k.setDatum(ktag);
	   k.setUhrzeit(kuhrzeit);
	   k.setText(ktext);
	   ke.getKommentar().add(k);
	   s.setKommentare(ke);
		
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
   
   @POST
   @Path("/schnaeppchen/{id}")
   @Produces("application/xml")
   public Schnaeppchenxyz PostSchnaeppchenId(	@PathParam("id")int i,
												@FormParam("Titel")String titel,
												@FormParam("Benutzer")int benutzer,
												@FormParam("Kategorie")String kategorie,
												@FormParam("Bild")String bild,
												@FormParam("Markt")int markt,
												@FormParam("Preis")String preis,
												@FormParam("Waehrung")String waehrung,
												@FormParam("UVP")String uvp,
												@FormParam("Text")String text,
												@FormParam("Tag")String tag,
												@FormParam("Uhrzeit")String uhrzeit,
												@FormParam("KAutor")String kautor,
												@FormParam("KTag")String ktag,
												@FormParam("KUhrzeit")String kuhrzeit,
												@FormParam("KText")String ktext
											)throws JAXBException, IOException{
		
	   Schnaeppchenxyz schnaeppchen = new Schnaeppchenxyz();
	   Kommentar k = new Kommentar();

	   schnaeppchen.ObjectFactory ob = new schnaeppchen.ObjectFactory();
	   schnaeppchen = ob.createSchnaeppchenxyz();
	   JAXBContext context = JAXBContext.newInstance(Schnaeppchenxyz.class);
	   Unmarshaller um = context.createUnmarshaller();
	   schnaeppchen = (Schnaeppchenxyz) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/schnaeppchen/Schnaeppchen.xml"));	
	   int id=0;
	   
	   for(int j=0; j<schnaeppchen.getSchnaeppchen().size(); j++){
		   if(schnaeppchen.getSchnaeppchen().get(j).getID()==i){
			   id=j;
		   }			   	
	   }
	   
	   if(titel!=null)
		   schnaeppchen.getSchnaeppchen().get(id).setTitel(titel);
	   if(benutzer!=0)
		   schnaeppchen.getSchnaeppchen().get(id).setBenutzer(benutzer);
	   if(kategorie!=null)
		   schnaeppchen.getSchnaeppchen().get(id).setKategorie(kategorie);
	   if(bild!=null)
		   schnaeppchen.getSchnaeppchen().get(id).setBild(bild);
	   if(markt!=0){
		   int msize=schnaeppchen.getSchnaeppchen().get(id).getMarkt().size();
		   schnaeppchen.getSchnaeppchen().get(id).getMarkt().add(msize,markt);
	   }
	   if(preis!=null)
		   schnaeppchen.getSchnaeppchen().get(id).getPreise().setPreis(preis);
	   if(uvp!=null)
		   schnaeppchen.getSchnaeppchen().get(id).getPreise().setUVP(uvp);
	   if(waehrung!=null)
		   schnaeppchen.getSchnaeppchen().get(id).getPreise().setWaehrung(waehrung);
	   if(text!=null)
		   schnaeppchen.getSchnaeppchen().get(id).setText(text);
	   if(tag!=null)
		   schnaeppchen.getSchnaeppchen().get(id).getDatum().setTag(tag);
	   if(uhrzeit!=null)
		   schnaeppchen.getSchnaeppchen().get(id).getDatum().setUhrzeit(uhrzeit);
	   if(kautor!=null||ktag!=null||kuhrzeit!=null||ktext!=null){
		   int ksize=schnaeppchen.getSchnaeppchen().get(id).getKommentare().getKommentar().size();
		   k.setAutor(kautor);
		   k.setDatum(ktag);
		   k.setUhrzeit(kuhrzeit);
		   k.setText(ktext);
		   schnaeppchen.getSchnaeppchen().get(id).getKommentare().getKommentar().add(ksize, k);
	   }
		
	   Marshaller m = context.createMarshaller();
	   m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	   m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
	   m.marshal(schnaeppchen, System.out);
		
	   Writer w = null;
	   w = new FileWriter("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/schnaeppchen/Schnaeppchen.xml");
	   m.marshal(schnaeppchen, w);
	   w.close();
		
	   return schnaeppchen;
		
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
   public Benutzerprofile createBenutzer(		@FormParam("ID")int id,
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
											)throws JAXBException, IOException{
  		
	   Benutzerprofile benutzer = new Benutzerprofile();
	   Benutzer b = new Benutzer();
	   Adresse a = new Adresse();
	   GemeldeteSchnaeppchen g = new GemeldeteSchnaeppchen();
	   
	   b.setId(id);
	   b.setBenutzername(benutzername);
	   b.setPasswort(passwort);
	   b.setName(name);
	   b.setVorname(vorname);
	   b.setEMail(email);
	   b.setAnmeldedatum(datum);
	   a.setStrasse(strasse);
	   a.setHausnummer(hausnummer);
	   a.setPLZ(plz);
	   a.setOrt(ort);
	   b.setAdresse(a);
	   b.setAnzahlSchnaeppchen(anzschn);
	   g.getSchnaeppchen().add(gemschn);
	   b.setGemeldeteSchnaeppchen(g);
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
   
   @POST
   @Path("/benutzer/{id}")
   @Produces("application/xml")
   public Benutzerprofile PostBenutzerId(		@PathParam("id")int i,
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
											)throws JAXBException, IOException{
  		
	   Benutzerprofile benutzer = new Benutzerprofile();
	   
	   benutzer.ObjectFactory ob = new benutzer.ObjectFactory();
	   benutzer = ob.createBenutzerprofile();
	   JAXBContext context = JAXBContext.newInstance(Benutzerprofile.class);
	   Unmarshaller um = context.createUnmarshaller();
	   benutzer = (Benutzerprofile) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/benutzer/Benutzer.xml"));
	   int id=0;
	   
	   for(int j=0; j<benutzer.getBenutzer().size(); j++){
		   if(benutzer.getBenutzer().get(j).getId()==i){
			   id=j;
		   }			   	
	   }
	   if(benutzername!=null)
		   benutzer.getBenutzer().get(id).setBenutzername(benutzername);
	   if(passwort!=null)
		   benutzer.getBenutzer().get(id).setPasswort(passwort);
	   if(name!=null)
		   benutzer.getBenutzer().get(id).setName(name);
	   if(vorname!=null)
		   benutzer.getBenutzer().get(id).setVorname(vorname);
	   if(email!=null)
		   benutzer.getBenutzer().get(id).setEMail(email);
	   if(datum!=null)
		   benutzer.getBenutzer().get(id).setAnmeldedatum(datum);
	   if(strasse!=null)
		   benutzer.getBenutzer().get(id).getAdresse().setStrasse(strasse);
	   if(hausnummer!=0)
		   benutzer.getBenutzer().get(id).getAdresse().setHausnummer(hausnummer);
	   if(plz!=0)
		   benutzer.getBenutzer().get(id).getAdresse().setPLZ(plz);
	   if(ort!=null)
		   benutzer.getBenutzer().get(id).getAdresse().setOrt(ort);
	   if(anzschn!=0)
		   benutzer.getBenutzer().get(id).setAnzahlSchnaeppchen(anzschn);
	   if(gemschn!=0){
		   int gemschnsize=benutzer.getBenutzer().get(id).getGemeldeteSchnaeppchen().getSchnaeppchen().size();
		   benutzer.getBenutzer().get(id).getGemeldeteSchnaeppchen().getSchnaeppchen().add(gemschnsize, gemschn);
	   }
	   if(bewertung!=null)
		   benutzer.getBenutzer().get(id).setBewertung(bewertung);
  		

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
   
   @POST
   @Path("/benutzer/{id}/schnaeppchen")
   @Produces("application/xml")
   public Benutzerprofile PostBenutzerIdSchnaeppchen(		@PathParam("id")int i,
															@FormParam("GemeldeteSchnaeppchen")int gemschn
														)throws JAXBException, IOException{
  		
	   Benutzerprofile benutzer = new Benutzerprofile();
	   
	   benutzer.ObjectFactory ob = new benutzer.ObjectFactory();
	   benutzer = ob.createBenutzerprofile();
	   JAXBContext context = JAXBContext.newInstance(Benutzerprofile.class);
	   Unmarshaller um = context.createUnmarshaller();
	   benutzer = (Benutzerprofile) um.unmarshal(new FileReader("/Users/FlorianWolf/git/WBA2_SS13_Phase2/WBA2_Phase2/src/benutzer/Benutzer.xml"));
	   int id=0;
	   
	   for(int j=0; j<benutzer.getBenutzer().size(); j++){
		   if(benutzer.getBenutzer().get(j).getId()==i){
			   id=j;
		   }			   	
	   }
	  
	   if(gemschn!=0){
		   int gemschnsize=benutzer.getBenutzer().get(id).getGemeldeteSchnaeppchen().getSchnaeppchen().size();
		   benutzer.getBenutzer().get(id).getGemeldeteSchnaeppchen().getSchnaeppchen().add(gemschnsize, gemschn);
	   }
	   
  		

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

 
}


package vvg_upup.jbpm_oms;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Login implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Korisnicko ime")
   private java.lang.String korisnickoIme;
   @org.kie.api.definition.type.Label("Zaporka")
   private java.lang.String zaporka;

   private java.lang.Long prijavaID;

   private java.lang.Boolean kontrola;

   public Login()
   {
   }

   public java.lang.String getKorisnickoIme()
   {
      return this.korisnickoIme;
   }

   public void setKorisnickoIme(java.lang.String korisnickoIme)
   {
      this.korisnickoIme = korisnickoIme;
   }

   public java.lang.String getZaporka()
   {
      return this.zaporka;
   }

   public void setZaporka(java.lang.String zaporka)
   {
      this.zaporka = zaporka;
   }

   public java.lang.Long getPrijavaID()
   {
      return this.prijavaID;
   }

   public void setPrijavaID(java.lang.Long prijavaID)
   {
      this.prijavaID = prijavaID;
   }

   public java.lang.Boolean getKontrola()
   {
      return this.kontrola;
   }

   public void setKontrola(java.lang.Boolean kontrola)
   {
      this.kontrola = kontrola;
   }

   public Login(java.lang.String korisnickoIme, java.lang.String zaporka,
         java.lang.Long prijavaID, java.lang.Boolean kontrola)
   {
      this.korisnickoIme = korisnickoIme;
      this.zaporka = zaporka;
      this.prijavaID = prijavaID;
      this.kontrola = kontrola;
   }

}
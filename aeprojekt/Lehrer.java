/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeprojekt;

/**
 *
 * @author Flo
 */
class Lehrer {
    private String Vorname;
    private String Nachname;
    private String Email;
    
    public Lehrer(String Vorname, String Nachname, String Email)
    {
      this.Vorname=Vorname;
      this.Nachname=Nachname;
      this.Email=Email;
    }
    public String getVorname(){
        return Vorname;
    }
    public String getNachname(){
        return Nachname;
    }
    public String getEmail(){
        return Email;
    }
}

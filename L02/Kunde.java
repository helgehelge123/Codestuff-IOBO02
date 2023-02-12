//toString Methode

package L02;
public class Kunde {
    
   
    //Attribute für Klasse
private String vorname;
private String nachname;
private int alter;

    
    // Konstruktor
public Kunde(String vorname, String nachname, int alter) {
    this.vorname = vorname;
    this.nachname = nachname;
    this.alter = alter;
}


//toString Methode
public String toString(){
    return "\n" + "Kunden-Objekt enthält folgende Daten: " + "Vorname: " + vorname + ", Nachname: " + nachname + " und ist so alt:" + alter +"\n";
}

//GEtters and Settersss
public String getVorname() {
    return vorname;
}

public void setVorname(String vorname) {
    this.vorname = vorname;
}

public String getNachname() {
    return nachname;
}

public void setNachname(String nachname) {
    this.nachname = nachname;
}

public int getAlter() {
    return alter;
}

public void setAlter(int alter) {
    this.alter = alter;
}
    
}

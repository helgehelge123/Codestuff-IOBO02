package L02;

//Erstellung Klasse
public class toStringTest{

    //Attribute der Klasse
    private String vorname;
    private String nachname;
    private int geld;
    
    //Construktor
    public toStringTest(String vorname, String nachname, int geld){
        this.vorname = vorname;
        this.nachname = nachname;
        this.geld = geld;
    }
    //Überschriebene toString Methode zur einfachen Ausgabe der Objekte
    @Override
    public String toString() {
        return "Enthält folgende daten: " + vorname + " " + nachname + " " + geld + ".";
    }


public static void main(String[] args){

    toStringTest tST1 = new toStringTest("helge", "Neumann", 1000);

    //Bei Nennung der Ausgabe eines Objektes ohne weitere Befehle wird toString impliziert. 
    System.out.println(tST1);
    System.out.println(tST1.toString());
}
    
}
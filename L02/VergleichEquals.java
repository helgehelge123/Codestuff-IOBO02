package L02;
public class VergleichEquals {
    

private int kundennummer;
private String name;

//Construktor mit Kundennumme rund Name
VergleichEquals(int kundennummer, String name){
    this.kundennummer = kundennummer;
    this.name = name;
}



//toString
@Override
    public String toString() {
        return "VergleichEquals [kundennummer=" + kundennummer + ", name=" + name + "]";
    }

//Getter/Setter
public void setKundennummer(int kundennummer){
    this.kundennummer = kundennummer;
}
public int getKundennummer(){
    return kundennummer;
}
public void setName(String name){
    this.name = name;
}
public String getName() {
    return name;
}


//Equals Methode
public boolean equals(VergleichEquals V){
    return ((V.kundennummer == this.kundennummer) && (V.name == this.name));
}

 public static void main(String[] args) {

    
   //Objekte erstellen, VE1 und 2 verschieden, VE3 =VE1
   
    VergleichEquals VE1 = new VergleichEquals(100004, "Neumann");
    VergleichEquals VE11 = new VergleichEquals(100004, "Neumann");
    VergleichEquals VE2 = new VergleichEquals(100005, "Neumann");
    VergleichEquals VE3 = VE1;

    //Testen mit Referenzen (ändert auch Person 1)
    //VE3.setName("Petersen");

    //Ausgabe Objekt über toString
    System.out.println(VE1);
    System.out.println(VE2);
    System.out.println(VE3);

    //Vergleich ob VE1=3 mit == funktioniert
    System.out.println("Vergleich Person mit Referenz VE1=VE3 und ==");
    System.out.println(VE1 == VE3);
    System.out.println("Vergleich Person mit selben Werten, aber ohne Referenz VE1 Werte = VE11 Werte und ==");
    System.out.println(VE1 == VE11);

    System.out.println("Vergleich mit equals: die gleichen Werte, verschiedene Objekte");
    System.out.println(VE1.equals(VE11));
    System.out.println("Vergleich mit equals: referenziertes Objekt von VE1 = VE3");
    System.out.println(VE1.equals(VE3));

}

}





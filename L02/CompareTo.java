package L02;
public class CompareTo implements Comparable<CompareTo>{

    private int breite;
    private int laenge;

    //Constructor
   public CompareTo ( int breite, int laenge) {
    this.breite = breite;
    this.laenge = laenge;
   }

    //Getters Setter
    public void setBreite( int breite){
        this.breite = breite;
    }
    public void setLaenge( int laenge){
        this.laenge = laenge;
    }
    public int getBreite(){
        return breite;
    }
    public int getLaenge(){
        return laenge;
    }


    public int berechneFlaeche(){
        return breite * laenge;
    }

    @Override
    public int compareTo(CompareTo c) {
        return berechneFlaeche() - c.berechneFlaeche();
    }
    
public static void main(String[] args){
CompareTo CT1 = new CompareTo(5, 6);
CompareTo CT2 = new CompareTo(5, 7);

if (CT1.compareTo(CT2) < 0) {
    System.out.println("kleiner");
} else if (CT1.compareTo(CT2) > 0){
    System.out.println("Groeßer");
} else {
    System.out.println("Gleich");
}
}  


    
}

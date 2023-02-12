//toString Methode

package L02;


public class OnlineShop {
    

    public static void main(String[] args){
        
        //Erstellung des Objektes k01
        L02.Kunde k1 = new L02.Kunde("Helge", "Neumann", 21);

        // Ausgabe Objekt k01 als String in Console
        System.out.println(k1.toString());

        //Ausgabe toString ohne friggin objekt.toString() stuff. direkte implizierung der toString Methode bei Objektausgabe
        //This is Magic
        L02.Kunde k2 = new L02.Kunde("dieter", "neumann", 70);

        System.out.println(k2);

    }

}

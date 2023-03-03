//Vergleichen mit ==
package L02;
public class VergleichenGleichGleich {
    
    private int zahl1;
    private int zahl2;
    private int zahl3;

    VergleichenGleichGleich(int zahl1, int zahl2, int zahl3){
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
        this.zahl3 = zahl3;
    }


    public static void main(String[] args){
        //Erstellung des ersten Objektes
        VergleichenGleichGleich vGG1 = new VergleichenGleichGleich(1, 1, 3);
        //Ausgabe Vergleich Zahl 1 und 2 und 3 von Objekt 1
        System.out.println("Test 1 innerhalb Objekt1");
        System.out.println(vGG1.zahl1 == vGG1.zahl2);
        System.out.println(vGG1.zahl1 == vGG1.zahl3);
        System.out.println(vGG1.zahl2 == vGG1.zahl3);

        //Erstellung Objekt 2 mit den selben Zahlen
        VergleichenGleichGleich vGG2 = new VergleichenGleichGleich(1, 1, 3);
        System.out.println("Test 2 objektübergreifend mit primitiven Datentypen");
        System.out.println(vGG1.zahl1 == vGG2.zahl1);
        System.out.println(vGG1.zahl2 == vGG2.zahl2);
        System.out.println(vGG1.zahl3 == vGG2.zahl3);

        //Vergleich Objekt anstelle des primitiven Datrensatzes.
        System.out.println("Vergleich ganzes (gleiches, nicht selbes) Objekt");
        System.out.println(vGG1 == vGG2);

    }

}

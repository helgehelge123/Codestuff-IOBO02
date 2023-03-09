package L02;

public class CompareAuto implements Comparable<CompareAuto> {
    
    private int baujahr;
    private float verbrauch;

    public CompareAuto (int baujahr, float verbrauch){
        this.verbrauch = verbrauch;
        this.baujahr = baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }
    public void setVerbrauch(float verbrauch) {
        this.verbrauch = verbrauch;
    }
    public int getBaujahr(){
        return baujahr;
    }
    public float getVerbrauch(){
        return verbrauch;
    }



    @Override
    public int compareTo(CompareAuto o) {
        int bj1 = baujahr - o.baujahr;
        return bj1;
    }
    public float compareToVerbrauch(CompareAuto o) {
        float v1 = verbrauch - o.verbrauch;
        return v1;
    }

    public static void main(String[] args){
        CompareAuto CA1 = new CompareAuto(2002, 6.2f);
        CompareAuto CA2 = new CompareAuto(2002, 7f);
    
    if (CA1.compareTo(CA2) > 0 ){
        if (CA1.compareToVerbrauch(CA2) < 0){
            System.out.println("CA1 ist neuer und verbraucht " + Math.abs(CA1.compareToVerbrauch(CA2)) + "l weniger");
        } else if (CA1.compareToVerbrauch(CA2) > 0){
            System.out.println("CA1 ist neuer und verbraucht " + Math.abs(CA1.compareToVerbrauch(CA2)) + "l mehr");
        } else {
            System.out.println("CA1 ist neuer und verbraucht gleich viel");
        }
    } else if (CA1.compareTo(CA2) < 0 ){
        if (CA1.compareToVerbrauch(CA2) < 0){
            System.out.println("CA1 ist älter und verbraucht " + Math.abs(CA1.compareToVerbrauch(CA2)) + "l weniger");
        } else if (CA1.compareToVerbrauch(CA2) > 0){
            System.out.println("CA1 ist älter und verbraucht " + Math.abs(CA1.compareToVerbrauch(CA2)) + "l mehr");
        } else {
            System.out.println("CA1 ist älter und verbraucht gleich viel");
        }
    } else {
        if (CA1.compareToVerbrauch(CA2) < 0){
            System.out.println("CA1 ist gleich alt und verbraucht " + Math.abs(CA1.compareToVerbrauch(CA2)) + "l weniger");
        } else if (CA1.compareToVerbrauch(CA2) > 0){
            System.out.println("CA1 ist gleich alt und verbraucht " + Math.abs(CA1.compareToVerbrauch(CA2)) + "l mehr");
        } else {
            System.out.println("CA1 ist gleich alt und verbraucht " + Math.abs(CA1.compareToVerbrauch(CA2)) + "l gleich viel");
        }
    }
    
    }

}

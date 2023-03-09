package L02;
public class HashCode {
    
private int nummer;
private String nachname;


    //Coinstruktor
HashCode(int nummer, String nachname){
    this.nummer = nummer;
    this.nachname = nachname;
}

// Getter/setter
public int getNummer(){
    return nummer;
}
public String getNachname(){
    return nachname;
}
public void setNummer(int nummer){
    this.nummer = nummer;
}
public void setNachname(String nachname){
    this.nachname = nachname;
}

//Override toString
@Override
    public String toString(){
        return "toString:" + " nummer: " + nummer + ", nachname: " + nachname;
    }
 
//Override hashCode()
@Override
    public int hashCode(){
        String s = nummer + nachname;
        return s.hashCode();
    }
    

public static void main(String[] args){

//Erstellung Objekt(e)
HashCode HC1 = new HashCode(1, "Hlege");
HashCode HC2 = new HashCode(1, "Hlege");
HashCode HC3 = new HashCode(2, "Dieter");
//Ausgabe Test toString
System.out.println("toString Objekt HC1:");
System.out.println(HC1);
System.out.println("Hashcode HC1 und HC2 mit gleichen werten:");
System.out.println(HC1.hashCode());
System.out.println(HC2.hashCode());
System.out.println("Hashcode HC3:");
System.out.println(HC3.hashCode());
System.out.println("Vergleich == Hashcodes HC1 und HC2 mit gleichen werten:");
System.out.println(HC1.hashCode() == HC2.hashCode());
System.out.println("Vergleich == Hashcodes HC1 und HC3 mit unterschiedlichen werten:");
System.out.println(HC1.hashCode() == HC3.hashCode());

    }


}

//Clonar un ArrayList en otro:

import java.util.ArrayList;

public class ejercicio16 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        System.out.println("ArrayList: " + al);
        ArrayList<String> al2 = (ArrayList<String>)al.clone();
        System.out.println("Clon: " + al2);
    }
}
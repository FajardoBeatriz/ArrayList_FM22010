//Vaciar un ArrayList

import java.util.ArrayList;

public class ejercicio17 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        System.out.println("ArrayList: " + al);
        al.clear();
        System.out.println("ArrayList después de vaciar: " + al);
    }
}
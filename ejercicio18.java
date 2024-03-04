//Comprobar si un ArrayList está vacío o no:

import java.util.ArrayList;

public class ejercicio18 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        System.out.println("ArrayList: " + al);
        System.out.println("¿El ArrayList está vacío? " + al.isEmpty());
        al.clear();
        System.out.println("ArrayList después de vaciar: " + al);
        System.out.println("¿El ArrayList está vacío? " + al.isEmpty());
    }
}
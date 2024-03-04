//Intercambiar dos elementos en el ArrayList:
//Entrada:
//Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
//Índice1: 0
//Índice2: 4
//Salida:
//Lista después del intercambio:
//Jigglypuff
//Charizard
//Bulbasaur
//Squirtle
//Pikachu

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio14 {
    public static void main (String[] args){
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Pikachu");
        nombres.add("Charizard");
        nombres.add("Bulbasaur");
        nombres.add("Squirtle");
        nombres.add("Jigglypuff");
        System.out.println("Nombres de Pokémon: " + nombres);
        Scanner sc = new Scanner(System.in);
        System.out.println("Índice1: ");
        int indice1 = sc.nextInt();
        System.out.println("Índice2: ");
        int indice2 = sc.nextInt();
        String temp = nombres.get(indice1);
        nombres.set(indice1, nombres.get(indice2));
        nombres.set(indice2, temp);
        System.out.println("Lista después del intercambio: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}

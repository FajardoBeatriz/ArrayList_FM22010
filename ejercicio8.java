//Ordenar el ArrayList:
//Entrada:
//Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio8 {
    public static void main(String[] args) {
        
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        Collections.sort(nombresPokemon);

        System.out.println("Lista ordenada:");
        for (String nombre : nombresPokemon) {
            System.out.println("\"" + nombre + "\"");
        }
    }
}

//Invertir los elementos en el ArrayList:
//Entrada:
//Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
//Salida:
//Lista después de invertir los elementos:
//"Jigglypuff"
//"Squirtle"
//"Bulbasaur"
//"Charizard"
//"Pikachu"

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio11 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>();
        pokemones.add("Pikachu");
        pokemones.add("Charizard");
        pokemones.add("Bulbasaur");
        pokemones.add("Squirtle");
        pokemones.add("Jigglypuff");
        System.out.println(pokemones);
        Collections.reverse(pokemones);
        System.out.println(pokemones);
    }
}
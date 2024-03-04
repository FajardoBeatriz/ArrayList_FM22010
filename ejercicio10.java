//Mezclar los elementos en el ArrayList:
//Entrada:
//Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
//Salida (una posible mezcla):
//Lista después de mezclar:
//"Charizard"
//"Squirtle"
//"Jigglypuff"
//"Pikachu"
//"Bulbasaur"

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio10 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>();
        pokemones.add("Pikachu");
        pokemones.add("Charizard");
        pokemones.add("Bulbasaur");
        pokemones.add("Squirtle");
        pokemones.add("Jigglypuff");
        System.out.println(pokemones);
        Collections.shuffle(pokemones);
        System.out.println(pokemones);
    }
}

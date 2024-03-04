//Crear un ArrayList, agregar nombres de Pokémon e imprima la colección:
//Entrada: 
//Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]

import java.util.ArrayList;

public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>();
        pokemones.add("Pikachu");
        pokemones.add("Charizard");
        pokemones.add("Bulbasaur");
        pokemones.add("Squirtle");
        pokemones.add("Jigglypuff");
        System.out.println(pokemones);
    }
}

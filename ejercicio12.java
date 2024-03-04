//Extraer una porción del ArrayList:
//Entrada:
//Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
//Índice de inicio: 1
//Índice de fin: 4
//Salida:
//Porción extraída:
//Charizard
//Bulbasaur
//Squirtle

import java.util.ArrayList;
import java.util.List;

public class ejercicio12 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>();
        pokemones.add("Pikachu");
        pokemones.add("Charizard");
        pokemones.add("Bulbasaur");
        pokemones.add("Squirtle");
        pokemones.add("Jigglypuff");
        System.out.println(pokemones);
        List<String> porcion = pokemones.subList(1, 4);
        System.out.println("Porción extraída:");
        for (String pokemon : porcion) {
            System.out.println(pokemon);
        }
    }
}
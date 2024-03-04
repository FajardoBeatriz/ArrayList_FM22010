//Actualizar un elemento del ArrayList con un elemento dado:
//Entrada:
//Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
//Pokémon a actualizar: "Charizard"
//Nuevo Pokémon: "Dragonite"
//Salida:
//Lista después de la actualización:
//"Pikachu"
//"Dragonite"
//"Bulbasaur"
//"Squirtle"
//"Jigglypuff"

import java.util.ArrayList;

public class ejercicio5 {
    public static void main(String[] args) {
        
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        
        String pokemonActualizar = "Charizard";
        
        String nuevoPokemon = "Dragonite";

        int indice = nombresPokemon.indexOf(pokemonActualizar);

        if (indice != -1) {
            nombresPokemon.set(indice, nuevoPokemon);
        } else {
            System.out.println("El Pokémon a actualizar no está en la lista.");
        }

        System.out.println("Lista después de la actualización:");
        for (String nombre : nombresPokemon) {
            System.out.println("\"" + nombre + "\"");
        }
    }
}

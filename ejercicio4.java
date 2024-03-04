//Recuperar un elemento de un índice especificado:
//Entrada:
//["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff", "Eevee", "Mewtwo", "Gyarados", "Snorlax", "Vulpix"]
//Índice especificado: 2 
//Salida:
//Pokémon en el índice 2: Bulbasaur

import java.util.ArrayList;

public class ejercicio4 {
    public static void main(String[] args) {
        ArrayList <String> pokemon = new ArrayList <String>();
        pokemon.add("Pikachu");
        pokemon.add("Charizard");
        pokemon.add("Bulbasaur");
        pokemon.add("Squirtle");
        pokemon.add("Jigglypuff");
        pokemon.add("Eevee");
        pokemon.add("Mewtwo");
        pokemon.add("Gyarados");
        pokemon.add("Snorlax");
        pokemon.add("Vulpix");

        int indice = 2;
        String pokemones = pokemon.get(indice);

        System.out.println("Pokémon en el índice " + indice + ": " + pokemones);
    }
    
}

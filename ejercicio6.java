//User
//Eliminar el tercer elemento del ArrayList:
//Entrada:
//Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
//Salida:
//Lista después de eliminar el tercer elemento:
//"Pikachu"
//"Charizard"
//"Squirtle"
//"Jigglypuff"

import java.util.ArrayList;

public class ejercicio6 {
    public static void main(String[] args) {
        // Lista inicial de nombres de Pokémon
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // Eliminar el tercer elemento (índice 2)
        nombresPokemon.remove(2);

        System.out.println("Lista después de eliminar el tercer elemento:");
        for (String nombre : nombresPokemon) {
            System.out.println("\"" + nombre + "\"");
        }
    } 
}

//Buscar un elemento en el ArrayList indicar si se encuentra y en qué posición:
//Entrada:
//Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"
//Elemento a buscar: “Squirtle”.

import java.util.ArrayList;

public class ejercicio7 {
    public static void main(String[] args) {
    
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        String elementoABuscar = "Squirtle";

        int indice = nombresPokemon.indexOf(elementoABuscar);
        if (indice != -1) {
            System.out.println("El elemento \"" + elementoABuscar + "\" se encuentra en la posición " + indice);
        } else {
            System.out.println("El elemento \"" + elementoABuscar + "\" no se encuentra en la lista");
        }
    }
}

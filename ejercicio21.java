//Reemplazar el segundo elemento de un ArrayList:
//Entrada:
//Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
//Nuevo Pokémon para reemplazar: "Venusaur"
//Salida:
//Lista después de reemplazar el segundo elemento:
//"Pikachu"
//"Venusaur"
//"Bulbasaur"
//"Squirtle"
//"Jigglypuff"

import java.util.ArrayList;

public class ejercicio21 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        String nuevoPokemon = "Venusaur";

        nombresPokemon.set(1, nuevoPokemon);

        System.out.println("Lista después de reemplazar el segundo elemento:");
        for (String nombre : nombresPokemon) {
            System.out.println(nombre);
        }
    }
}

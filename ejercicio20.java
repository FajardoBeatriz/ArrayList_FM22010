//Aumentar el tamaño de un ArrayList:
//Entrada:
//Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur"]
//Nuevo tamaño deseado: 5
//Salida:
//Lista después de aumentar el tamaño:
//Pikachu
//Charizard
//Bulbasaur
//null
//null

import java.util.ArrayList;

public class ejercicio20 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");

        int nuevoTamaño = 5;

        while (nombresPokemon.size() < nuevoTamaño) {
            nombresPokemon.add(null);
        }

        System.out.println("Lista después de aumentar el tamaño:");
        for (String nombre : nombresPokemon) {
            System.out.println(nombre);
        }
    }
}
//Reducir la capacidad de un ArrayList:
//Entrada:
//Nombres de Pokémon: ["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff"]
//Nueva capacidad deseada: 3
//Salida:
//Lista después de reducir la capacidad:
//"Pikachu"
//"Charizard"
//"Bulbasaur"

import java.util.ArrayList;

public class ejercicio19 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        int nuevaCapacidad = 3;

        while (nombresPokemon.size() > nuevaCapacidad) {
            nombresPokemon.remove(nombresPokemon.size() - 1);
        }

        System.out.println("Lista después de reducir la capacidad:");
        for (String nombre : nombresPokemon) {
            System.out.println(nombre);
        }
    }
}

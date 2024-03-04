//Unir dos ArrayLists:
//Entrada:
//Primer conjunto de Pokémon: ["Pikachu", "Charizard", "Bulbasaur"]
//Segundo conjunto de Pokémon: ["Squirtle", "Jigglypuff"]
//Salida:
//Lista resultante después de la unión:
//"Pikachu"
//"Charizard"
//"Bulbasaur"
//"Squirtle"
//"Jigglypuff"

import java.util.ArrayList;

public class ejercicio15 {
    public static void main (String[] args){
        ArrayList<String> nombres1 = new ArrayList<String>();
        nombres1.add("Pikachu");
        nombres1.add("Charizard");
        nombres1.add("Bulbasaur");
        ArrayList<String> nombres2 = new ArrayList<String>();
        nombres2.add("Squirtle");
        nombres2.add("Jigglypuff");
        nombres1.addAll(nombres2);
        System.out.println("Lista resultante después de la unión: ");
        for (String nombre : nombres1) {
            System.out.println(nombre);
        }
    }
}

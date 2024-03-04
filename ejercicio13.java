//Comparar dos ArrayLists:
//Entrada:
//Primer conjunto de Pokémon: ["Pikachu", "Charizard", "Bulbasaur"]
//Segundo conjunto de Pokémon: ["Bulbasaur", "Squirtle", "Jigglypuff"]
//Salida:
//¿Los conjuntos de Pokémon son iguales? No

import java.util.ArrayList;

public class ejercicio13 {
    public static void main(String[] args) {
        ArrayList<String> primerConjunto = new ArrayList<String>();
        primerConjunto.add("Pikachu");
        primerConjunto.add("Charizard");
        primerConjunto.add("Bulbasaur");
        ArrayList<String> segundoConjunto = new ArrayList<String>();
        segundoConjunto.add("Bulbasaur");
        segundoConjunto.add("Squirtle");
        segundoConjunto.add("Jigglypuff");
        if (primerConjunto.equals(segundoConjunto)) {
            System.out.println("¿Los conjuntos de Pokémon son iguales? Sí");
        } else {
            System.out.println("¿Los conjuntos de Pokémon son iguales? No");
        }
    }
}
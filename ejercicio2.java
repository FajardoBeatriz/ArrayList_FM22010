//Recorrer e imprimir todos los elementos en un ArrayList:
//Entrada: 
//["Pikachu", "Charizard", "Bulbasaur", "Squirtle", "Jigglypuff", "Eevee", "Mewtwo", "Gyarados", "Snorlax", "Vulpix"]
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J']

import java.util.ArrayList;

public class ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> pokemones = new ArrayList<>();
        pokemones.add("Pikachu");
        pokemones.add("Charizard");
        pokemones.add("Bulbasaur");
        pokemones.add("Squirtle");
        pokemones.add("Jigglypuff");
        pokemones.add("Eevee");
        pokemones.add("Mewtwo");
        pokemones.add("Gyarados");
        pokemones.add("Snorlax");
        pokemones.add("Vulpix");
        System.out.println(pokemones);
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        System.out.println(numeros);
        ArrayList<Character> letras = new ArrayList<>();
        for (char c = 'A'; c <= 'J'; c++) {
            letras.add(c);
        }
        System.out.println(letras);
    
    } 
}

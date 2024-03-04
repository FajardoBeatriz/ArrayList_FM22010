//Copiar un ArrayList en otro:

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayListOriginal = new ArrayList<>();

        System.out.println("Ingrese elementos al ArrayList (ingrese -1 para finalizar):");
        int elemento;
        while (true) {
            elemento = scanner.nextInt();
            if (elemento == -1) {
                break;
            }
            arrayListOriginal.add(elemento);
        }

        ArrayList<Integer> arrayListCopia = new ArrayList<>(arrayListOriginal);

        System.out.println("ArrayList original: " + arrayListOriginal);
        System.out.println("Copia del ArrayList: " + arrayListCopia);

        scanner.close();
    }
}
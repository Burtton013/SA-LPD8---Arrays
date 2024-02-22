package sa_lpd8_arrays;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

       
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa el número #" + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Array original:");
        mostrarArray(numeros);

        int[] numerosPrimosAlPrincipio = new int[10];
        int indicePrimos = 0;

        for (int i = 0; i < 10; i++) {
            if (esPrimo(numeros[i])) {
                numerosPrimosAlPrincipio[indicePrimos] = numeros[i];
                indicePrimos++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (!esPrimo(numeros[i])) {
                numerosPrimosAlPrincipio[indicePrimos] = numeros[i];
                indicePrimos++;
            }
        }

        System.out.println("Array con números primos al principio:");
        mostrarArray(numerosPrimosAlPrincipio);

        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);
        }
    }
}

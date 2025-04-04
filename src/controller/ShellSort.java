package controller;

public class ShellSort {

    public void sort(int[] arr, boolean ascendente) {
        int n = arr.length;
        int contadorGaps = 0;

        // gap /= 2 es gap = gap / 2
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Inserción
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                if (ascendente) {
                    while (j >= gap && arr[j - gap] > temp) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                        contadorGaps += 1;
                    }
                } else {
                    while (j >= gap && arr[j - gap] < temp) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                        contadorGaps += 1;
                    }
                }
                arr[j] = temp;
            }
            System.out.println(" * Contador: " + contadorGaps + " Cambios: " + gap + " * ");
            printArray(arr);
            contadorGaps = 0; 
        }
    }

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "");
        }
        System.out.println(" ");
    }
}

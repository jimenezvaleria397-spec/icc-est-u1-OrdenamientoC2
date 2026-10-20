public class Bubble {

    public int[] sort(int[] arreglo) {
        int cambios = 0;
        int comparaciones = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            System.out.println("Pasada " + i);
            boolean combinaciones = false;
            for (int j = 1; j < arreglo.length - i; j++) { // i es el numero de pasadas, por eso se resta al length del
                                                           // arreglo

                comparaciones++;
                // Comparacion de los elementos del arreglo
                if (arreglo[j - 1] > arreglo[j]) {
                    cambios++;
                    combinaciones = true; // Si es true, significa que hubo un cambio
                    // Intercambio de los elementos del arreglo
                    int aux = arreglo[j - 1]; // j -1 porque es el elemento anterior
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
            if (!combinaciones) {
                break; // Si no hubo cambios, significa que el arreglo ya esta ordenado
            }
            System.out.println("Comparaciones: " + comparaciones);
            System.out.println("Cambios: " + cambios);
        }
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
        return arreglo;
    }
}

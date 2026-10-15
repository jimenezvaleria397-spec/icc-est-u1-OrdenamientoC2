public class Bubble {

    public int[] sort(int[] arreglo ){
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 1; j < arreglo.length; j++) {
                //Comparacion de los elementos del arreglo
                if(arreglo[j -1] > arreglo[j]){
                    //Intercambio de los elementos del arreglo
                    int aux = arreglo[j -1]; // j -1 porque es el elemento anterior
                    arreglo[j -1] = arreglo[j];
                    arreglo[j] = aux;   
                }
            }
        }
        return null;
    }
}

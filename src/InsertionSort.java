public class InsertionSort {

    public void sort(int[] a) {
        System.out.println("------ Insertion sort ------");
        System.out.println("Arreglo Original");
        App.printArreglo(a);
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] < key) {
                a[j + 1] = a[j];
                j--;
            }
            if(j + 1 != i){
                System.out.println("el aux = " + key + " se inserta en pos " + (j +1));
            }
            a[j + 1] = key;
        }
        System.out.println("Ordenado Des");
        App.printArreglo(a);
    }
}
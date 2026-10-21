public class App {
    public static void main(String[] args) throws Exception {
        int [] original = {5, 6, 4, 1, 2 , 3};
        int [] b = original.clone();
        int [] c = original.clone();
        int [] d = original.clone();


        
        //int [] c = original;
        // Instancio la clase Bubble para llamar al metodo sort e importar 
        Bubble bubble = new Bubble();
        Selection selection = new Selection();
        InsertionSort insertion = new InsertionSort();
        //Ejecutar el codigo del archivo bubblle.java
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);
        // Ejecutar el codigo de selection.java
        printArreglo(c);
        selection.sort(c);
        System.out.println("Arreglo ordenado;");
        printArreglo(c);
        //Ejecturar el codigo de insertion.java
        System.out.println("Arreglo Original");
        printArreglo(d);
        insertion.sort(d);
        }
        //metodo que imprime el arreglo
        public static void printArreglo(int [] arr){
            for ( int i =  0; i < arr.length; i ++){
                System.out.print(arr[i] + " - ");
        }
         System.out.println();
    }    
}

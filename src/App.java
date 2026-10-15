public class App {
    public static void main(String[] args) throws Exception {
        int [] original = {5, 3, 4, 1, 2};
        int [] b = original.clone();
        //int [] c = original;
        // Instancio la clase Bubble para llamar al metodo sort e importar 
        Bubble bubble = new Bubble();
        //Ejecutar el codigo del archivo bubblle.java
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);
        }
        //metodo que imprime el arreglo
        public static void printArreglo(int [] arr){
            for ( int i =  0; i < arr.length; i ++){
                System.out.print(arr[i] + " - ");
        }
         System.out.println();

    }    
}

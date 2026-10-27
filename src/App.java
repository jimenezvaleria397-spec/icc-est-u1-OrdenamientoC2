import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjemplosPrimitivos();
        //runEjemplosObjetos();
        //runComparators();
        runComparatorObj2();
        runComparatorObj();
    }   
    private static void runComparators() {
        Integer[] original = {5, 6, 4 , 1 , 2, 3};
        //Arrays.sort ordena arreglos en su orden natural, Sirve solo para arreglos
        Arrays.sort(original);
        for(int i = 0; i < original.length; i ++){
            System.out.println(original[i]);
        }
        Arrays.sort(original,Comparator.reverseOrder());
        System.out.println("Reversa");
        for(int i = 0; i < original.length; i ++){
            System.out.println(original[i]);
    }
}

    private static void runEjemplosObjetos() {
        Estudiante e1 = new Estudiante("Juan", 10);
        Estudiante [] estudiantes = {e1, 
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 6.8)
        };
        Bubble bubble = new Bubble();
        System.out.println("Arreglo Original");
        printArregloEstudiantes(estudiantes);
        
        System.out.println("Ordenado");
        bubble.sortEstudiantes(estudiantes);
        printArregloEstudiantes(estudiantes);
    }
    public static void printArregloEstudiantes(Estudiante[] arr){
            for ( int i =  0; i < arr.length; i ++){
                System.out.print(arr[i] + " - ");
        }
         System.out.println();
    }

    public static void runEjemplosPrimitivos() {
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

    private static void runComparatorObj(){
        List<Integer> numeros = new ArrayList<>(List.of(5, 6, 4 , 1 , 2, 3));
        //Orden de menor a mayor:
        //1era manera;
        numeros.sort(Comparator.naturalOrder());
        //2da manera;
        numeros.sort(null);
        System.out.println(numeros);
        //Ordeno de mayor a menor 
        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);


    }
    private static void runComparator(){
        Integer[] original = {5, 6, 4 , 1 , 2, 3};


    }
    private static void runComparatorObj2(){ Estudiante e1 = new Estudiante("Juan" , 10);
    Estudiante[] estudiantes = {e1, 
        new Estudiante("Maria", 7),
        new Estudiante("Diego", 3.5),
        new Estudiante("Pedro", 6.8)


    };
    //Flecha es una funcion lambda, es una funcion anonima que se puede pasar como parametro a un metodo
    //Compara solo la nota de los estudiantes, no el nombre
    Comparator<Estudiante> compNota = Comparator.comparingDouble(e -> e.getNota());
    Arrays.sort(estudiantes, compNota);
    //Hafo un for para imprimir cada posicion del arreglo de estudiantes
    for(int i = 0 ; i < estudiantes.length; i ++){
        System.out.println(estudiantes[i]);

        List<Estudiante> listaEstudiantes = new ArrayList<>(List.of(e1, 
        new Estudiante("Maria", 7),
        new Estudiante("Diego", 3.5),
        new Estudiante("Pedro", 6.8)));
        //Ordeno esta lista por la nota 
        listaEstudiantes.sort(compNota);
        System.out.println(listaEstudiantes);
        
        }       
    }
}




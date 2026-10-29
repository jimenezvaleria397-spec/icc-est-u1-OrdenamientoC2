import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import models.Estudiante;

public class Comparators {

private List<Estudiante> estList;
private Estudiante[] estArray;

public  Comparators(){
    Estudiante e1 = new Estudiante("Juan", 10);
        Estudiante [] estudiantes = {e1, 
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 6.8),
            new Estudiante("Pedro", 7)
        };
        estArray = estudiantes;
        estList = new ArrayList<>(List.of(estArray));

        //Llamadas a los ejemplos
        ejemplo1();
        ejemplo2();
        ejemplo3();
        ejemplo4();
        ejemplo5();
        ejemplo6();
        ejemplo7();
        ejemplo8();
        ejemplo9();
        ejemplo10();

}
private void print(List<Estudiante> list){
    for(Estudiante e: list){
        System.out.println(e);
    }

}

public void ejemplo1(){
    System.out.println("-- > EJEMPLO 1");
    //Copiar el arreglo global
    List<Estudiante> lista = new ArrayList<>(estList);
    //Comparator -> Obj != 0
    Comparator<Estudiante> comparator = Comparator.comparingDouble(x -> x.getNota());
    lista.sort(comparator);
    //Imprimir
    print(lista);
}
public void ejemplo2(){
    System.out.println("-- > EJEMPLO 2");
    List<Estudiante> lista = new ArrayList<>(estList);
    Comparator<Estudiante> comparator = Comparator.comparingDouble (Estudiante:: getNota);
    lista.sort(comparator);
    print(lista);
}
public void ejemplo3(){
    System.out.println("-- > EJEMPLO 3");
    List<Estudiante> lista = new ArrayList<>(estList);
    Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante::getNota).reversed();
    lista.sort(comparator);
    print(lista);


}
public void ejemplo4(){
    System.out.println("-- > EJEMPLO 4");
    //Copiar el arreglo global
    List<Estudiante> lista = new ArrayList<>(estList);
    //Comparator -> Obj != 0
    Comparator<Estudiante> comparator = Comparator.comparing(Estudiante::getNota);
    lista.sort(comparator);
    //Imprimir
    print(lista);
}
/*Ordenar ´por nora ascendente
Comparator ompara dos Items
lamda */

public void ejemplo5(){
    System.out.println("-- > EJEMPLO 5");
    //Copiar el arreglo global
    List<Estudiante> lista = new ArrayList<>(estList);
    //Comparator -> Obj != 0
    Comparator<Estudiante> comparador = (e1,e2)->Double.compare(e1.getNota(), e2.getNota());
    lista.sort(comparador);
    //Imprimir
    print(lista);
}
//Ordenar nombre de forma ascendente
public void ejemplo6(){
    System.out.println("-- > EJEMPLO 6");
    //Copiar el arreglo global
    List<Estudiante> lista = new ArrayList<>(estList);
    //Comparator 
    Comparator<Estudiante> comparador = (e1,e2)->e1.getName().compareTo(e2.getName());
    lista.sort(comparador);
    //Imprimir
    print(lista);
}
//ORdenar por nombre DESCENDENTE
public void ejemplo7(){
    System.out.println("-- > EJEMPLO 7");
    //Copiar el arreglo global
    List<Estudiante> lista = new ArrayList<>(estList);
    //Comparator 
    Comparator<Estudiante> comparador = (e1,e2)->e1.getName().compareTo(e2.getName());
    lista.sort(comparador);
    //Imprimir
    print(lista);
}
//Ordenar por nombre y nota 
public void ejemplo8(){
    System.out.println("-- > EJEMPLO 8");
    //Copiar el arreglo global
    List<Estudiante> lista = new ArrayList<>(estList);
    //Comparator 
    Comparator<Estudiante> comparador = (e1,e2)->{
        int comp = Double.compare(e1.getNota(), e2.getNota());
        if(comp!= 0)
            return comp;
        return  e2.getName().compareTo(e1.getName());
    };
    lista.sort(comparador);
    //Imprimir
    print(lista);
}
public void ejemplo9(){
    System.out.println("-- > EJEMPLO 9");
    //Copiar el arreglo global
    List<Estudiante> lista = new ArrayList<>(estList);
    //Comparator 
    Comparator<Estudiante> comparador = Comparator.comparingDouble(Estudiante::getNota).thenComparing(Estudiante::getName);
    lista.sort(comparador);
    //Imprimir
    print(lista);
}
// Nota DESCENDENTE y nombre ASCENDENTE
//1Comparador lamda y 2comparador referencia
public void ejemplo10(){
    System.out.println("-- > EJEMPLO 8");
    //Copiar el arreglo global
    List<Estudiante> lista = new ArrayList<>(estList);
    //Comparator 
    Comparator<Estudiante> comparador = Comparator.<Estudiante>comparingDouble(e -> e.getNota()).reversed().thenComparing(Estudiante::getName);
    lista.sort(comparador);
    //Imprimir
    print(lista);
}
/*Nota ascendente y nombre descendente
sumar 2 putnos si la nota es menor que 7 
la nota axima permitaida es 10 
Comparator -> por valor calculado
1 comparador lamda con comparador lamda
2 comparador refereancia */
public void ejemplo11(){
    System.out.println("-- > EJEMPLO 8");
    //Copiar el arreglo global
    List<Estudiante> lista = new ArrayList<>(estList);
    //Comparator 
    Comparator<Estudiante> comparador = Comparator.<Estudiante>comparingDouble(e -> e.getNota()).reversed().thenComparing(Estudiante::getName);
    lista.sort(comparador);
    //Imprimir
    print(lista);
}
}

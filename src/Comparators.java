private List<Estudiantes> estList;
private Estudiante[] estArray;

public  Comparators(){
    Estudiante e1 = new Estudiante("Juan", 10);
        Estudiante [] estudiantes = {e1, 
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 6.8)
        };
        estList = new ArrayList<>(List.of(estArray));
}

public void ejemplo(){
    //Copiar el arreglo global
    List<Estudiante> lista = new ArrayList<>(estList);
    //Comparator -> Obj != 0
    Comparator<Estudiante> comparador = Comparator.comparinDouble(x -> x.getNota);
    lista.sort(Comparator);
    //Imprimir
}
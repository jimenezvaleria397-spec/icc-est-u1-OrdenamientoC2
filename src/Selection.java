public class Selection {
    public void sort(int [] arreglo) {
        int cambios = 0;
        int comparaciones = 0;
        System.out.println("====== Seleccion Sort Metodo =======");
        for(int i = 0 ; i < arreglo.length -1 ; i ++){
            
            int min = 0;
            for(int j= i +1; j < arreglo.length; j ++){
                comparaciones++;
                if(arreglo[j] < arreglo[min]){
                    min = j;
                }
            }
            if(min != i){
                int valor1 = arreglo[i];
                int valor2 = arreglo[min];
                int temp = arreglo[i];  
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
                cambios++;
            System.out.println("Pasada " + i + " | " + "Cambio " + valor1 + "<->" + valor2);
            } 
        }
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
    }
}

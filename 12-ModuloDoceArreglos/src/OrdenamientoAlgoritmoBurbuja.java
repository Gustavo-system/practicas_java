public class OrdenamientoAlgoritmoBurbuja {
    /*
        Algoritmo para ordenar un array de forma manual, a este metodo se le conoce como burbuja,
        es simple pero no muy optimizado
     */
    public static void main(String[] args) {
        String[] nombres = {"Chanchito", "Feliz", "Borreguito", "Triste", "Alegre", "Burbuja", "Algoritmo", "Ordenamiento"};

        int iteraciones = 0;
        int sizeArray = nombres.length;

        for (int i = 0; i < sizeArray; i++){
            for (int j = 0; j < sizeArray; j++){
                if(nombres[i].compareTo(nombres[j]) < 0){
                    String aux = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = aux;
                }
                iteraciones++;
            }
        }

        System.out.println("numero de iteraciones que se hacen para poder ordenar el array = " + iteraciones);

        for (String nombre : nombres) {
            System.out.println("nombre del array Nombres ordenado = " + nombre);
        }


        // metodo burbuja optimizado en las iteraciones
        int vueltas = 0;
        int sizeArrayNombres = nombres.length;

        for (int i = 0; i < sizeArrayNombres; i++){
            for (int j = 0; j < sizeArrayNombres-1-i; j++){
                if(nombres[j+1].compareTo(nombres[j]) < 0){
                    String aux = nombres[j];
                    nombres[j] = nombres[j+1];
                    nombres[j+1] = aux;
                }
                vueltas++;
            }
        }

        System.out.println("\nnumero de iteraciones optimizadas para ordenar el array = " + vueltas);

        for (String nombre : nombres) {
            System.out.println("nombre del array Nombres ordenado = " + nombre);
        }

    }
}

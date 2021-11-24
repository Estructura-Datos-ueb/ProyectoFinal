package co.edu.unbosque.model;

public class Ordenamiento {

    private Pelicula[] arreglo;

    public Ordenamiento(Pelicula [] n){
        arreglo = n;
    }

    public Pelicula[] sort(){
        Pelicula []tempArray = new Pelicula[arreglo.length];
        mergeSort(tempArray,0,arreglo.length-1);
        return arreglo;
    }

    /**
     * Metodo principal del algoritmo mergeSort, hace uso del metodo merge y hace uso de recursividad propia
     * <b>pre</b> se ha inicializado la clase<br>
     * <b>post</b>Se ordenaron los elementos correctamente<br>
     * @param lowerIndex: posicion inferior
     * @param upperIndex:  posicion superior
     */

    public void mergeSort(Pelicula []tempArray,int lowerIndex,int upperIndex){
        if(lowerIndex == upperIndex){
            return;
        }else{
            int mid = (lowerIndex+upperIndex)/2;
            mergeSort(tempArray, lowerIndex, mid);
            mergeSort(tempArray, mid+1, upperIndex);
            merge(tempArray,lowerIndex,mid+1,upperIndex);
        }
    }
    /**
     * Metodo principal del algoritmo mergeSort, hace uso del metodo merge y hace uso de recursividad propia
     * <b>pre</b> se ha inicializado la clase<br>
     * <b>post</b>Se ordenaron los elementos correctamente<br>
     * @param lowerIndexCursor: posicion inferior
     * @param higerIndex:  maximo valor que puede tomar el itrador
     * @param lowerIndexCursor:  iterador inferior
     * @param upperIndex: iterador superior
     */

    public void merge(Pelicula []tempArray,int lowerIndexCursor,int higerIndex,int upperIndex){
        int tempIndex=0;
        int lowerIndex = lowerIndexCursor;
        int midIndex = higerIndex-1;
        int totalItems = upperIndex-lowerIndex+1;
        while(lowerIndex <= midIndex && higerIndex <= upperIndex){
            if(Double.parseDouble(arreglo[lowerIndex].getPrecio().replace(",", "."))
                    > Double.parseDouble(arreglo[higerIndex].getPrecio().replace(",", "."))){
                tempArray[tempIndex++] = arreglo[lowerIndex++];
            }else{
                tempArray[tempIndex++] = arreglo[higerIndex++];
            }
        }

        while(lowerIndex <= midIndex){
            tempArray[tempIndex++] = arreglo[lowerIndex++];
        }

        while(higerIndex <= upperIndex){
            tempArray[tempIndex++] = arreglo[higerIndex++];
        }

        for(int i=0;i<totalItems;i++){
            arreglo[lowerIndexCursor+i] = tempArray[i];
        }
    }
}

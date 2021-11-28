package co.edu.unbosque.model;

public class ArbolBinario {
    private static String orden;
    protected NodoArbol raiz;

    public ArbolBinario() {
        raiz=null;
    }

    public ArbolBinario(NodoArbol raiz) {
        this.raiz = raiz;
    }
    public NodoArbol raizArbol(){
        return raiz;
    }
    public boolean arbolVacio(){
        return raiz==null;
    }

    public static  NodoArbol nuevoArbol(NodoArbol ramaIzq,Pelicula dato, NodoArbol ramaDcha){
        return  new NodoArbol(ramaIzq,dato,ramaDcha);
    }

    public static void preOrden(NodoArbol r){
        if(r != null){
            visitar(r.getDato());
            preOrden(r.getIzquierdo());
            preOrden(r.getDerecho());
        }
    }

    public static void inOrden(NodoArbol r){
        if(r != null){

            preOrden(r.getIzquierdo());
            visitar(r.getDato());
            preOrden(r.getDerecho());
        }
    }
    public static void postOrden(NodoArbol r){
        if(r != null){
            preOrden(r.getIzquierdo());
            preOrden(r.getDerecho());
            visitar(r.getDato());
        }
    }
    public static void visitar(Object dato){
        String p=orden+"";
        if(!p.equalsIgnoreCase("null")){
            orden= orden+""+dato+" , ";
        }else{
            orden= dato+" , ";
        }

    }

    // Function to print binary tree in 2D
// It does reverse inorder traversal
    public void print2DUtil(NodoArbol root, int space)
    {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += 10;

        // Process right child first
        print2DUtil(root.getDerecho(), space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = 10; i < space; i++)
            System.out.print(" ");
        System.out.print(root.getDato() + "\n");

        // Process left child
        print2DUtil(root.getIzquierdo(), space);
    }

    // Wrapper over print2DUtil()
    public void print2D(NodoArbol root)
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }

    public static String getOrden() {
        return orden;
    }

    public static void setOrden(String orden) {
        ArbolBinario.orden = orden;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }
}

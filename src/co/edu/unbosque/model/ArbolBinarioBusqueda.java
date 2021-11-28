package co.edu.unbosque.model;

public class ArbolBinarioBusqueda extends  ArbolBinario implements Comparador{
    public Comparador comparador;
    public String tipo;
    public ArbolBinarioBusqueda() {
        super();
    }

    public ArbolBinarioBusqueda(String tipo){
        this.tipo = tipo;
    }

    public NodoArbol buscar(Pelicula buscado){
        if(tipo.equalsIgnoreCase("titulo")){
            Pelicula elmBuscado= buscado;
            if(raiz==null){
                return null;
            }else{
                return localizar (raizArbol(),elmBuscado);
            }
        }

        return null;

    }
    protected NodoArbol localizar(NodoArbol raizSub, Pelicula elmBuscado){
        if(raizSub==null){
            return null;
        }else if (igualQue(raizSub.getDato(),elmBuscado)){
            return raizSub;
        }
        else if (menorQue(raizSub.getDato(),elmBuscado)){
            return localizar(raizSub.getIzquierdo(),elmBuscado);
        }else {
            return localizar(raizSub.getDerecho(),elmBuscado);
        }
    }

    public NodoArbol insertar(Pelicula valor )throws Exception{
        Pelicula elmInsert= valor;
        raiz = insertar(raiz, elmInsert);
        return raiz;
    }

    protected NodoArbol insertar(NodoArbol raizSub, Pelicula elmInsert)throws Exception{
        if(raizSub==null){
            raizSub = new NodoArbol(null,elmInsert,null);
        }else if(menorQue(raizSub.getDato(),elmInsert)){
            NodoArbol izq;
            if(raizSub.getIzquierdo()==null){
                izq = new NodoArbol(null,elmInsert,null);
                raizSub.setIzquierdo(izq);
            }else{
                insertar(raizSub.getIzquierdo(),elmInsert);
            }

        }else if(mayorQue(raizSub.getDato(),elmInsert)) {
            NodoArbol drch;
            if(raizSub.getDerecho()==null){
                drch = new NodoArbol(null,elmInsert,null);
                raizSub.setDerecho(drch);
            }else{
                insertar(raizSub.getDerecho(),elmInsert);
            }

        }else{
            throw new Exception("NodoArbol duplicado");
        }
        return raizSub;
    }



    @Override
    public boolean mayorQue(Pelicula q1, Pelicula q2) {
        try{
            if(tipo.equalsIgnoreCase("id")) {
                int val1 = Integer.parseInt(q1.getId());
                int val2 = Integer.parseInt(q2.getId());
                if (val2 > val1) {
                    return true;
                } else {
                    return false;
                }
            }else{
                String val1 = q1.getTitulo();
                String val2 = q2.getTitulo();

                if (val1.compareTo(val2) < 0) {
                    return  true;
                } else {
                    return  false;
                }

            }
        }catch (NumberFormatException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean menorQue(Pelicula q1, Pelicula q2) {
        try{
            if (tipo.equalsIgnoreCase("id")) {
                int val1 = Integer.parseInt(q1.getId());
                int val2= Integer.parseInt(q2.getId());
                if(val2<val1){
                    return true;
                }else {
                    return false;
                }
            }else{
                String val1 = q1.getTitulo();
                String val2 = q2.getTitulo();

                if (val1.compareTo(val2) < 0) {
                    return  false;
                } else {
                   return true;
                }
            }

        }catch (NumberFormatException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean menorIgualQue(Pelicula q) {
        return false;
    }

    @Override
    public boolean igualQue(Pelicula q1, Pelicula q2) {
        try{
            if (tipo.equalsIgnoreCase("id")) {
                int val1 = Integer.parseInt(q1.getId());
                int val2= Integer.parseInt(q2.getId());
                if(val2==val1){
                    return true;
                }else {
                    return false;
                }
            }else{
                String val1 = q1.getTitulo();
                String val2 = q2.getTitulo();

                if (val1.compareTo(val2) == 0) {
                    return  false;
                } else {
                    return true;
                }
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean mayorIgualQue(Pelicula q) {
        return false;
    }

    public void eliminar (Pelicula valor) throws Exception {
        Pelicula dato;
        dato = valor;
        raiz = eliminar(raiz, dato);
    }

    public NodoArbol eliminar (NodoArbol raizSub, Pelicula dato) throws Exception
    {
        if (raizSub == null)
            throw new Exception ("No encontrado el NodoArbol con la clave");
        else if (menorQue(raizSub.getDato(),  dato))
        {
            NodoArbol iz;
            iz = eliminar(raizSub.getIzquierdo(), dato);
            raizSub.setIzquierdo(iz);
        }else if (mayorQue(raizSub.getDato(), dato)) {
            NodoArbol dr;
            dr = eliminar(raizSub.getDerecho(), dato);
            raizSub.setDerecho(dr);
        }else{
            NodoArbol q;
            q = raizSub; // NodoArbol a quitar del árbol
            if (q.getIzquierdo() == null)
                raizSub = q.getDerecho();
            else if (q.getDerecho() == null)
                raizSub = q.getIzquierdo();
            else
            { // tiene rama izquierda y derecha
                q = reemplazar(q);
            }
            q = null;
        }
        return raizSub;
    }
    // método interno para susutituir por el mayor de los menores
    private NodoArbol reemplazar(NodoArbol act)
    {
        NodoArbol a, p;
        p = act;
        a = act.getIzquierdo(); // rama de NodoArbols menores
        while (a.getDerecho() != null)
        {
            p = a;
            a = a.getDerecho();
        }
        act.setDato(a.getDato());
        if (p == act)
            p.setDerecho(a.getIzquierdo());
        else
            p.setIzquierdo(a.getIzquierdo());
        return a;
    }


}

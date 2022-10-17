/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import modell.Producto;

/**
 *
 * @author JhOnUx
 */
public class ColaCircular {

    private int punteroInicial, punteroFinal, nDeDigitosAgregados, tamaño,p;
    private Producto[] misElementos;

    public ColaCircular(int tamaño) {
        this.tamaño = tamaño;
        this.misElementos = new Producto[this.tamaño+1]; // se agrega el tamaño de la cola circular
        /*inicializando los punteros*/
        this.punteroFinal = 0;
        this.punteroInicial = 0;
        this.nDeDigitosAgregados = 0;
    }

    public void agregarAcola(Producto p) {
        if (this.estaLlena() == false) {
            this.misElementos[calculaPosicionDeNuevoElemento()] = p;
            this.nDeDigitosAgregados++;
// reiniciar secuencia
            if (this.punteroFinal < this.tamaño) {
                this.punteroFinal++;
            } else {
                this.punteroFinal = 0;
            }
        }
    }

    public void sacarDeLaCola() {
        if (this.estaVacia() == false) {
            Producto numeroSacado = this.misElementos[this.punteroInicial];
            this.nuevaPosicionInicial();
            this.nDeDigitosAgregados--;
//            return numeroSacado;
        } else {
            System.out.println("No hay Datos");
        }
      //Producto Integer.MIN_VALUE;  //retorna el minimo valor que soporte los numeros enteros  
    }

    private void nuevaPosicionInicial() {
        this.punteroInicial = (this.punteroInicial + 1) % this.tamaño;
    }

    private int calculaPosicionDeNuevoElemento() {
        return (this.punteroInicial + this.nDeDigitosAgregados) % this.tamaño;
    }

    private boolean estaVacia() {
        return (this.nDeDigitosAgregados == 0); // si esta vacio devuelve true si esta lleno devuelve false
    }

    private boolean estaLlena() {
        return (this.nDeDigitosAgregados == this.tamaño);// si el numero de digitos agregados es igual al tamaño de la cola circular quiere decir que todo esta lleno y devolvera true caso contrario devolvera false
    }

//    public String imprimir() {
//       p=punteroInicial; String cadena="";
//       
//        if (this.estaVacia() == false) {
//            for (int i = this.punteroInicial; i < this.tamaño; i++) 
//                Producto [this.sacarDeLaCola()] ;
//            for (int i = 0; i < this.punteroFinal+1 && this.estaVacia()==false ; i++) 
//                System.out.println(this.sacarDeLaCola());  
//            }
//        }

    public int getPunteroInicial() {
        return punteroInicial;
    }

    public void setPunteroInicial(int punteroInicial) {
        this.punteroInicial = punteroInicial;
    }

    public int getPunteroFinal() {
        return punteroFinal;
    }

    public void setPunteroFinal(int punteroFinal) {
        this.punteroFinal = punteroFinal;
    }

    public int getnDeDigitosAgregados() {
        return nDeDigitosAgregados;
    }

    public void setnDeDigitosAgregados(int nDeDigitosAgregados) {
        this.nDeDigitosAgregados = nDeDigitosAgregados;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Producto[] getMisElementos() {
        return misElementos;
    }

    public void setMisElementos(Producto[] misElementos) {
        this.misElementos = misElementos;
    }

    
    
    
    
}

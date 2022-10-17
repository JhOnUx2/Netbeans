/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import controller.ColaCircular;


/**
 *
 * @author JhOnUx
 */
public class Cola_Circular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ColaCircular cc = new ColaCircular(8);
    cc.agregarAcola(10);
    cc.agregarAcola(20);
    cc.agregarAcola(30);
    cc.agregarAcola(40);
    cc.agregarAcola(50);
    cc.agregarAcola(60);
    cc.agregarAcola(70);
    cc.agregarAcola(80);
    
   cc.sacarDeLaCola();
//    
   cc.agregarAcola(90);
   cc.sacarDeLaCola();
   cc.agregarAcola(100);
//    cc.agregarAcola(2500);
//    cc.sacarDeLaCola();
//    cc.sacarDeLaCola();
//    cc.sacarDeLaCola();
//    cc.sacarDeLaCola();
//     cc.agregarAcola(5);
//      cc.agregarAcola(6);
//       cc.agregarAcola(9);
//        cc.agregarAcola(9);
     
    cc.imprimir();
        System.out.println(cc.getMisElementos()[0]);
        System.out.println(cc.getMisElementos()[1]);
    }
    
}

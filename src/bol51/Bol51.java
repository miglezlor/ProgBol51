
package bol51;

import java.util.Scanner;

/**
 *
 * @author miglezlor
 */
public class Bol51 {


    public static void main(String[] args) {

        Coche coche = new Coche ();
        int velocidade = 0;
        int menos = 0;
        Scanner obx=new Scanner(System.in);
        System.out.println("Introduzca a velocidade: ");
        velocidade=obx.nextInt();
        System.out.println("Introduzca a velocidade de deceleración: ");
        menos=obx.nextInt();
        
        coche.frenar(menos);
        System.out.println("Velocidade despois de frenar ="+coche.getVelocidade());
        
    }
    
}

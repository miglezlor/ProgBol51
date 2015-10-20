
package bol51;

import java.util.Scanner;

/**
 *
 * @author miglezlor
 */
public class Bol51 {


    public static void main(String[] args) {

        Coche coche = new Coche ();
        int v=0;

        Scanner obx=new Scanner(System.in);
        System.out.println("Introduzca a velocidade: ");
        v=obx.nextInt();

        coche.frenar(v);
        System.out.println("Velocidade= "+coche.getVelocidade());
        
    }
    
}

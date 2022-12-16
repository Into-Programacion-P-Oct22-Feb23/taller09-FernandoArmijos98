/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        double media;
        int suma = 0;
        int arreglos = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }

        media = (double) suma / arreglo.length;

        for (int i = 0; i < arreglo.length; i++) {
            arreglos = arreglo[i];
            if (arreglos > media) {
                elementosArribaMedia = elementosArribaMedia + 1;
            } else {
                if (arreglos < media) {
                    elementosAbajoMedia = elementosAbajoMedia + 1;
                }
            }
        }
        System.out.printf("La media es: %.2f\n los elementos que "
                + "estan por encima de la media son:%s\n Los elementos"
                + " que estan por debajo "
                + "de la media son:%s\n",
                media, elementosArribaMedia, elementosAbajoMedia);
    }

}

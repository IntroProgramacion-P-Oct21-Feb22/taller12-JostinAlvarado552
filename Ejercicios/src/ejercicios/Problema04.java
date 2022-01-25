/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] numero = {100, 90, 80, 70, 60};
        double[] potencia = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];
        String cadena_final = "";
        cadena_final = String.format("%sResultado de Potencias: \n", cadena_final);
        for (int i = 0; i < numero.length; i++) {
            resultado[i] = potencia(numero[i], potencia[i]);
            cadena_final = String.format("%s%.2f\n",
                    cadena_final, resultado[i]);
        }
        cadena_final = String.format("%sSuma obtenida de las potencias: \n%.2f\n",
                cadena_final, suma(resultado));
        System.out.printf("%s", cadena_final);
    }

    public static double potencia(double numero, double exponente) {
        if (exponente == 1) {
            return numero;
        } else {
            return numero * potencia(numero, exponente - 1);
        }
    }

    public static double suma(double[] arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++){
            suma = suma + arreglo[i];
        }
        return suma;
    }
    
}
    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaconrecursividad;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SumaConRecursividad {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numeroEntrada = new Scanner(System.in);
        int num;
        System.out.println("Digite un número: ");
        num = numeroEntrada.nextInt();
        int resultadoFinal = sumaConRecursividad(num);
        System.out.println("La suma del número dado es: " + resultadoFinal);
    }

    public static int sumaConRecursividad(int numero) {
        int resultado;
        if (numero == 1) {
            return 1;
        } else {
            resultado = numero + sumaConRecursividad(numero - 1);
        }
        return resultado;
    }
}

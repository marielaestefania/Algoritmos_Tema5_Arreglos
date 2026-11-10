/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invertirelementos;

import java.util.Scanner;

public class InvertirElementos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Numeros en orden inverso:");

        for (int i = 5; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

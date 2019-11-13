/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_N2;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor_inicio , cont_2,cont_1, valor_final;
        
        //entrada de dados 
        System.out.println();
        System.out.println("Informe o primeiro valor : ");
        valor_inicio = entrada.nextInt();
        cont_1 = valor_inicio;
        do {

            System.out.println("Informe o segundo valor : ");
            valor_final = entrada.nextInt();
            cont_2 = valor_final;
            //teste se o valor e menor que o primeiro 
            if (cont_2 <= cont_1) {
                System.out.println("=================================================");
                System.out.println("o segundo valor deve ser maior que o primeiro ");
            }
        } while (cont_2 <= cont_1);
        System.out.println("=================================================");
        while (cont_1 <= cont_2) {
           
                
            System.out.println(cont_1);
            cont_1++;
            System.out.println("=================================================");
        }

    }

}

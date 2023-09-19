/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculadoraorientadaaobjeto;

import java.util.Scanner;

/**
 *
 * @author elymar.8221
 */
public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();  
        Scanner scanner = new Scanner(System.in);
        
        float opcao; 
        
        Boolean continuar = true;
        
        String opcaoEscolha; 
        
        while(continuar){
                
            System.out.println("--------------CALCULADORA---------------");
            System.out.println("Selecione uma opcao: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.println("----------------------------------------");
            
            opcao = scanner.nextFloat();
            
            if(opcao == 1){
 
                System.out.println("Informe o primeiro numero: ");
                float numl = scanner.nextFloat();
                
                System.out.println("Informe o segundo numero: ");
                float num2 = scanner.nextFloat();
                
                System.out.println("---------RESULTADO DA SOMA---------");
                System.out.println(calculadora.somar(numl, num2));
            }else if(opcao == 2){

                System.out.println("Informe o primeiro numero: ");
                float numl = scanner.nextFloat();
                
                System.out.println("Informe o segundo numero: ");
                float num2 = scanner.nextFloat();
                
                System.out.println("-------RESULTADO DA SUBTRACAO-------");
                System.out.println(calculadora.subtrair(numl, num2));
            }else if(opcao == 3){
            
                System.out.println("Informe o primeiro numero: ");
                float numl = scanner.nextFloat();
                
                System.out.println("Informe o segundo numero: ");
                float num2 = scanner.nextFloat();
                
                System.out.println("------RESULTADO DA MULTIPLICACAO----");
                System.out.println(calculadora.multiplicar(numl, num2));
            }else if(opcao == 4){
            
                System.out.println("Informe o primeiro numero: ");
                float numl = scanner.nextFloat();
                
                System.out.println("Informe o segundo numero: ");
                float num2 = scanner.nextFloat();
                
                System.out.println("--------RESULTADO DA DIVISAO--------");               
                System.out.println(calculadora.dividir(numl, num2));
            }else{ 
                System.err.println("OPCAO INEXISTENTE");
            }
        }                                                      
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Informe o primeiro valor: ");
//        float num1 = scanner.nextFloat();
//        
//        System.out.println("Informe o segundo valor");
//        float num2 = scanner.nextFloat();
//        
//        calculadora.somar(num1, num2);
//        
//        System.out.println("===============RESULTADOS===============");
//        System.out.println("Resultado da soma: " + calculadora.somar(num1, num2));
//        System.out.println("Resultado da subtracao: " + calculadora.subtrair(num1, num2));
//        System.out.println("Resultado da multiplicacao: " + calculadora.multiplicar(num1, num2));
//        System.out.println("Resultado da divisao: " + calculadora.dividir(num1, num2));
    }      
}

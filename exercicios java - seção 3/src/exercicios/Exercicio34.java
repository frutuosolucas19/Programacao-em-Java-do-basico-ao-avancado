package exercicios;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lucas
 */
public class Exercicio34 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do raio da circunferência: ");
        double raio = Double.parseDouble(entrada.nextLine());

        double area = (Math.pow(raio, 2) * Math.PI);

        System.out.println("A àrea do circulo é igual a " + area);
    }
}

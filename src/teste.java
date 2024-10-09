/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikaro
 */
public class teste {

    public static void main(String[] args) {
        // objetos
        ValorNegativo excecaoNegativo = new ValorNegativo("Valor Negativo");
        ValorAlto excecaoMuitoAlto = new ValorAlto("Valor Alto");

        // Testando ValorNegativo
        try {
            excecaoNegativo.verificarValor(-10);  // exceção
        } catch (ValorNegativo e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        // Testando ValorAlto
        try {
            excecaoMuitoAlto.verificarValor(1500);  // exceção
        } catch (ValorAlto e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}

    
    

  

    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikaro
 */
public class ValorAlto extends Exception {
    public ValorAlto(String mensagem) {
        super(mensagem);
    }

    // Método que lança a exceção
    public void verificarValor(int valor) throws ValorAlto {
        if (valor > 100) {
            throw new ValorAlto("Valor muito alto: " + valor);
        }
    }
}

    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikaro
 */
public class ValorNegativo extends Exception {
    public ValorNegativo(String mensagem) {
        super(mensagem);
    }

    // Método                             throw é usado para customizar o erro
    public void verificarValor(int valor) throws ValorNegativo {
        if (valor < 0) {
            throw new ValorNegativo("Valor negativo: " + valor);
        }
    }
}

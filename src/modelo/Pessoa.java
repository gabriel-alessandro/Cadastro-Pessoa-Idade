
package modelo;

import java.util.concurrent.ExecutionException;

/**
 *
 * @author Gabriel Alessandro
 * @since 24/04/2018 - 13:43
 * @version 1.0 Beta Tempest
 */
public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int calcularIdade() throws ExecutionException {
        return idade * 12;
    }//fecha calcularIdade
    
    @Override
    public String toString() {
        return "Nome = " + nome 
               +"\nIdade = " + idade;
    }
}//fecha classe

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachorro;

/**
 *
 * @author ice
 */
public class Animal {
    private int idade;
    private String nome;

    public Animal() {
    }

    public Animal(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public void comer(){
        System.out.println("Estou comendo");
    }
    
    public void dormir(){
        System.out.println("Estou dormindo");
    }
    
    public void emitirSom(){
        System.out.println("Estou emitindo som");
    }
}

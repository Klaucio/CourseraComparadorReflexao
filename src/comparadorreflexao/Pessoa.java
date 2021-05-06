/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadorreflexao;

import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 *
 * @author Admin
 */
public class Pessoa {
    
    private String nome;
    private String sobreNome;
    private int idade;
    private String ocupacao;

    public Pessoa(String nome, String sobreNome, int idade, String ocupacao) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.ocupacao = ocupacao;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    @IgnorarNaComparacao
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }    

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobreNome=" + sobreNome + ", idade=" + idade + '}';
    }
}

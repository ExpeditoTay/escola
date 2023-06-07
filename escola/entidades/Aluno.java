
package com.mycompany.escola.entidades;

import java.util.Date;


public class Aluno {
    private int idade;
    private String nome;
    private char sexo;
    private String matricula;
    private Date anoDeIngresso; 

    public Aluno(int idade, String nome, char sexo, String matricula, Date anoDeIngresso) {
        this.idade = idade;
        
        this.nome = nome;
        
        this.sexo = sexo;
        
        this.matricula = matricula;
        
        this.anoDeIngresso = anoDeIngresso;
    }

    public Aluno() {
        this.idade = 0;
        this.nome = " ";
        this.sexo = 'm';
        this.matricula = "";
        this.anoDeIngresso = new Date();
}
    //GET SETTERS

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getAnoDeIngresso() {
        return anoDeIngresso;
    }

    public void setAnoDeIngresso(Date anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }
}
    


package com.mycompany.escola.entidades;


import java.util.ArrayList;
import java.util.List;


public class Disciplina {

    private static List<Aluno> ArrayList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nome;
    private int semestre;
    private String horario;
    private Professor professor;
    private List<Aluno> lstAluno;

    public Disciplina(String nome, int semestre, String horario) {
        this.nome = nome;
        this.semestre = semestre;
        this.horario = horario;
    }
    public Disciplina(){
        this.nome = "";
        this.semestre = 0;
        this.horario = "";
        this.professor =  new Professor();
        this.lstAluno = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getLstAluno() {
        return lstAluno;
    }

    public void setLstAluno(List<Aluno> lstAluno) {
        this.lstAluno = lstAluno;
         //implementar para remover aluno
        //this.lstAluno.add(e)
    }
    public static void main(String[] args) {
       Disciplina disciplina1 = new Disciplina();
       
       //CRIAR UMA LISTA DE ALUNOS
       List<Aluno> lstAluno = ArrayList();
       
       
       //CRIAR 5 ALUNOS
       Aluno aluno1 = new Aluno();
       aluno1.setNome("Expedito");
       Aluno aluno2 = new Aluno();
       aluno2.setNome("Lucas");
       Aluno aluno3 = new Aluno();
       aluno3.setNome("João");
       Aluno aluno4 = new Aluno();
       aluno4.setNome("Paulo");
       Aluno aluno5 = new Aluno();
       aluno5.setNome("Francisco");
       
       
       //ADICIONANDO ALUNO A LISTA
       lstAluno.add(aluno1);
       lstAluno.add(aluno2);
       lstAluno.add(aluno3);
       lstAluno.add(aluno4);
       lstAluno.add(aluno5);
       
       //ADICIONANDO A DISCIPLINA
       disciplina1.setLstAluno(lstAluno);
       
       
        
        
    }
}

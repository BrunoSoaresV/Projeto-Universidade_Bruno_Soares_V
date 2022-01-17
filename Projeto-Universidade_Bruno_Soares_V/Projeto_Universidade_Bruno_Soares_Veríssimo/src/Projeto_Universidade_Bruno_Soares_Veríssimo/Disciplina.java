package Projeto_Universidade_Bruno_Soares_Veríssimo;

import java.util.Scanner;

public class Disciplina {
    private long Codigo;
    private String Nome;
    private long carga_horaria;
    private Curso Curso = new Curso();
    private Professor Professor = new Professor();

    public long getCodigo() {
        return Codigo;
    }

    public void setCodigo(long Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public long getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(long carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public Curso getCurso() {
        return Curso;
    }

    public void setCurso(Curso Curso) {
        this.Curso = Curso;
    }

    public Professor getProfessor() {
        return Professor;
    }

    public void setProfessor(Professor Professor) {
        this.Professor = Professor;
    }

    @Override
    public String toString() {
        return "[ Código=" + Codigo + " Nome= " + Nome + " Carga Horária= " + carga_horaria + " Curso= " + Curso.getNome() + " Professor= " + Professor.getNome() + "]" ;
    }
    
    
}

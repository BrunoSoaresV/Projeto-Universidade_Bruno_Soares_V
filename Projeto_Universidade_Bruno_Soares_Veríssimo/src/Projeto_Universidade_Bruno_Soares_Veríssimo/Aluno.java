package Projeto_Universidade_Bruno_Soares_Veríssimo;

import java.util.Scanner;
import javax.swing.JTextField;

public class Aluno {
private String Nome;
private String Matricula;
private String CPF;

public Aluno() {
        
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "[ Nome= " +  Nome + " Matricula= " + Matricula + " CPF= " + CPF + "]";
    }
    
}

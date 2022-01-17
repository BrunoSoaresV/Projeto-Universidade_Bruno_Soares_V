package Projeto_Universidade_Bruno_Soares_Veríssimo;

import java.util.Scanner;

public class Funcionario {
    private String Nome;
    private String Endereco;
    private String Telefone;
    private String CPF;
    private String CTPS;
    private double Salario;
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCpf() {
        return CPF;
    }

    public void setCpf(String CPF) {
        this.CPF = CPF;
    }

    public String getCtps() {
        return CTPS;
    }

    public void setCtps(String CTPS) {
        this.CTPS = CTPS;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return "[Nome= " + Nome + " Endereco= " + Endereco + " Telefone= " + Telefone + " CPF= " + CPF + " CTPS= " + CTPS + " Salario= " + Salario + "]";
    }
    
}

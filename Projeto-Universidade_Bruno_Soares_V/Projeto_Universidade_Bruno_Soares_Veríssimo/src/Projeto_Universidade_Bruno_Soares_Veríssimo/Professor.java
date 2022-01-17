package Projeto_Universidade_Bruno_Soares_Veríssimo;

import java.util.Scanner;

public class Professor extends Funcionario
	{
    private String Titulacao;
    private String area_pesquisa;
    public Professor() {
    }
    public Professor(String Nome, String Endereco, String Telefone, String CPF, String CTPS, double Salario, String Titulacao, String area_pesquisa) 
    {
        this.Titulacao = Titulacao;
        this.area_pesquisa = area_pesquisa;
        super.setNome(Nome);
        super.setTelefone(Telefone);
        super.setCpf(CPF);
        super.setEndereco(Endereco);
        super.setSalario(Salario);
        super.setCtps(CTPS);
    }
    public String getTitulacao() {
        return Titulacao;
    }
    public void setTitulacao(String Titulacao) {
        this.Titulacao = Titulacao;
    }
    public String getArea_pesquisa() {
        return area_pesquisa;
    }
    public void setArea_pesquisa(String area_pesquisa) {
        this.area_pesquisa = area_pesquisa;
    }    
}
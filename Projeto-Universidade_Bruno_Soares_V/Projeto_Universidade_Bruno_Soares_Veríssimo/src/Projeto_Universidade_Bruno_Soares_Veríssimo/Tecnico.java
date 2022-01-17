package Projeto_Universidade_Bruno_Soares_Veríssimo;

import java.util.Scanner;

public class Tecnico extends Funcionario {
private String area_atuacao;
    public Tecnico(String Nome, String Endereco, String Telefone, String CPF, String CTPS, double Salario, String Text) {
        this.area_atuacao=area_atuacao;
        super.setNome(Nome);
        super.setTelefone(Telefone);
        super.setCpf(CPF);
        super.setEndereco(Endereco);
        super.setSalario(Salario);
        super.setCtps(CTPS);
    }
    public String getArea_atuacao() {
        return area_atuacao;
    }
    public void setArea_atuacao(String area_atuacao) {
        this.area_atuacao = area_atuacao;
    }
    
}
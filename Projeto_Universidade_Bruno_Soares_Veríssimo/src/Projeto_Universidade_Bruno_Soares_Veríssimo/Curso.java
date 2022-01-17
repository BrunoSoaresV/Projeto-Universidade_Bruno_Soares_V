package Projeto_Universidade_Bruno_Soares_Veríssimo;

import java.util.ArrayList;
import java.util.*;

public class Curso {
    private long Codigo; 
    private String Nome;
    private long Duracao;

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

    public long getDuracao() {
        return Duracao;
    }

    public void setDuracao(long Duracao) {
        this.Duracao = Duracao;
    }

    @Override
    public String toString() {
        return "[ Nome= " + Nome +" Código= " + Codigo + " Duração= " + Duracao + "]";
    }
    
}
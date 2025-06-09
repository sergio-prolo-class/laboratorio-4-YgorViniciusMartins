package domain.interno;

import domain.externo.Premium;

import java.util.HashSet;
import java.util.Set;

public class Senior extends CLT{
    private double bonificacao;
    private Set<Pleno> subordinados;
    private Set<Premium> representados;

    public Senior (String nome, String  cpf, String sobre_nome, double salario, int carga_horaria, String carteira_trabalho, Set<String> habilidades, double bonificacao, String... emails){
        super(nome,cpf,sobre_nome,salario,carga_horaria,carteira_trabalho,habilidades,emails);
        this.bonificacao = bonificacao;
        this.subordinados = new HashSet<>();
    }

    public boolean addSubordinado(Pleno subordinado){
        return subordinados.add(subordinado);
    }

    public boolean addRepresentado(Premium premium){
        return representados.add(premium);
    }
}

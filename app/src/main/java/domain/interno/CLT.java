package domain.interno;

import java.util.Set;

public class CLT extends Funcionario {
    private double salario;
    private int carga_horaria;
    private String carteira_trabalho;
    private Set<String> habilidades;


    public CLT(String nome, String  cpf, String sobre_nome,double salario, int carga_horaria, String carteira_trabalho, Set<String> habilidades, String... emails){
        super(nome,cpf,sobre_nome,emails);
        this.salario = salario;
        this.carga_horaria = carga_horaria;
        this.carteira_trabalho = carteira_trabalho;
        this.habilidades = habilidades;
    }
}

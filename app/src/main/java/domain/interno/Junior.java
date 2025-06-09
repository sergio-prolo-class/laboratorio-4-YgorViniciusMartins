package domain.interno;

import java.util.Set;

public class Junior extends CLT{
    private Pleno orientador;

    public Junior (String nome, String  cpf, String sobre_nome, double salario, int carga_horaria, String carteira_trabalho, Set<String> habilidades, String... emails){
        super(nome,cpf,sobre_nome,salario,carga_horaria,carteira_trabalho,habilidades,emails);
        this.orientador = null;
    }

    public void setOrientador(Pleno orientador){
        this.orientador = orientador;
    }
}

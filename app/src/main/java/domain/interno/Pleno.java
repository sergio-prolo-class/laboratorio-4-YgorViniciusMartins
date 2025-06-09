package domain.interno;

import java.util.HashSet;
import java.util.Set;

public class Pleno extends CLT{
    private final Set<Junior> orientados;
    private Senior chefe;

    public Pleno (String nome, String  cpf, String sobre_nome, double salario, int carga_horaria, String carteira_trabalho, Set<String> habilidades, String... emails){
        super(nome,cpf,sobre_nome,salario,carga_horaria,carteira_trabalho,habilidades,emails);
        this.orientados = new HashSet<>();
        this.chefe = null;
    }

    public boolean addOrientado(Junior junior){
        return orientados.add(junior);
    }

    public void setChefe(Senior chefe){
        this.chefe = chefe;
    }
}

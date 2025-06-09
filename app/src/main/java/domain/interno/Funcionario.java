package domain.interno;

import domain.Pessoa;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private static int countTotal;

    static {
        countTotal = 0;
    }

    private int id;
    private LocalDate data_inicio_contrato;

    public Funcionario(String nome, String  cpf, String sobre_nome, String... emails){
        super(nome,cpf,sobre_nome,emails);
        this.id = countTotal++;
        this.data_inicio_contrato = LocalDate.now();
    }

    @Override
    public boolean equals (Object o){
        if(!(o instanceof Funcionario f)) return false;
        return id == f.id;
    }

    @Override
    public int hashCode(){
        return id;
    }

}

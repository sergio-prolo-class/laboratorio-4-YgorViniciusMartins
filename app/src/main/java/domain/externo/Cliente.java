package domain.externo;

import domain.Pessoa;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    private static int countTotal;

    static {
        countTotal = 0;
    }

    private int id;
    private String endereco;
    private String telefone;
    private char genero;
    private LocalDate data_cadastro;

    public Cliente(String nome, String  cpf, String sobre_nome,String endereco, String telefone, char genero, String... emails){
        super(nome,cpf,sobre_nome,emails);
        this.endereco = endereco;
        this.telefone = telefone;
        this.genero = genero;
        this.data_cadastro = LocalDate.now();
        this.id = ++countTotal;
    }


}

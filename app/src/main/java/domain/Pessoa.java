package domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pessoa {
    private String nome;
    private String cpf;
    private String sobre_nome;
    private Set<String> emails;

    public Pessoa(String nome, String  cpf, String sobre_nome, String... emails){
        this.nome = nome;
        this.cpf = cpf;
        this.sobre_nome = sobre_nome;
        this.emails = new HashSet<>(Arrays.asList(emails));
    }

    public boolean setNome(String nome){
        if(nome.isEmpty()) return false;
        this.nome = nome;
        return true;
    }

    public boolean setCpf(String cpf){
        if(cpf.isEmpty()) return false;
        this.cpf = cpf;
        return true;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Pessoa p)) return false; //Se não for uma pessoa
        return cpf.equals(p.cpf); //se o cpf for igual
    }

    @Override
    public int hashCode(){
        return cpf.hashCode();
    }
}

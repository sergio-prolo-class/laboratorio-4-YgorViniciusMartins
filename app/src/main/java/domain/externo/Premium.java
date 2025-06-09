package domain.externo;

import domain.interno.Senior;

import java.time.LocalDate;

public class Premium extends Cliente {

    private double pagamento_mensal;
    private LocalDate data_inicio_premium;
    private Senior representante;

    public Premium(String nome, String  cpf, String sobre_nome,String endereco, String telefone, char genero,double pagamento_mensal, String... emails){
        super(nome,cpf,sobre_nome,endereco,telefone,genero,emails);
        this.pagamento_mensal = pagamento_mensal;
        this.data_inicio_premium = LocalDate.now();
        this.representante = null;
    }

    public void setRepresentante(Senior representante){
        this.representante = representante;
    }
}

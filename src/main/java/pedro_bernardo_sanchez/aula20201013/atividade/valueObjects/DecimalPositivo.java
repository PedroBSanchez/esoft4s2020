package pedro_bernardo_sanchez.aula20201013.atividade.valueObjects;

import javax.management.RuntimeErrorException;

public class DecimalPositivo {
    
    private double valor;


    public DecimalPositivo(double valor) {
        validaDecimalPositivo(valor);
        setValor(valor);


    }


    private void validaDecimalPositivo(double valor) {

        if (valor <= 0) {
            throw new RuntimeException("Valor não pode ser negativo nem nulo");
        }

        

    }


    public void setValor(double valor) {
        this.valor = valor;
    }



}

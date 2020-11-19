package pedro_bernardo_sanchez.aula20200901;

public class DecimalPositivo {
    
    double valor;

    public DecimalPositivo(double valor, String mensagemDeErro) {
        validacoes.excecaoSeMenorOuIgualZero(valor, mensagemDeErro);
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }


}

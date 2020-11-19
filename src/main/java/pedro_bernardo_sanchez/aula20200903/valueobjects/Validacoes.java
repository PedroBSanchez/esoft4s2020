package pedro_bernardo_sanchez.aula20200903.valueobjects;


public class Validacoes {
    


    public static void validaNome(String valor) {
        
        if (valor == null || valor.trim().length() == 0 || valor.trim().split(" ").length < 2) {
            throw new RuntimeException("Nome deve ter pelo menos duas palavras");
        }
    }



    public static void validaNomeFantasia(String valor) {
        
        if (valor == null || valor.trim().length() < 2) {
            throw new RuntimeException("Nome Fantasia deve ter pelo mais de um caracter");  
        }
    }


    public static void validaCpf(String valor) {

        if (!calculaCpf(valor)) {
            throw new RuntimeException("Número de CPF inválido");
        }
    }

    
    public static void validaCnpj(String valor) {
        if (!calculaCnpj(valor)) {
            throw new RuntimeException("Número de CNPJ inválido");
        }
    }









    private static boolean calculaCpf(String valor) {

        int [] numerosCpf;
        numerosCpf = new int[11];

        char [] arrayDeCaracteresCpf;
        arrayDeCaracteresCpf = valor.toCharArray(); //Método para passar os caracteres da String "valor" para o array

        
        int posicaoPrimeiroDigitoVerificador = 9;
        int posicaoSegundoDigitoVerificador = 10;


        //Variáveis para validar o resultado em relação ao primeiro e segundo digito
       double resultadoPrimeiroDigito = 0;
       double resultadoSegundoDigito = 0;  

        //Passa para o array int os números do cpf
        for (int posicao = 0; posicao < arrayDeCaracteresCpf.length; posicao++) { 

            numerosCpf[posicao] = Character.getNumericValue(arrayDeCaracteresCpf[posicao]);
        }


        /* Validação do primeiro dígito
            Primeiramente multiplica-se os 9 primeiros dígitos pela sequência decrescente de números de 10 
            à 2 e soma os resultados.
        */


        int posicaoNonoDigito = 8; 
        int multiplicador = 10;
        for (int posicao = 0; posicao <= posicaoNonoDigito; posicao++) {
            resultadoPrimeiroDigito += (numerosCpf[posicao] * multiplicador);
            multiplicador--;
        }

        //Deve ser igual ao primeiro digito verificador
        resultadoPrimeiroDigito = (resultadoPrimeiroDigito * 10) % 11; 
        
    


        /*  
            A validação do segundo dígito é semelhante à primeira, porém vamos considerar os 9 primeiros dígitos, 
            mais o primeiro dígito verificador, 
            e vamos multiplicar esses 10 números pela sequencia decrescente de 11 a 2.
        */

        int posicaoDecimoDigito = 9;
        multiplicador = 11;
        for (int posicao = 0; posicao <= posicaoDecimoDigito; posicao++) {
            resultadoSegundoDigito += multiplicador * numerosCpf[posicao];
            multiplicador--;
        }

        //Deve ser igual ao segundo digito verificador
        resultadoSegundoDigito = (resultadoSegundoDigito * 10) % 11;

        if (resultadoPrimeiroDigito != numerosCpf[posicaoPrimeiroDigitoVerificador] || resultadoSegundoDigito != numerosCpf[posicaoSegundoDigitoVerificador]) {
            return false;
        }
            
        return true;
    }





    private static boolean calculaCnpj(String valor) {

        int [] numerosCnpj;
        numerosCnpj = new int[14];


        char [] arrayDeCaracteresCnpj;
        arrayDeCaracteresCnpj = valor.toCharArray();

        int posicaoPrimeiroDigitoVerificador = 12;
        int posicaoSegundoDigitoVerificador = 13;


        double resultadoPrimeiroDigito = 0;
        double resultadoSegundoDigito = 0;

        int multiplicador;

        int posicao;

        for (posicao = 0; posicao < arrayDeCaracteresCnpj.length; posicao++) {
            numerosCnpj[posicao] = Character.getNumericValue(arrayDeCaracteresCnpj[posicao]);
        }


        
        /*  PRIMEIRO DÍGITO VERIFICADOR
                    
            Vamos começar alinhando os números que compõe o CNPJ com os algarismos 
            5,4,3,2,9,8,7,6,5,4,3 e 2
            Feito isso efetuaremos a multiplicação de cada uma das colunas
            Com os valores encontrados em cada uma das colunas efetuaremos o somatório
            o resto da divisão por 11 será responsável pelo cálculo do primeiro dígito verificador.
            Caso o resto da divisão seja menor que 2 o valor do dígito verificador passa a ser 0, 
            caso contrário subtraímos o valor de 11 para obter o dígito
        */

        multiplicador = 5;
        
        //posicaoPosPrimeiroDois = 4 -> na multiplação


        // Laço até o primeiro 2 (5 -> 2)
        for (posicao = 0; multiplicador >= 2; posicao++) {
            resultadoPrimeiroDigito += numerosCnpj[posicao] * multiplicador;
            multiplicador--;
        }


        multiplicador = 9;

        // Laço até o segundo 2 (9 -> 2)
        for (posicao = 4; multiplicador >= 2; posicao++) {
            resultadoPrimeiroDigito += numerosCnpj[posicao] * multiplicador;
            multiplicador--;
        }

        resultadoPrimeiroDigito = resultadoPrimeiroDigito % 11;

        if (resultadoPrimeiroDigito < 2) {
            resultadoPrimeiroDigito = 0;
        }
        else {
            resultadoPrimeiroDigito = 11 - resultadoPrimeiroDigito;
        }


        /*  SEGUNDO DÍGITO VERIFICADOR

            processo é semelhante a primeira etapa, a única mudança é a seqüência de números que serão alinhados
            na tabela, como a tabela ficou maior com a presença do dígito já calculado a seqüência agora 
            tem que ter mais um número e ficará assim: 
            6,5,4,3,2,9,8,7,6,5,4,3 e 2
            Com os valores encontrados em cada uma das colunas efetuaremos o somatório
            o resto da divisão por 11 será responsável pelo cálculo do primeiro dígito verificador.
            Caso o resto da divisão seja menor que 2 o valor do dígito verificador passa a ser 0, 
            caso contrário subtraímos o valor de 11 para obter o dígito

        */


        //posicaoPosPrimeiroDois = 5 -> na multiplicação

        multiplicador = 6;

        //Laço até o primeiro 2 (6 -> 2)
        for (posicao = 0; multiplicador >= 2; posicao++) {
            resultadoSegundoDigito += numerosCnpj[posicao] * multiplicador;
            multiplicador--;
        }

        multiplicador = 9;

        //Laço até o segundo 2 (9 -> 2)
        for (posicao = 5; multiplicador >= 2; posicao++) {
            resultadoSegundoDigito += numerosCnpj[posicao] * multiplicador;
            multiplicador--;
        }


        resultadoSegundoDigito = resultadoSegundoDigito % 11;

        if (resultadoSegundoDigito < 2) {
            resultadoSegundoDigito = 0;
        }
        else {
            resultadoSegundoDigito = 11 - resultadoSegundoDigito;
        }


        if  (resultadoPrimeiroDigito != numerosCnpj[posicaoPrimeiroDigitoVerificador] || resultadoSegundoDigito != numerosCnpj[posicaoSegundoDigitoVerificador]) {

                return false;
            }

        return true;
    }


}

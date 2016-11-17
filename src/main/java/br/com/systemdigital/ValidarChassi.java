package br.com.systemdigital;

public class ValidarChassi {
    public int validar(String chassi, int posicao) {
        if(chassi.charAt(posicao - 1) == '9') {
            return 2009;
        } else if(chassi.toUpperCase().charAt(posicao - 1) == 'A') {
          return 2010;
        } else if(chassi.toUpperCase().charAt(posicao - 1) == 'B') {
          return 2011;
        }

        throw new IllegalArgumentException("Valores incorretos!!!");
    }
}
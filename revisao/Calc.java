package revisao;

//import java.util.Arrays;

public class Calc {
    public int somar(int[] num) {
        int soma = 0;
        int i;
        for (i = 0; i < num.length; i++) {
            soma = soma + num[i];
        }

        return soma;
    }

}

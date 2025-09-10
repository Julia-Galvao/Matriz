import java.util.Random;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] m = new int[4][4];

        int somadiagprincipal = 0;
        int somadiagsegundaria = 0;


        //ler os dados
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = rd.nextInt(2, 30);
                System.out.print(m[i][j] + "\t");

                //verificar se estou na diagonal principal
                if (i == j) {
                    somadiagprincipal += m[i][j];
                }
                //verifica se estou na diagonal secundária
                if (i + j == m.length - 1){
                    somadiagsegundaria += m[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("\n soma da diagonal principal: " + somadiagprincipal);
        System.out.println("\n soma da diagonal secundária: " + somadiagsegundaria);
    }
}


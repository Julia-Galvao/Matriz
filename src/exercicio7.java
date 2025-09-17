import java.util.Random;

public class exercicio7 {
    public static void main(String[] args) {
        Random rd = new Random();
        int ordem = rd.nextInt(1, 6);
        int[][] matriz = new int[ordem][ordem];
        int aux, k ;
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = rd.nextInt(11);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        //troca dos elementos
        k = ordem - 1;
        for (int i = 0; i < ordem; i++){
            aux = matriz [i][i];
            matriz[i][i] = matriz [i][k];
            matriz[i][k] = aux;
            k--;

        }
        System.out.println();
        //impressão da matriz após a troca

            for (int i = 0; i < ordem; i++) {
                for (int j = 0; j < ordem; j++) {
                    System.out.print(matriz[i][j] + "\t");

                }
                System.out.println();
            }

        }
    }



import java.util.Random;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int totallinha, totalcoluna;

        System.out.print("Total de linhas --> ");
        totallinha = sc.nextInt();

        System.out.print("Total de linhas --> ");
        totalcoluna = sc.nextInt();

        int[][] m = new int[totallinha][totalcoluna];
        int[][] mt= new int[totalcoluna][totallinha];

        //gerar e imprimir a matriz m
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = rd.nextInt(15);
                mt[j][i]= m[i][j];
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        //impressão da matriz tranposta
        System.out.println();
        for (int i = 0; i < mt.length; i++){
            for (int j = 0; j < mt[i].length; j++){
                System.out.print(mt[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


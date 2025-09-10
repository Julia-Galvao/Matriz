import java.util.Random;

public class exercicio2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] m = new int[10][10];

        int maiorvalor = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = rd.nextInt(0, 26);
                System.out.print(m[i][j] + "\t");

                if (m[i][j] > maiorvalor) {
                    maiorvalor = m[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("maior valor = " +maiorvalor);
        //imprime a localização  do maior valor
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                if (m[i][j] == maiorvalor){
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }

    }
}
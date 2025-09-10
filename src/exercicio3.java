import java.text.DecimalFormat;
import java.util.Random;

public class exercicio3 {
    public static void main(String[] args) {
        Random rd = new Random();
        double[][] temperatura = new double[3][6];
        DecimalFormat df = new DecimalFormat("0.00°");
        double [] media = new double[temperatura.length];
        double aux;
        double maiormedia = Double.MIN_VALUE;
        double menormedia = Double.MAX_VALUE;
        int anoMaior = 0, anoMenor = 0;
        //gerando, armazenando e imprimindo os dados

        for (int i = 0; i < temperatura.length; i++){
            aux = 0;
            for (int j = 0; j < temperatura[i].length; j++){
                temperatura[i][j] = rd.nextDouble(5,38);
                System.out.print(df.format(temperatura[i][j]) + "\t");
                aux += temperatura[i][j];
            }
            System.out.println();
            media[i] = aux / temperatura[i].length;
            if(media[i] > maiormedia){
                maiormedia = media[i];
                anoMaior = i;
            }
            if (media[i] < menormedia){
                menormedia = media[i];
                anoMenor = i;
            }
        }
        System.out.println();
        for (int i = 0; i < media.length; i++){
            System.out.println("Ano " + (i + 1) + "--> " + df.format(media[i]));
        }
        //impressão do ano com maior e menor média
        System.out.println("Ano com a maior média de temperatura " + anoMaior);
        System.out.println("Ano com a menor média de temperatura " + anoMenor);

    }
}

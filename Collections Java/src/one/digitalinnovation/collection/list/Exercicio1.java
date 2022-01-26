package one.digitalinnovation.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        int count;
        double soma = 0.0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite a temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            soma += temp;
        }
        System.out.println("-----------------");

        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " "));

        double media = soma / 6;
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        System.out.print("Temperaturas acima da média e seus meses: ");

        count = 0;
        int index = 0;
        for (Double temp : temperaturas) {
            if (temp > media) {
                index =+ count++;
                switch (index) {
                    case 0:
                    System.out.println((index + 1) + " - JANEIRO: " + temp);
                    break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp);
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp);
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp);
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp);
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp);
                        break;
                    default:
                        System.out.println("Não se tem meses com temperaturas acima da média");
                        break;
                }
            }
        }
    }
}

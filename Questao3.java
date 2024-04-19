/*. Faça um programa que leia um número indeterminado de valores,
correspondentes a notas, encerrando a entrada de dados quando for
informado um valor igual a -1 (que não deve ser armazenado).
Após esta entrada de dados, faça:
Mostre a quantidade de valores que foram lidos;
Exiba todos os valores na ordem em que foram informados, um ao lado do
outro;
Exiba todos os valores na ordem inversa à que foram informados, um abaixo
do outro;
Calcule e mostre a soma dos valores;
Calcule e mostre a média dos valores;
Calcule e mostre a quantidade de valores acima da média calculada;
Calcule e mostre a quantidade de valores abaixo de sete;
Encerre o programa com uma mensagem. */
import java.util.Scanner;
import java.util.ArrayList;

public class Questao3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        
        System.out.println("Digite as notas (digite -1 para encerrar):");
        double nota = input.nextDouble();
        while (nota != -1) {
            notas.add(nota);
            nota = input.nextDouble();
        }

        System.out.println("Quantidade de valores lidos: " + notas.size());
        
        System.out.println("Valores informados:");
        for (Double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Valores informados em ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (Double n : notas) {
            soma += n;
        }
        System.out.println("Soma dos valores: " + soma);

        double media = soma / notas.size();
        System.out.println("Média dos valores: " + media);

        int acimaDaMedia = 0;
        for (Double n : notas) {
            if (n > media) {
                acimaDaMedia++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);

        int abaixoDeSete = 0;
        for (Double n : notas) {
            if (n < 7) {
                abaixoDeSete++;
            }
        }
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);

        System.out.println("Programa encerrado.");
        input.close();
    }
}

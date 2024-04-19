/*Utilizando listas faça um programa que faça 5 perguntas para uma pessoa
sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da
pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve
ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassino". Caso contrário, ele será classificado como "Inocente". */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Questao2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        int respostasPositivas = 0;

        for (String pergunta : perguntas) {
            System.out.println(pergunta + " (Responda 'sim' ou 'nao')");
            String resposta = input.nextLine().toLowerCase();
            if (resposta.equals("sim")) {
                respostasPositivas++;
            }
        }

        if (respostasPositivas == 2) {
            System.out.println("Você é considerado(a) SUSPEITO(A).");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Você é considerado(a) CÚMPLICE.");
        } else if (respostasPositivas == 5) {
            System.out.println("Você é considerado(a) ASSASSINO(A).");
        } else {
            System.out.println("Você é considerado(a) INOCENTE.");
        }

        input.close();
    }
}

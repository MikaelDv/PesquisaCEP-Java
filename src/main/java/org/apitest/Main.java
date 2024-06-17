package org.apitest;

import org.apitest.dto.EnderecoDto;
import org.apitest.servico.ApiServico;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerTxt = new Scanner(System.in);
        ApiServico teste = new ApiServico();
        boolean on = true;

        while (on) {
            System.out.println("*** CEP SEARCH ***\n");

            System.out.print("Digite o CEP: ");
            String cep = scannerTxt.nextLine();

            EnderecoDto enderecoDto = teste.getEndereco(cep);
            System.out.println(enderecoDto.toString());

            System.out.println("\nDeseja pesquisar por outro CEP? (Y/n)");

            try {
                String opc = scannerTxt.nextLine().toLowerCase();

                if (!opc.equals("y")) {
                    System.out.println("\nAté mais!");
                    on = false;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

package br.senai.sp.jandira.model;

import br.senai.sp.jandira.model.VooDelta;
import br.senai.sp.jandira.model.VooEmirates;
import br.senai.sp.jandira.model.VooGol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    List<Voo> listVoo = new ArrayList<>();

    public void executarMenu() {


        VooGol vooGol1 = new VooGol("GL-2530", "São Paulo", "Minas Gerais", "2023-11-05", 150);
        VooGol vooGol2 = new VooGol("GL-4965", "Ceara", "Alagoas", "2023-11-05", 150);
        VooGol vooGol3 = new VooGol("GL-4146", "Tocantins", "Manaus", "2023-11-05", 150);

        VooDelta vooDelta1 = new VooDelta("DL-1783", "São Paulo", "Italia", "2023-11-05", 150);
        VooDelta vooDelta2 = new VooDelta("DL-1786", "Qatar", "Florida", "2023-11-08", 150);
        VooDelta vooDelta3 = new VooDelta("DL- 4317", "Moscou", "Polonia", "2023-11-30", 150);

        VooEmirates vooEmirates1 = new VooEmirates("EM-1676", "São Paulo", "Recife", "2023-11-08", 150);
        VooEmirates vooEmirates2 = new VooEmirates("EM-9026", "Portugal", "Espanha", "2023-11-15", 150);
        VooEmirates vooEmirates3 = new VooEmirates("EM-0617", "França", "Madagascar", "2023-11-19", 150);

        listVoo.add(vooGol1);
        listVoo.add(vooGol2);
        listVoo.add(vooGol3);

        listVoo.add(vooDelta1);
        listVoo.add(vooDelta2);
        listVoo.add(vooDelta3);

        listVoo.add(vooEmirates1);
        listVoo.add(vooEmirates2);
        listVoo.add(vooEmirates3);


        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            System.out.println("/----- Bem-Vindo -----/");
            System.out.println("1- Listar Voo");
            System.out.println("2- Pesquisar Voo");
            System.out.println("3- Sair");
            System.out.println("------------------------");

            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser) {
                case 1:
                    listarVoos();
                    break;

                case 2:
                    System.out.println("Informe o número do Voo:");
                    String numeroVoo = scanner.nextLine();
                    pesquisarVoo(numeroVoo);
                    break;

                case 3:
                    continuar = false;
                    break;
            }

        }

    }

    public void listarVoos() {
        for (Voo voo : listVoo) {
            System.out.println(voo.getNumeroVoo());
            System.out.println(voo.getOrigem());
            System.out.println(voo.getDestino());
            System.out.println(voo.getDataPartida());
            System.out.println("-------------------------------");
        }

    }

    public void pesquisarVoo (String numeroVoo){
        for (Voo voo : listVoo) {
            String vooReal = voo.getNumeroVoo();
            if (vooReal.equalsIgnoreCase(voo.getNumeroVoo())) {
                System.out.println(voo.getNumeroVoo());
                System.out.println(voo.getOrigem());
                System.out.println(voo.getDestino());
                System.out.println(voo.getDataPartida());
                System.out.println("-------------------------------");
            }
        }
        System.out.println("Voo não encontrado...");
    }
}
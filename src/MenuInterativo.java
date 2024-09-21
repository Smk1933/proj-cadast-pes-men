import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contadorPessoas = 0; //numero pessoas cadastradas segundo array 0,1,2 (3 pessoas)
        int numeroMaxPessoas = 3;


        String[] novoAray = new String[numeroMaxPessoas];
        boolean continuar = true; // usar essa variavel de fator para parar ou nao a execucao do while na 3 opcao do switch


        while (continuar) {

            //MENU
            System.out.println("\n---------MENU-------- ");
            System.out.println("------1.CADASTRO-----");
            System.out.println("--2.LISTA DE CADASTRO--");
            System.out.println("--------3.SAIR--------");

            int opcaoMenu = scanner.nextInt();
            scanner.nextLine(); //LIMPA O BUFFER

            switch (opcaoMenu) {

                case 1:

                    if (contadorPessoas < numeroMaxPessoas) {
                        System.out.println("\nDigite o nome da pessoas");
                        String pegarNome = scanner.nextLine();
                        novoAray[contadorPessoas] = pegarNome;
                        System.out.println(novoAray[contadorPessoas] + " FOi CADASTRADO COM SUCESSO!!");
                        contadorPessoas ++;
                    } else {
                        System.out.println("Numero maximo de pessoas atinjido");
                    }
                    break;

                case 2:
                    if (contadorPessoas == 0){
                        System.out.println("Nenhum nome cadastrado");

                    } else {

                        System.out.println("Nomes cadastrados:");
                        for (int i = 0; i < contadorPessoas; i++) {
                            System.out.println((i + 1) + "." + novoAray[i]);
                        }
                    }
                    break;

                case 3:

                    System.out.println("Saindo em 3,2,1...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }


        }
        scanner.close();
    }
}

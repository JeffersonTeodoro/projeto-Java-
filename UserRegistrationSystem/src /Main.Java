import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<>();
        int option;

        do {
            System.out.println("\n=== Sistema de Cadastro de Usuários ===");
            System.out.println("1 - Cadastrar novo usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch(option) {
                case 1:
                    System.out.print("Digite o nome do usuário: ");
                    String name = scanner.nextLine();
                    users.add(name);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                case 2:
                    if(users.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                    } else {
                        System.out.println("Lista de usuários:");
                        for(int i = 0; i < users.size(); i++) {
                            System.out.println((i+1) + ". " + users.get(i));
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while(option != 0);

        scanner.close();
    }
}

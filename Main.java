import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        System.out.println("--- 🍔 SISTEMA DE PEDIDOS LANCHONETE ---");
        System.out.println("1. X-Burguer - R$ 15,00");
        System.out.println("2. X-Salada  - R$ 18,00");
        System.out.println("3. Batata    - R$ 10,00");
        System.out.print("\nDigite o número do pedido: ");
       
        int opcao = leitor.nextInt();
        double total = 0;

        // Lógica de Backend (Processamento do Pedido)
        switch (opcao) {
            case 1:
                total = 15.00;
                System.out.println("Pedido confirmado: X-Burguer!");
                break;
            case 2:
                total = 18.00;
                System.out.println("Pedido confirmado: X-Salada!");
                break;
            case 3:
                total = 10.00;
                System.out.println("Pedido confirmado: Batata!");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        if (total > 0) {
            System.out.printf("Valor Total a Pagar: R$ %.2f\n", total);
            System.out.println("Status: Enviado para a Cozinha.");
        }
       
        System.out.println("----------------------------------------");
    }
}

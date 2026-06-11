import java.util.Scanner;

// --- BASE CLASS (PARENT) ---
class FormaDePagamento {
    // Generic method to be overridden by subclasses
    public void processarPagamento(double valor) {
        System.out.println("Processando um pagamento generico no valor de: €" + valor);
    }
}

// --- SUBCLASS: CREDIT CARD (CHILD) ---
class CartaoCredito extends FormaDePagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    // Polymorphic method override focusing on Credit Card context
    @Override
    public void processarPagamento(double valor) {
        System.out.println("💳 [Cartao de Credito] Pagamento de €" + valor + " processado com sucesso!");
        System.out.println("Detalhes: Cobrado no cartao final (***" + 
                           numeroCartao.substring(Math.max(0, numeroCartao.length() - 4)) + ").");
    }
}

// --- SUBCLASS: PAYPAL (CHILD) ---
class PayPal extends FormaDePagamento {
    private String emailConta;

    public PayPal(String emailConta) {
        this.emailConta = emailConta;
    }

    // Polymorphic method override focusing on PayPal context
    @Override
    public void processarPagamento(double valor) {
        System.out.println("📲 [PayPal] Autenticando transacao segura no valor de: €" + valor);
        System.out.println("Sucesso: Fatura enviada para o e-mail cadastrado (" + this.emailConta + ").");
    }
}

// --- MAIN EXECUTION ENTRY POINT ---
public class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("         SISTEMA DE PAGAMENTOS           ");
        System.out.println("=========================================\n");

        System.out.print("Introduza o valor a ser pago (€): ");
        double valorTransacao = scanner.nextDouble();
        scanner.nextLine(); // Clear buffer

        System.out.println("\nFormas de Pagamento Disponiveis:");
        System.out.println("[1] Cartao de Credito");
        System.out.println("[2] PayPal");
        System.out.print("Selecione a opcao desejada: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        // Declaring the base class reference variable (Crucial for Polymorphism)
        FormaDePagamento pagamentoSelecionado;

        if (opcao == 1) {
            System.out.print("\nDigite o numero do Cartao de Credito: ");
            String numCartao = scanner.nextLine();
            // Instance polymorphism: assigning sub-object to parent type
            pagamentoSelecionado = new CartaoCredito(numCartao);
        } else if (opcao == 2) {
            System.out.print("\nDigite o e-mail da conta PayPal: ");
            String email = scanner.nextLine();
            // Instance polymorphism: assigning sub-object to parent type
            pagamentoSelecionado = new PayPal(email);
        } else {
            System.out.println("\n❌ Opcao Invalida! Usando gateway padrao.");
            pagamentoSelecionado = new FormaDePagamento();
        }

        System.out.println("\n================ PROCESSAMENTO ================");
        // Runtime Polymorphism: trigger correct method version dynamically based on instance type
        pagamentoSelecionado.processarPagamento(valorTransacao);
        System.out.println("===============================================");

        scanner.close();
    }
}

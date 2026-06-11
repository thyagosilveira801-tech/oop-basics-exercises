import java.util.Scanner;

// --- BASE CLASS (PARENT) ---
class Veiculo {
    // Protected attributes accessible within the class hierarchy
    protected String marca;
    protected int ano;

    // Base constructor mapping arguments to local fields
    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    // Standard presentation method to print baseline attributes
    public void apresentar() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano de Fabricacao: " + this.ano);
    }
}

// --- SUBCLASS: CARRO (CHILD) ---
class Carro extends Veiculo {
    private int numeroPortas;

    // Subclass constructor invoking the parent routine via 'super'
    public Carro(String marca, int ano, int numeroPortas) {
        super(marca, ano); // Leverages parent initialization logic
        this.numeroPortas = numeroPortas; // Binds local subclass state
    }

    // Specialized override to enrich presentation outputs
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Numero de Portas: " + this.numeroPortas);
    }
}

// --- SUBCLASS: MOTO (CHILD) ---
class Moto extends Veiculo {
    private String tipo; // e.g., Sport, Custom, Scooter

    // Subclass constructor mapping states through parent hooks
    public Moto(String marca, int ano, String tipo) {
        super(marca, ano);
        this.tipo = tipo;
    }

    // Specialized override to include dynamic motorcycle types
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Tipo de Moto: " + this.tipo);
    }
}

// --- MAIN EXECUTION ENTRY POINT ---
public class VehicleHierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("   SISTEMA DE HIERARQUIA DE VEICULOS     ");
        System.out.println("=========================================\n");

        // 1. Instantiating Car state components via User input
        System.out.println("--- REGISTAR CARRO ---");
        System.out.print("Digite a marca do carro: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Digite o ano do carro: ");
        int anoCarro = scanner.nextInt();
        System.out.print("Digite o numero de portas: ");
        int portasCarro = scanner.nextInt();
        scanner.nextLine(); // Clear scanner buffer

        Carro meuCarro = new Carro(marcaCarro, anoCarro, portasCarro);

        System.out.println("\n-----------------------------------------");

        // 2. Instantiating Moto state components via User input
        System.out.println("--- REGISTAR MOTO ---");
        System.out.print("Digite a marca da moto: ");
        String marcaMoto = scanner.nextLine();
        System.out.print("Digite o ano da moto: ");
        int anoMoto = scanner.nextInt();
        scanner.nextLine(); // Clear scanner buffer
        System.out.print("Digite o tipo da moto (Ex: Desportiva, Custom): ");
        String tipoMoto = scanner.nextLine();

        Moto minhaMoto = new Moto(marcaMoto, anoMoto, tipoMoto);

        // 3. Executing Display logic using polymorphism triggers
        System.out.println("\n================ RESUMO DOS VEICULOS ================");
        System.out.println("\n[ Informacoes do Carro ]");
        meuCarro.apresentar();

        System.out.println("\n[ Informacoes da Moto ]");
        minhaMoto.apresentar();
        System.out.println("=====================================================");

        scanner.close();
    }
}

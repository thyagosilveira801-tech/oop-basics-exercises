# --- CLASSE BASE (MÃE) ---
class Animal:
    # Construtor que aceita o nome do animal
    def __init__(self, nome: str):
        # Em Python, um sublinhado antes do nome (_nome) indica um atributo PROTEGIDO
        self._nome = nome 

    # Método genérico para emitir som
    def emitir_som(self):
        print(f"O animal {self._nome} emite um som genérico.")


# --- SUBCLASSES (FILHAS) QUE HERDAM DE ANIMAL ---

class Cao(Animal):
    # O Cão herda o construtor e o atributo _nome automaticamente de Animal
    
    # Método específico da classe Cao
    def latir(self):
        print(f"O cão {self._nome} está latindo: Au Au! 🐶")


class Gato(Animal):
    # O Gato herda o construtor e o atributo _nome automaticamente de Animal
    
    # Método específico da classe Gato
    def miar(self):
        print(f"O gato {self._nome} está miando: Miau! 🐱")


# --- PROGRAMA PRINCIPAL ---
def main():
    print("=========================================")
    print("    SISTEMA DE HIERARQUIA DE ANIMAIS     ")
    print("=========================================\n")

    # Criando o Cão com a interação do utilizador
    nome_cao = input("Dê um nome para o seu Cão: ").strip()
    # Criando a instância/objeto da classe Cao
    meu_cao = Cao(nome_cao) 
    
    print("-" * 40)

    # Criando o Gato com a interação do utilizador
    nome_gato = input("Dê um nome para o seu Gato: ").strip()
    # Criando a instância/objeto da classe Gato
    meu_gato = Gato(nome_gato)

    print("\n================ TESTANDO AS AÇÕES ================")
    
    # 1. Testando as ações do Cão
    print(f"\nAções do {meu_cao._nome}:")
    meu_cao.emitir_som() # Método herdado da classe base Animal
    meu_cao.latir()      # Método específico da subclasse Cao

    # 2. Testando as ações do Gato
    print(f"\nAções do {meu_gato._nome}:")
    meu_gato.emitir_som() # Método herdado da classe base Animal
    meu_gato.miar()       # Método específico da subclasse Gato

    print("===================================================")

if __name__ == "__main__":
    main()

import random
import time

# --- DEFINIÇÃO DA CLASSE CARRO ---
class Carro:
    # Membro de classe 'static' para rastrear o nome do carro vencedor globalmente
    vencedor = "Nenhum"

    # Método construtor (inicializa nome e velocidade)
    def __init__(self, nome: str, velocidade_maxima: int):
        self.nome = nome                  # Membro de instância
        self.velocidade_maxima = velocidade_maxima  # Membro de instância

    # Método para simular a corrida
    def correr(self):
        # Gera um tempo aleatório inversamente proporcional à velocidade máxima.
        # Carros mais rápidos têm maior probabilidade de terminar em menos tempo!
        # Usamos random.uniform para simular segundos com casas decimais.
        fator_sorte = random.uniform(0.8, 1.2)
        tempo_corrida = (100 / self.velocidade_maxima) * 10 * fator_sorte
        return round(tempo_corrida, 2)


# --- PROGRAMA PRINCIPAL ---
def iniciar_campeonato():
    # Criação dos carros disponíveis (pelo menos três diferentes)
    carro1 = Carro("Ferrari F8", 340)
    carro2 = Carro("Porsche 911", 310)
    carro3 = Carro("Lamborghini", 325)
    
    lista_carros = [carro1, carro2, carro3]

    print("=========================================")
    print(" 🏎️  SIMULADOR DE CORRIDA DE CARROS 🏎️ ")
    print("=========================================")

    while True:
        print("\nCarros disponíveis para o Grande Prémio:")
        for i, carro in enumerate(lista_carros, 1):
            print(f"[{i}] {carro.nome} (Velocidade Máxima: {carro.velocidade_maxima} km/h)")
        
        print("[0] Sair do Simulador")
        
        try:
            escolha = int(input("\nEscolha o seu carro pelo número para iniciar a corrida: "))
        except ValueError:
            print("Por favor, digite um número válido.")
            continue

        if escolha == 0:
            print("A desligar os motores... Até à próxima corrida!")
            break
        elif escolha < 1 or escolha > len(lista_carros):
            print("Opção inválida! Escolha um carro da lista.")
            continue

        carro_jogador = lista_carros[escolha - 1]
        print(f"\n🟢 Escolheu a {carro_jogador.nome}! Os motores estão a aquecer...")
        time.sleep(1)
        print("3... 2... 1... FAIXAS DE PARTIDA! 🏁")
        time.sleep(1)

        # Variáveis para controlo dos tempos da corrida atual
        menor_tempo = float('inf')
        nome_vencedor_atual = ""

        # Todos os carros correm na pista
        for carro in lista_carros:
            tempo = carro.correr()
            print(f"⏱️  {carro.nome} completou a pista em: {tempo} segundos.")
            
            # O carro com o MENOR tempo vence a corrida
            if tempo < menor_tempo:
                menor_tempo = tempo
                nome_vencedor_atual = carro.nome

        # Atualiza o membro STATIC da classe Carro com o grande vencedor
        Carro.vencedor = nome_vencedor_atual

        # Exibe os resultados finais
        print("\n================ FINAL DA CORRIDA ================")
        print(f"🏆 O VENCEDOR FOI: {Carro.vencedor}!")
        print(f"⏱️  Tempo do vencedor: {menor_tempo} segundos.")
        print("==================================================")
        
        # Feedback extra para o jogador
        if Carro.vencedor == carro_jogador.nome:
            print("🎉 Parabéns! O seu carro cruzou a meta em primeiro lugar!")
        else:
            print("❌ Não foi desta vez! O seu carro não conseguiu vencer.")

        input("\nPressione Enter para voltar ao menu e correr novamente...")

if __name__ == "__main__":
    iniciar_campeonato()

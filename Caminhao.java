public class Caminhao extends Veiculo {

    private int capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadeCarga) {
        super(marca, modelo, ano, 100); // Velocidade máxima de 100 km/h para caminhões
        this.capacidadeCarga = capacidadeCarga;
    }

    public void carregar(int peso) {
        if (capacidadeCarga - peso >= 0) {
            capacidadeCarga -= peso;
            System.out.println("Carga de " + peso + " kg adicionada com sucesso.");
        } else {
            System.out.println("Capacidade de carga excedida!");
        }
    }

    public void descarregar(int peso) {
        if (peso <= capacidadeCarga) {
            capacidadeCarga += peso;
            System.out.println("Carga de " + peso + " kg descarregada com sucesso.");
        } else {
            System.out.println("Peso a ser descarregado excede a capacidade atual.");
        }
    }

    @Override
    public void obterStatus() {
        super.obterStatus();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " kg");
    }
}

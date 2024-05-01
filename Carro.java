public class Carro extends Veiculo {

    private boolean arCondicionadoLigado;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano, 180); // Velocidade máxima de 180 km/h para carros
        this.arCondicionadoLigado = false;
    }

    public void ligarArCondicionado() {
        arCondicionadoLigado = true;
    }

    public void desligarArCondicionado() {
        arCondicionadoLigado = false;
    }

    @Override
    public void obterStatus() {
        super.obterStatus();
        System.out.println("Ar Condicionado: " + (arCondicionadoLigado ? "Ligado" : "Desligado"));
    }
}

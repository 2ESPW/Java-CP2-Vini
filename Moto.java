public class Moto extends Veiculo {

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano, 120); // Velocidade máxima de 120 km/h para motos
    }

    public void empinar() {
        if (velocidadeAtual > 20 && velocidadeAtual < 50) {
            System.out.println("Moto empinada!");
        } else {
            System.out.println("A moto precisa estar entre 20 e 50 km/h para empinar.");
        }
    }
}

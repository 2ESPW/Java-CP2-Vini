public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeMaxima;
    private int velocidadeAtual;

    public Veiculo(String marca, String modelo, int ano, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int incremento) {
        if (velocidadeAtual + incremento <= velocidadeMaxima) {
            velocidadeAtual += incremento;
        } else {
            System.out.println("Velocidade máxima excedida!");
        }
    }

    public void reduzirVelocidade(int decremento) {
        if (velocidadeAtual - decremento >= 0) {
            velocidadeAtual -= decremento;
        } else {
            velocidadeAtual = 0;
        }
    }

    public void obterStatus() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }

    // Getters and Setters omitidos para brevidade
}

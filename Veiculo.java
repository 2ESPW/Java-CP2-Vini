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

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        if (velocidadeMaxima > 0) {
            this.velocidadeMaxima = velocidadeMaxima;
        } else {
            System.out.println("Velocidade máxima deve ser um valor positivo!");
        }
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        if (velocidadeAtual >= 0 && velocidadeAtual <= velocidadeMaxima) {
            this.velocidadeAtual = velocidadeAtual;
        } else {
            System.out.println("Velocidade atual deve estar entre 0 e a velocidade máxima!");
        }
    }
}


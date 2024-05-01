public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Palio", 2020);
        Moto moto = new Moto("Honda", "CG 160", 2022);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2018, 1000);

        // Demonstração das funcionalidades do carro
        carro.acelerar(50);
        carro.obterStatus(); // Exibe o status do carro com ar desligado
        carro.ligarArCondicionado();
        carro.obterStatus(); // Exibe o status do carro com ar ligado

        // Demonstração das funcionalidades da moto
        moto.acelerar(30);
        moto.empinar(); // A moto não empinará pois a velocidade está fora do limite
        moto.acelerar(25);
        moto.empinar(); // Moto empinada!
        moto.obterStatus();

        // Demonstração das funcionalidades do caminhão
        caminhao.carregar(500);
        caminhao.obterStatus(); // Exibe o status do caminhão com carga
        caminhao.descarregar(200);
        caminhao.obterStatus(); // Exibe o status do caminhão com carga parcial
        caminhao.descarregar(400); // Excesso de peso na descarga
    }
}

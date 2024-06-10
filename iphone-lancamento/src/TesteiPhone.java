public class TesteiPhone {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 14", "Apple", "Preto");

        // Testando Reprodutor Musical
        System.out.println("=== Reprodutor Musical ===");
        meuIphone.tocar();
        meuIphone.selecionarMusica("Shape of You");
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        System.out.println("\n=== Aparelho Telefônico ===");
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        System.out.println("\n=== Navegador na Internet ===");
        meuIphone.exibirPagina("www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        // Exibindo Informações do iPhone
        System.out.println("\nInformações do iPhone: " + meuIphone);
    }
}
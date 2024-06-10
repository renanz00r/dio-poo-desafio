import ReprodutorMusical.ReprodutorMusical;
import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;


public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String fabricante;
    private String cor;

    // Construtor
    public iPhone(String modelo, String fabricante, String cor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
    }

  
   
    public void tocar() {
        System.out.println("Tocando música...");
    }

    
    public void pausar() {
        System.out.println("Pausando música...");
    }

   
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

  
   
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

   
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

  
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

   
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

   
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public String toString() {
        return "iPhone{" +
               "modelo='" + modelo + '\'' +
               ", fabricante='" + fabricante + '\'' +
               ", cor='" + cor + '\'' +
               '}';
    }
}

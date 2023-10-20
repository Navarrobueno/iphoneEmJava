import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Exemplo de uso do reprodutor musical

        int i = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("O que você deseja? 1 para musica, 2 para ligar, 3 para navegar?");
        i = scanner.nextInt();

        if(i ==1){

        meuIphone.tocar();
        meuIphone.selecionarMusica("Minha Música Favorita");
        meuIphone.pausar();
        }

        if(i==2){
        // Exemplo de uso do aparelho telefônico
        meuIphone.ligar("123-456-789");
        meuIphone.atender();
        meuIphone.iniciarConversaVoz();
        }

        if(i==3){
        // Exemplo de uso do navegador na Internet
        meuIphone.exibirPagina("https://www.tubovermelho.com");
        meuIphone.adicionarNovaAba("https://www.xvidros.com");
        meuIphone.atualizarPagina();
        }
    }
}
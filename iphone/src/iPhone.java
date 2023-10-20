public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Iniciando a reprodução de música no iPhone.");
        // Lógica real para iniciar a reprodução de música
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a reprodução de música no iPhone.");
        // Lógica real para pausar a reprodução de música
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música '" + musica + "' no iPhone.");
        // Lógica real para selecionar uma música
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " no iPhone.");
        // Lógica real para fazer uma ligação
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada no iPhone.");
        // Lógica real para atender uma chamada
    }

    @Override
    public void iniciarConversaVoz() {
        System.out.println("Iniciando uma conversa de voz no iPhone.");
        // Lógica real para iniciar uma conversa de voz
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página da web: " + url + " no iPhone.");
        // Lógica real para exibir uma página da web
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando uma nova aba com a página: " + url + " no iPhone.");
        // Lógica real para adicionar uma nova aba do navegador
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página no navegador do iPhone.");
        // Lógica real para atualizar a página do navegador
    }
}
package src.aparelho;



// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocarMusica();
    void pausar();
    void voltar();
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar();
    void atender();
    void caixaCorreioVoz();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void abrirNavegador();
    void novaAba();
    void fechar();
}

// Classe que representa um Phone, implementando as interfaces relevantes
class Phone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void voltar() {
        System.out.println("Voltando para a música anterior.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void caixaCorreioVoz() {
        System.out.println("Acessando a caixa de correio de voz.");
    }

    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo navegador de internet...");
    }

    @Override
    public void novaAba() {
        System.out.println("Abrindo nova aba.");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o navegador.");
    }
}


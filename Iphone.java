interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
    }

    @Override
    public void pausar() {
    }

    @Override
    public void selecionarMusica() {
    }

    @Override
    public void ligar() {
    }

    @Override
    public void atender() {
    }

    @Override
    public void iniciarCorreioVoz() {
    }

    @Override
    public void exibirPagina() {
    }

    @Override
    public void adicionarNovaAba() {
    }

    @Override
    public void atualizarPagina() {
    }
}

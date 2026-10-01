public abstract class HospedagemDecorator implements Hospedagem {

    private Hospedagem hospedagem;

    public HospedagemDecorator(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public abstract float getPercentualAcrescimo();

    public float getValor() {
        return this.hospedagem.getValor()
                * (1 + (this.getPercentualAcrescimo() / 100));
    }

    public abstract String getNomeServico();

    public String getDescricao() {
        return this.hospedagem.getDescricao()
                + "/" + this.getNomeServico();
    }
}
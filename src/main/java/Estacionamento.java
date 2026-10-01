public class Estacionamento extends HospedagemDecorator {

    public Estacionamento(Hospedagem hospedagem) {
        super(hospedagem);
    }

    public float getPercentualAcrescimo() {
        return 5.0f;
    }

    public String getNomeServico() {
        return "Estacionamento";
    }
}
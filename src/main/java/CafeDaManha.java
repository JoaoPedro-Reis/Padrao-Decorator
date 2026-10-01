public class CafeDaManha extends HospedagemDecorator {

    public CafeDaManha(Hospedagem hospedagem) {
        super(hospedagem);
    }

    public float getPercentualAcrescimo() {
        return 10.0f;
    }

    public String getNomeServico() {
        return "Café da Manhã";
    }
}
public class ServicoQuarto extends HospedagemDecorator {

    public ServicoQuarto(Hospedagem hospedagem) {
        super(hospedagem);
    }

    public float getPercentualAcrescimo() {
        return 15.0f;
    }

    public String getNomeServico() {
        return "Serviço de Quarto";
    }
}
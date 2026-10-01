public class HospedagemBasica implements Hospedagem {

    public float valor;

    public HospedagemBasica() {
    }

    public HospedagemBasica(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return "Hospedagem Básica";
    }
}
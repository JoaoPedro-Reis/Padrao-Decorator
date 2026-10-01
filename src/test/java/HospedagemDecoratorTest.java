import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospedagemDecoratorTest {

    @Test
    public void deveRetornarValorComVariosServicos() {
        Hospedagem hospedagem = new HospedagemBasica(200.0f);

        hospedagem = new CafeDaManha(hospedagem);
        hospedagem = new Estacionamento(hospedagem);
        hospedagem = new ServicoQuarto(hospedagem);

        assertEquals(265.65f, hospedagem.getValor(), 0.01f);
    }

    @Test
    public void deveRetornarDescricaoComVariosServicos() {
        Hospedagem hospedagem = new HospedagemBasica(200.0f);

        hospedagem = new CafeDaManha(hospedagem);
        hospedagem = new Estacionamento(hospedagem);
        hospedagem = new ServicoQuarto(hospedagem);

        assertEquals(
                "Hospedagem Básica/Café da Manhã/Estacionamento/Serviço de Quarto",
                hospedagem.getDescricao()
        );
    }
}
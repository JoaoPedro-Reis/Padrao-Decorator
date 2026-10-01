import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeDaManhaTest {

    @Test
    public void deveRetornarValorComCafeDaManha() {
        Hospedagem hospedagem = new HospedagemBasica(200.0f);
        hospedagem = new CafeDaManha(hospedagem);

        assertEquals(220.0f, hospedagem.getValor(), 0.01f);
    }

    @Test
    public void deveRetornarDescricaoComCafeDaManha() {
        Hospedagem hospedagem = new HospedagemBasica(200.0f);
        hospedagem = new CafeDaManha(hospedagem);

        assertEquals(
                "Hospedagem Básica/Café da Manhã",
                hospedagem.getDescricao()
        );
    }
}
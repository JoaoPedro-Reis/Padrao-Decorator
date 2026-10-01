import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospedagemBasicaTest {

    @Test
    public void deveRetornarValorHospedagemBasica() {
        Hospedagem hospedagem = new HospedagemBasica(200.0f);

        assertEquals(200.0f, hospedagem.getValor(), 0.01f);
    }

    @Test
    public void deveRetornarDescricaoHospedagemBasica() {
        Hospedagem hospedagem = new HospedagemBasica(200.0f);

        assertEquals("Hospedagem Básica", hospedagem.getDescricao());
    }
}
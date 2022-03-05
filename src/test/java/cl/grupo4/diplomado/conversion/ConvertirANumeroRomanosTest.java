package cl.grupo4.diplomado.conversion;

import cl.grupo4.diplomado.conversiones.ConvertirANumerosRomanos;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertirANumeroRomanosTest {

    ConvertirANumerosRomanos convertirANumerosRomanos = new ConvertirANumerosRomanos();

    @Test
    public void unidadTest() {
        assertEquals(convertirANumerosRomanos.conversion(1),"I");
    }

    @Test
    public void decenasTest() {
        assertEquals(convertirANumerosRomanos.conversion(10),"X");
    }
    @Test
    public void centenasTest() {
        assertEquals(convertirANumerosRomanos.conversion(200),"CC");
    }
}

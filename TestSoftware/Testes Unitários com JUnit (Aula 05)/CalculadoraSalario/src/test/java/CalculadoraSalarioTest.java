import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSalarioTest {

    public static CalculadoraSalario calculadoraSalario = new CalculadoraSalario();

    @Test
    @DisplayName("Teste 1")
    public void testeSalarioCT01()
    {
        assertEquals(97.50, calculadoraSalario.CalcularINSS(1300), 0.01);
    }
    @Test
    @DisplayName("Teste 2")
    public void testeSalarioCT02()
    {
        assertEquals(115.20, calculadoraSalario.CalcularINSS(1500), 0.01);
    }
    @Test
    @DisplayName("Teste 3")
    public void testeSalarioCT03()
    {
        assertEquals(263.06, calculadoraSalario.CalcularINSS(3000), 0.01);
    }
    @Test
    @DisplayName("Teste 4")
    public void testeSalarioCT04()
    {
        assertEquals(665.92, calculadoraSalario.CalcularINSS(6000), 0.01);
    }
    @Test
    @DisplayName("Teste 5")
    public void testeSalarioCT05()
    {
        assertEquals(876.97, calculadoraSalario.CalcularINSS(10000), 0.01);
    }
}
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TestCalculadora {
    @Test
    public void Suma(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.suma(1,2);
        assertEquals(3,resultado);
    }
    @Test
    public void Resta(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.resta(3,3);
        assertEquals(0,resultado);
    }
    @Test
    public void divison(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.division(10,2);
        assertEquals(5,resultado);
    }
    @Test
    public void multiplicaccion(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multipicaccion(10,2);
        assertEquals(20,resultado);
    }
}

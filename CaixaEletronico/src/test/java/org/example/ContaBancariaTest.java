package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaBancariaTest {
//dados
    ContaBancaria cb = new ContaBancaria("ERICK", 123,0.0f);
    @Test
    public void testGetTitular(){
        assertEquals("ERICK", cb.getTitular());
    }
    @Test
    public void testGetNumeroConta(){
        assertEquals(123, cb.getNumeroConta());
    }
    @Test
    public void testSaldo(){
        assertEquals(0.0, cb.getSaldo());
    }
    @Test
    public void testDepositar(){
        //se o de zero aumentar passou
        cb.depositar(1.2f);
        assertEquals(1.2f, cb.getSaldo());
    }
    @Test
    public void testSacar(){
        cb.depositar(1000.0f);
        cb.sacar(500.0f);
        assertEquals(500,0f, cb.getSaldo());
    }

}

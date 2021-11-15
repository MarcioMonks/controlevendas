/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.monks_store.dao;

import br.com.monks_store.model.Vendas;
import java.time.LocalDate;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marciomonks
 */
public class VendasDAOTest {
    
    public VendasDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrarVenda method, of class VendasDAO.
     */
    @Test
    public void testCadastrarVenda() {
        System.out.println("cadastrarVenda");
        Vendas obj = null;
        VendasDAO instance = new VendasDAO();
        instance.cadastrarVenda(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornaUltimaVenda method, of class VendasDAO.
     */
    @Test
    public void testRetornaUltimaVenda() {
        System.out.println("retornaUltimaVenda");
        VendasDAO instance = new VendasDAO();
        int expResult = 0;
        int result = instance.retornaUltimaVenda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarVendasPorPeriodo method, of class VendasDAO.
     */
    @Test
    public void testListarVendasPorPeriodo() {
        System.out.println("listarVendasPorPeriodo");
        LocalDate data_inicio = null;
        LocalDate data_fim = null;
        VendasDAO instance = new VendasDAO();
        List<Vendas> expResult = null;
        List<Vendas> result = instance.listarVendasPorPeriodo(data_inicio, data_fim);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornaTotalVendaPorData method, of class VendasDAO.
     */
    @Test
    public void testRetornaTotalVendaPorData() {
        System.out.println("retornaTotalVendaPorData");
        LocalDate data_venda = null;
        VendasDAO instance = new VendasDAO();
        double expResult = 0.0;
        double result = instance.retornaTotalVendaPorData(data_venda);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

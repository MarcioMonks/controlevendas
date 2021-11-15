/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.monks_store.dao;

import br.com.monks_store.model.ItensVenda;
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
public class ItensVendaDAOTest {
    
    public ItensVendaDAOTest() {
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
     * Test of cadastrarItem method, of class ItensVendaDAO.
     */
    @Test
    public void testCadastrarItem() {
        System.out.println("cadastrarItem");
        ItensVenda obj = null;
        ItensVendaDAO instance = new ItensVendaDAO();
        instance.cadastrarItem(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaItensPorVenda method, of class ItensVendaDAO.
     */
    @Test
    public void testListaItensPorVenda() {
        System.out.println("listaItensPorVenda");
        int venda_id = 0;
        ItensVendaDAO instance = new ItensVendaDAO();
        List<ItensVenda> expResult = null;
        List<ItensVenda> result = instance.listaItensPorVenda(venda_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.monks_store.dao;

import br.com.monks_store.model.Fornecedores;
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
public class FornecedoresDAOTest {
    
    public FornecedoresDAOTest() {
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
     * Test of cadastrarFornecedor method, of class FornecedoresDAO.
     */
    @Test
    public void testCadastrarFornecedor() {
        System.out.println("cadastrarFornecedor");
        Fornecedores obj = null;
        FornecedoresDAO instance = new FornecedoresDAO();
        instance.cadastrarFornecedor(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarFornecedor method, of class FornecedoresDAO.
     */
    @Test
    public void testAlterarFornecedor() {
        System.out.println("alterarFornecedor");
        Fornecedores obj = null;
        FornecedoresDAO instance = new FornecedoresDAO();
        instance.alterarFornecedor(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirFornecedor method, of class FornecedoresDAO.
     */
    @Test
    public void testExcluirFornecedor() {
        System.out.println("excluirFornecedor");
        Fornecedores obj = null;
        FornecedoresDAO instance = new FornecedoresDAO();
        instance.excluirFornecedor(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarFornecedores method, of class FornecedoresDAO.
     */
    @Test
    public void testListarFornecedores() {
        System.out.println("listarFornecedores");
        FornecedoresDAO instance = new FornecedoresDAO();
        List<Fornecedores> expResult = null;
        List<Fornecedores> result = instance.listarFornecedores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaPorNome method, of class FornecedoresDAO.
     */
    @Test
    public void testConsultaPorNome() {
        System.out.println("consultaPorNome");
        String nome = "";
        FornecedoresDAO instance = new FornecedoresDAO();
        Fornecedores expResult = null;
        Fornecedores result = instance.consultaPorNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaFornecedorPorNome method, of class FornecedoresDAO.
     */
    @Test
    public void testBuscaFornecedorPorNome() {
        System.out.println("buscaFornecedorPorNome");
        String nome = "";
        FornecedoresDAO instance = new FornecedoresDAO();
        List<Fornecedores> expResult = null;
        List<Fornecedores> result = instance.buscaFornecedorPorNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

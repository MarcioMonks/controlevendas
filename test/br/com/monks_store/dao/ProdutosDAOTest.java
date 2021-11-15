/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.monks_store.dao;

import br.com.monks_store.model.Produtos;
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
public class ProdutosDAOTest {
    
    public ProdutosDAOTest() {
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
     * Test of cadastrarProduto method, of class ProdutosDAO.
     */
    @Test
    public void testCadastrarProduto() {
        System.out.println("cadastrarProduto");
        Produtos obj = null;
        ProdutosDAO instance = new ProdutosDAO();
        instance.cadastrarProduto(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarProduto method, of class ProdutosDAO.
     */
    @Test
    public void testAlterarProduto() {
        System.out.println("alterarProduto");
        Produtos obj = null;
        ProdutosDAO instance = new ProdutosDAO();
        instance.alterarProduto(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirProduto method, of class ProdutosDAO.
     */
    @Test
    public void testExcluirProduto() {
        System.out.println("excluirProduto");
        Produtos obj = null;
        ProdutosDAO instance = new ProdutosDAO();
        instance.excluirProduto(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarProdutos method, of class ProdutosDAO.
     */
    @Test
    public void testListarProdutos() {
        System.out.println("listarProdutos");
        ProdutosDAO instance = new ProdutosDAO();
        List<Produtos> expResult = null;
        List<Produtos> result = instance.listarProdutos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaProdutoPorNome method, of class ProdutosDAO.
     */
    @Test
    public void testBuscaProdutoPorNome() {
        System.out.println("buscaProdutoPorNome");
        String nome = "";
        ProdutosDAO instance = new ProdutosDAO();
        List<Produtos> expResult = null;
        List<Produtos> result = instance.buscaProdutoPorNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaProdutoPorNome method, of class ProdutosDAO.
     */
    @Test
    public void testConsultaProdutoPorNome() {
        System.out.println("consultaProdutoPorNome");
        String nome = "";
        ProdutosDAO instance = new ProdutosDAO();
        Produtos expResult = null;
        Produtos result = instance.consultaProdutoPorNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaProdutoPorCodigo method, of class ProdutosDAO.
     */
    @Test
    public void testConsultaProdutoPorCodigo() {
        System.out.println("consultaProdutoPorCodigo");
        int id = 0;
        ProdutosDAO instance = new ProdutosDAO();
        Produtos expResult = null;
        Produtos result = instance.consultaProdutoPorCodigo(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of baixaEstoque method, of class ProdutosDAO.
     */
    @Test
    public void testBaixaEstoque() {
        System.out.println("baixaEstoque");
        int id = 0;
        int qtd_nova = 0;
        ProdutosDAO instance = new ProdutosDAO();
        instance.baixaEstoque(id, qtd_nova);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionaEstoque method, of class ProdutosDAO.
     */
    @Test
    public void testAdicionaEstoque() {
        System.out.println("adicionaEstoque");
        int id = 0;
        int qtd_nova = 0;
        ProdutosDAO instance = new ProdutosDAO();
        instance.adicionaEstoque(id, qtd_nova);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornaEstoqueAtual method, of class ProdutosDAO.
     */
    @Test
    public void testRetornaEstoqueAtual() {
        System.out.println("retornaEstoqueAtual");
        int id = 0;
        ProdutosDAO instance = new ProdutosDAO();
        int expResult = 0;
        int result = instance.retornaEstoqueAtual(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

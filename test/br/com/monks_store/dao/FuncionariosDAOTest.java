/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.monks_store.dao;

import br.com.monks_store.model.Funcionarios;
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
public class FuncionariosDAOTest {
    
    public FuncionariosDAOTest() {
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
     * Test of cadastrarFuncionario method, of class FuncionariosDAO.
     */
    @Test
    public void testCadastrarFuncionario() {
        System.out.println("cadastrarFuncionario");
        Funcionarios obj = null;
        FuncionariosDAO instance = new FuncionariosDAO();
        instance.cadastrarFuncionario(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarFuncionario method, of class FuncionariosDAO.
     */
    @Test
    public void testAlterarFuncionario() {
        System.out.println("alterarFuncionario");
        Funcionarios obj = null;
        FuncionariosDAO instance = new FuncionariosDAO();
        instance.alterarFuncionario(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirFuncionario method, of class FuncionariosDAO.
     */
    @Test
    public void testExcluirFuncionario() {
        System.out.println("excluirFuncionario");
        Funcionarios obj = null;
        FuncionariosDAO instance = new FuncionariosDAO();
        instance.excluirFuncionario(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarFuncionarios method, of class FuncionariosDAO.
     */
    @Test
    public void testListarFuncionarios() {
        System.out.println("listarFuncionarios");
        FuncionariosDAO instance = new FuncionariosDAO();
        List<Funcionarios> expResult = null;
        List<Funcionarios> result = instance.listarFuncionarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaPorNome method, of class FuncionariosDAO.
     */
    @Test
    public void testConsultaPorNome() {
        System.out.println("consultaPorNome");
        String nome = "";
        FuncionariosDAO instance = new FuncionariosDAO();
        Funcionarios expResult = null;
        Funcionarios result = instance.consultaPorNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaFuncionarioPorNome method, of class FuncionariosDAO.
     */
    @Test
    public void testBuscaFuncionarioPorNome() {
        System.out.println("buscaFuncionarioPorNome");
        String nome = "";
        FuncionariosDAO instance = new FuncionariosDAO();
        List<Funcionarios> expResult = null;
        List<Funcionarios> result = instance.buscaFuncionarioPorNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of efetuarLogin method, of class FuncionariosDAO.
     */
    @Test
    public void testEfetuarLogin() {
        System.out.println("efetuarLogin");
        String email = "";
        String senha = "";
        FuncionariosDAO instance = new FuncionariosDAO();
        instance.efetuarLogin(email, senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

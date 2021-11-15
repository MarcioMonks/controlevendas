/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.monks_store.dao;

import br.com.monks_store.model.Clientes;
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
public class ClientesDAOTest {
    
    public ClientesDAOTest() {
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
     * Test of cadastrarCliente method, of class ClientesDAO.
     */
    @Test
    public void testCadastrarCliente() {
        System.out.println("cadastrarCliente");
        Clientes obj = null;
        ClientesDAO instance = new ClientesDAO();
        instance.cadastrarCliente(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarCliente method, of class ClientesDAO.
     */
    @Test
    public void testAlterarCliente() {
        System.out.println("alterarCliente");
        Clientes obj = null;
        ClientesDAO instance = new ClientesDAO();
        instance.alterarCliente(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirCliente method, of class ClientesDAO.
     */
    @Test
    public void testExcluirCliente() {
        System.out.println("excluirCliente");
        Clientes obj = null;
        ClientesDAO instance = new ClientesDAO();
        instance.excluirCliente(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarClientes method, of class ClientesDAO.
     */
    @Test
    public void testListarClientes() {
        System.out.println("listarClientes");
        ClientesDAO instance = new ClientesDAO();
        List<Clientes> expResult = null;
        List<Clientes> result = instance.listarClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaPorNome method, of class ClientesDAO.
     */
    @Test
    public void testConsultaPorNome() {
        System.out.println("consultaPorNome");
        String nome = "";
        ClientesDAO instance = new ClientesDAO();
        Clientes expResult = null;
        Clientes result = instance.consultaPorNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaPorCpf method, of class ClientesDAO.
     */
    @Test
    public void testConsultaPorCpf() {
        System.out.println("consultaPorCpf");
        String cpf = "";
        ClientesDAO instance = new ClientesDAO();
        Clientes expResult = null;
        Clientes result = instance.consultaPorCpf(cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaClientePorNome method, of class ClientesDAO.
     */
    @Test
    public void testBuscaClientePorNome() {
        System.out.println("buscaClientePorNome");
        String nome = "";
        ClientesDAO instance = new ClientesDAO();
        List<Clientes> expResult = null;
        List<Clientes> result = instance.buscaClientePorNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

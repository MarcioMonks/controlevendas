package br.com.monks_store.dao;

import br.com.monks_store.jdbc.ConnectionFactory;
import br.com.monks_store.model.Clientes;
import br.com.monks_store.model.Fornecedores;
import br.com.monks_store.model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutosDAO {

    private Connection con;

    public ProdutosDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public void cadastrarProduto(Produtos obj) {

        try {
            // Criação do comando SQL
            String sql = "INSERT INTO tb_produtos (descricao, preco, qtd_estoque, for_id) "
                    + "VALUES (?,?,?,?)";

            // Conexão ao BD e organização do comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtd_estoque());
            stmt.setInt(4, obj.getFornecedor().getId());

            // Execução do comando SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    public void alterarProduto(Produtos obj) {

        try {
            // Criação do comando SQL
            String sql = "UPDATE tb_produtos SET descricao=?, preco=?, qtd_estoque=?, for_id=? WHERE id=?";
                    
            // Conexão ao BD e organização do comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtd_estoque());
            stmt.setInt(4, obj.getFornecedor().getId());
            stmt.setInt(5, obj.getId());

            // Execução do comando SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    public void excluirProduto(Produtos obj) {
        
        try {
            // Criação do comando SQL
            String sql = "DELETE FROM tb_produtos WHERE id=?";
            
            // Conexão ao BD e organização do comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
            
            
            // Execução do comando SQL
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }   
    }
    
    public List<Produtos> listarProdutos() {
        
        try {
            
            // Criando lista
            List<Produtos> lista = new ArrayList<>();
            
            // Criação e execução do comando SQL
            String sql = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome FROM tb_produtos as p "
                           + "INNER JOIN tb_fornecedores as f ON (p.for_id = f.id)";  
            
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {   
                
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();
                
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                
                f.setNome(rs.getString("f.nome"));
                
                obj.setFornecedor(f);
                
                lista.add(obj);
            }
            
            return lista;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
        
    }
    
    public List<Produtos> buscaProdutoPorNome(String nome) {
        
        try {
            
            // Criando lista
            List<Produtos> lista = new ArrayList<>();
            
            // Criação e execução do comando SQL
            String sql = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome FROM tb_produtos as p "
                           + "INNER JOIN tb_fornecedores as f ON (p.for_id = f.id) WHERE p.descricao LIKE ?";  
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {   
                
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();
                
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                
                f.setNome(rs.getString("f.nome"));
                
                obj.setFornecedor(f);
                
                lista.add(obj);
            }
            
            return lista;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
        
    }
    
    public Produtos consultaProdutoPorNome(String nome) {
        
        try {
            
            // Criação e execução do comando SQL
            String sql = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome FROM tb_produtos as p "
                           + "INNER JOIN tb_fornecedores as f ON (p.for_id = f.id) WHERE p.descricao=?";  
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,nome);
            
            ResultSet rs = stmt.executeQuery();
            
            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();
            
            if (rs.next()) {   
                  
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                
                f.setNome(rs.getString("f.nome"));
                
                obj.setFornecedor(f);
                
            }
            
            return obj;
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            return null;
        }
        
    }
    
    public Produtos consultaProdutoPorCodigo(int id) {
        
        try {
            
            // Criação e execução do comando SQL
            String sql = "SELECT * FROM tb_produtos WHERE id = ?";  
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,id);
            
            ResultSet rs = stmt.executeQuery();
            
            Produtos obj = new Produtos();
            
            
            if (rs.next()) {   
                  
                obj.setId(rs.getInt("id"));
                obj.setDescricao(rs.getString("descricao"));
                obj.setPreco(rs.getDouble("preco"));
                obj.setQtd_estoque(rs.getInt("qtd_estoque"));   
            }
            
            return obj;
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            return null;
        }
        
    }
    
    public void baixaEstoque(int id, int qtd_nova) {
        
        try {
            
            String sql = "UPDATE tb_produtos SET qtd_estoque=? WHERE id=?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, qtd_nova);
            stmt.setInt(2, id);
            
            stmt.execute();
            stmt.close();
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            
        }
    }
    
    public void adicionaEstoque(int id, int qtd_nova) {
        
        try {
            
            String sql = "UPDATE tb_produtos SET qtd_estoque=? WHERE id=?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, qtd_nova);
            stmt.setInt(2, id);
            
            stmt.execute();
            stmt.close();
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            
        }
    }
    
    public int retornaEstoqueAtual(int id) {
        
        try {
            
            int qtd_estoque = 0;
            
            String sql = "SELECT qtd_estoque FROM tb_produtos WHERE id=?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()) {
               
                qtd_estoque = (rs.getInt("qtd_estoque"));
            }
            
            return qtd_estoque;
            
        } catch (SQLException e) {
            
            throw new RuntimeException(e);
        }
    }
}

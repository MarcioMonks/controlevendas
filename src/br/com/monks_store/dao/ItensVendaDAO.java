package br.com.monks_store.dao;

import br.com.monks_store.jdbc.ConnectionFactory;
import br.com.monks_store.model.Clientes;
import br.com.monks_store.model.ItensVenda;
import br.com.monks_store.model.Produtos;
import br.com.monks_store.model.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ItensVendaDAO {
    
    private Connection con;

    public ItensVendaDAO() {
        this.con = new ConnectionFactory().getConnection();
    } 
    
    public void cadastrarItem(ItensVenda obj) {
        
        try {
              
            String sql = "INSERT INTO tb_itensvendas (venda_id, produto_id, qtd, subtotal) "
                    + "VALUES (?,?,?,?)";

            // Conexão ao BD e organização do comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, obj.getVenda().getId());
            stmt.setInt(2, obj.getProduto().getId());
            stmt.setInt(3, obj.getQtd());
            stmt.setDouble(4, obj.getSubtotal());

            // Execução do comando SQL
            stmt.execute();
            stmt.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            
        }
        
    }
    
    public List<ItensVenda> listaItensPorVenda(int venda_id) {
        
        List<ItensVenda> lista = new ArrayList<>();
        
        try {
            
            // Criação e execução do comando SQL
            String sql = "SELECT p.descricao, i.qtd, p.preco, i.subtotal FROM tb_itensvendas as i "
                    + "INNER JOIN tb_produtos as p ON (i.produto_id = p.id) WHERE i.venda_id=?"; 
                           
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, venda_id);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {   
                
                ItensVenda item = new ItensVenda();
                Produtos prod = new Produtos();
                
                prod.setDescricao(rs.getString("p.descricao"));
                item.setQtd(rs.getInt("i.qtd"));
                prod.setPreco(rs.getDouble("p.preco"));
                item.setSubtotal(rs.getDouble("i.subtotal"));
                
                item.setProduto(prod);
                
                lista.add(item);
            }
            
            return lista;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
        
    }
    
}

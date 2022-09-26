/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.DAO;

import br.ulbra.DAO.ConnectionFactory;
import br.ulbra.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class UsuarioDAO {

    Connection con;

    public UsuarioDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    public boolean checkLogin(String login, String senha) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM tbusuario WHERE emailUsu = ? and senhaUsu = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }

//MÉTODO CRIADO PARA INSERIR USUÁRIO NO BANCO DE DADOS
    public void create(Usuario u) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tbusuario (nomeusu, emailusu, senhausu, foneusu, sexousu) VALUES (?,?,?,?,?)");
            stmt.setString(1, u.getNomeUsu());

            stmt.setString(2, u.getEmailUsu());
            stmt.setString(3, u.getSenhaUsu());
            stmt.setString(4, u.getFoneUsu());
            stmt.setInt(5, u.getSexoUsu());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());

        } finally {

            ConnectionFactory.closeConnection(con, stmt);

        }

    }

// MÉTODO CRIADO PARA EXCLUIR DO BANCO DE DADOS

 public void delete(Usuario u) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tbusuario WHERE idusu = ?");
            stmt.setInt(1, u.getIdUsu());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }


//MÉTODO CRIADO PARA MODIFICAR NO BANCO DE DADOS

 public void update(Usuario u) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tbusuario SET nomeUsu = ? , emailusu = ?, senhausu = ? , foneusu = ? , sexousu = ?  WHERE idusu = ?");
            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getEmailUsu());
            stmt.setString(3, u.getSenhaUsu());
            stmt.setString(4, u.getFoneUsu());
            stmt.setInt(5, u.getSexoUsu());
            stmt.setInt(6, u.getIdUsu());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "Erro:" +ex.getMessage());       
 } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
 public ArrayList<Usuario> read() {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbUsuario");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setIdUsu(rs.getInt("idusu"));
                usuario.setNomeUsu(rs.getString("nomeusu"));
                usuario.setEmailUsu(rs.getString("emailusu"));
                usuario.setSenhaUsu(rs.getString("senhausu"));
                usuario.setFoneUsu(rs.getString("foneusu"));
                usuario.setSexoUsu(rs.getInt("sexousu"));

                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return (ArrayList<Usuario>) usuarios;

    }
    
    public List<Usuario> readForDesc(String campo, String nome) {

       String argumento = campo +" like '%"+nome+"%'"; 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String query = "select idUsu, nomeUsu, emailUsu, senhaUsu, foneUsu, sexoUsu from tbusuario WHERE "+argumento;
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
  
        try {
         
            stmt = con.prepareStatement(query);
       
        
            rs = stmt.executeQuery();
           // JOptionPane.showMessageDialog(null, rs.next()+" " +rs.getString("nomeUsu"));
            while (rs.next()) {

               Usuario usuario = new Usuario();

                usuario.setIdUsu(rs.getInt("idusu"));
                usuario.setNomeUsu(rs.getString("nomeusu"));
                usuario.setEmailUsu(rs.getString("emailusu"));
                usuario.setSenhaUsu(rs.getString("senhausu"));
                usuario.setFoneUsu(rs.getString("foneusu"));
                usuario.setSexoUsu(rs.getInt("sexousu"));

                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;

    }
    
    
}

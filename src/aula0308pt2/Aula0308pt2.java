/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0308pt2;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author pdcth
 */
public class Aula0308pt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Connection conn = Conexao.getConexao();
        try {
            String sql = "INSERT INTO aluno(nome,ra) VALUES('Leo','CV123458')";
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Aluno cadastrado");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }
    
}

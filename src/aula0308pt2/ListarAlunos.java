/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0308pt2;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author pdcth
 */
public class ListarAlunos {
        public static void main(String[] args) {
        Connection conn = Conexao.getConexao();
        String sql = "SELECT * FROM aluno";
            try {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                    while(rs.next()){
                        int id = rs.getInt("id");
                        String nome = rs.getString("nome");
                        String prontuario = rs.getString("Prontuario");
                        System.out.println("Prontuario: " + prontuario + "Nome: " + nome);
                        
                    }
            } catch (Exception e) {
                System.out.println("Erro ao listar: " +e.getMessage());
                
            }
    }
}

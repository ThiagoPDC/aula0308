
package aula0308pt2;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ListarAlunos {
    public static void main(String[] args) {
        Connection conn = Conexao.getConexao();
        String sql = "select * from aluno;"; 
        
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String prontuario = rs.getString("prontuario");
                System.out.println("Prontuario:" + prontuario + "  Nome: " + nome );
            }
        } catch (Exception e) {
            System.out.println("Erro ao Encontrar Aluno: " + e.getMessage());
        }
    }
}

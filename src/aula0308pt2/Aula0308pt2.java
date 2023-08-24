package aula0308pt2;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.Statement;

public class Aula0308pt2 {

    public static void main(String[] args) {
        Connection conn = Conexao.getConexao();
        
        try {
            String sql = "INSERT INTO aluno(nome, pront) VALUES ('Pedro', 'CV123459')";
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Aluno cadastrado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }
    
}

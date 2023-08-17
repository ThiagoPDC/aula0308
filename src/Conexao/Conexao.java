/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pdcth
 */
public class Conexao {
        public static Connection getConexao(){
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/aula0308?serverTimezone=UTC",
                    "root",
                    ""
            );
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getLocalizedMessage());
        }
     return null;
    }
    
}

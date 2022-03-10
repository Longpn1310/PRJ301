/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import model.Account;

/**
 *
 * @author Admin
 */
public class AccountDBContext {
    public Account getAccount(String username, String password){
            String sql = "SELECT SELECT [username]\n" +
                        "      ,[password]\n" +
                        "      ,[displayname]\n" +
                        "      ,[aid]\n" +
                        "  FROM [Account] WHERE username = ? AND [password] = ? AND aid = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
    }
}

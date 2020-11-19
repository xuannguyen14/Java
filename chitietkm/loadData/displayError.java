/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitietkm.loadData;

import java.sql.SQLException;

/**
 *
 * @author Tat Gia Vi
 */
public class displayError {
    public void displayError(SQLException ex){
       System.out.println("Error Message:"+ex.getMessage());
       System.out.println("SQL State:"+ex.getSQLState());
       System.out.println("Error Code:"+ex.getErrorCode());
    }
}

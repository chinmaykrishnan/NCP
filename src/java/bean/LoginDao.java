/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import java.sql.PreparedStatement;

public class LoginDao {
    public static boolean validate(LoginBean bean)
    {
        boolean status = false;
    try{
        
        Fillo fillo = new Fillo();
        Connection connection = fillo.getConnection("C:\\Users\\ckris\\Desktop\\login.xlsx");
        String uname = bean.getUsername();
        String pwd = bean.getPassword();
        System.out.println("Username is "+uname+" and password is "+pwd);
        String strQuery = "Select * from Sheet1 where Username = '"+uname+"' and Password='"+pwd+"'";
        //String strQuery = "Select * from Sheet1 where ID = '100' and name = 'John'";
        System.out.println("Query is : "+strQuery);
        Recordset recordset = connection.executeQuery(strQuery);

        if(recordset.getCount()>0)
            status = true;

        recordset.close();
        connection.close();
        
    }
    catch(Exception e){e.printStackTrace();}
    return status;
    }
}


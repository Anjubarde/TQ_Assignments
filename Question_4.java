package HomeWork_TQ;

// 4. Find the amount , name of customer whose acc_no is 12345 


/*
SQL - 
SELECT cm.cname, a.balance
FROM Accounts a
JOIN Customer c ON a.cust_id = c.cust_id
JOIN Customer_Master cm ON c.cust_id = cm.cust_id
WHERE a.acc_no = 12345;

*/


import java.sql.*;

public class Question_4
{
    public static void main(String[] args) 
    {
        int searchAccNo = 12345;

        String url = "jdbc:mysql://localhost:3306/your_database"; // replace with actual DB
        String user = "your_username";
        String password = "your_password";

        String query = """
            SELECT cm.cname, a.balance
            FROM Accounts a
            JOIN Customer c ON a.cust_id = c.cust_id
            JOIN Customer_Master cm ON c.cust_id = cm.cust_id
            WHERE a.acc_no = ?
        """;

        try 
        (
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(query)
        ) 
        {
            stmt.setInt(1, searchAccNo);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()) 
            {
                String name = rs.getString("cname");
                double balance = rs.getDouble("balance");
                System.out.println("Customer Name: " + name);
                System.out.println("Account Balance: " + balance);
            } 
            else 
            {
                System.out.println("No customer found with account number: " + searchAccNo);
            }

        } 
        catch(SQLException e) 
        {
            e.printStackTrace();
        }
    }
}

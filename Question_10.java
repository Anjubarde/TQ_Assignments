package HomeWork3_TQ;

/*
	10.	Write a jdbc program to display highest selling model along with name and
	count ( Read all table data using select but without any where clause)
*/

import java.sql.*;

public class Question_10 
{
    public static void main(String[] args) 
    {
        String url = "jdbc:mysql://localhost:3306/your_database"; // Replace with your DB URL
        String username = "your_username";  // Replace with your DB username
        String password = "your_password";  // Replace with your DB password

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try 
        {
            // 1. Load JDBC driver (optional for newer JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to DB
            conn = DriverManager.getConnection(url, username, password);

            // 3. Create Statement
            stmt = conn.createStatement();

            // 4. Execute query to get all data
            String query = "SELECT model_name, units_sold FROM sales";  // Replace with your table & columns
            rs = stmt.executeQuery(query);

            // 5. Variables to track highest selling model
            String highestModel = null;
            int maxUnitsSold = -1;

            // 6. Process result set
            while (rs.next()) {
                String model = rs.getString("model_name");
                int unitsSold = rs.getInt("units_sold");

                if (unitsSold > maxUnitsSold) {
                    maxUnitsSold = unitsSold;
                    highestModel = model;
                }
            }

            // 7. Display result
            if(highestModel != null) 
            {
                System.out.println("Highest Selling Model: " + highestModel);
                System.out.println("Units Sold: " + maxUnitsSold);
            } 
            else 
            {
                System.out.println("No data found.");
            }

        } 
        catch(ClassNotFoundException e) 
        {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } 
        catch(SQLException e) 
        {
            System.out.println("Database error:");
            e.printStackTrace();
        } 
        finally 
        {
            // 8. Close resources
            try 
            { 
            	if(rs != null) rs.close(); 
            } 
            catch(Exception e) 
            {}
            try 
            { 
            	if(stmt != null) stmt.close(); 
            } 
            catch(Exception e) 
            {}
            try 
            { 
            	if (conn != null) conn.close(); 
            } 
            catch (Exception e) 
            {}
        }
    }
}

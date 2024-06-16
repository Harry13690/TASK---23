package utilities;

import java.sql.*;

public class JDBC_Connection {

    public static void main(String[] args) {

        try {
            //Connecting the MYSQL to IntelliJ Using DriverManager
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/employee?user=root&password=Mysql03");

            Statement statement = connection.createStatement();

            //Creating the Separate DataBase
            String query = "Create database employ;";

            //Executing the Above Query
            statement.executeUpdate(query);

            //Select the Current DataBase to do Further Actions
            query = "Use employ;";

            statement.executeUpdate(query);

            //Creating the Table "emp" with Different Columns
            query = "create table emp (empcode int(10), empname varchar(255), emppage int(10), empsalary int(10));";

            statement.executeUpdate(query);

            //Insert the Data Which are Given in Task
            query = "Insert into emp Values ( 101, 'Jenny', 25, 10000);";

            statement.executeUpdate(query);

            query = "Insert into emp Values ( 102, 'Jack', 30, 20000);";

            statement.executeUpdate(query);

            query = "Insert into emp Values ( 103, 'Joe', 20, 40000);";

            statement.executeUpdate(query);

            query = "Insert into emp Values ( 104, 'John', 40, 80000);";

            statement.executeUpdate(query);

            query = "Insert into emp Values ( 105, 'Shameer', 25, 90000);";

            statement.executeUpdate(query);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

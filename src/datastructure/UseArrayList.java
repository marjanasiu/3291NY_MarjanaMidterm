package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) throws SQLException {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> array = new ArrayList<>();
		System.out.println("Adding values using add methods.......");
		array.add("Monika");
		array.add("Marjana");
		System.out.println(array);
		array.add(1,"Jasica");
		array.add(3,"Afsana");
		array.add("*****");
		System.out.println(" ");
		System.out.println("Printout the values using while loop with Iterator.....");
		Iterator it = array.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		array.remove(3);
		array.remove("*****");
		System.out.println(" ");
		System.out.println("Printout the values using For Each loop.....");
		for (String st : array
		) {
			System.out.println(st);
		}

		String url = "jdbc:mysql://localhost:3306/pnt?serverTimezone=UTC";
		String userID = "root";
		String password = "Atlyfe@2019";

		Connection connection = null;
		Statement statement = null;

		try{
		connection = DriverManager.getConnection(url, userID, password);
		statement = connection.createStatement();
		String query = "insert into student (id, name, email, age) values ('3999', 'Zakiir Hossain', 'zakiir@gmail.com', 22);";
				statement.execute(query);
		}catch (SQLException ex){
			ex.printStackTrace();
		}
		finally {
			connection.close();
			statement.close();
		}

	}
}



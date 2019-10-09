package hw_2;

/*
 * Authors: Alonso Darias, Miles Naberhaus
 * Client system which allows the user to change the storage strategy at runtime.
 * Also simulates the interaction between a user and the system.
 */
public class Client {
	public static Database db;
	
	public static void main(String[] args) {
		//Sets default database type
		System.out.println("Set the database form to Relational by default.");
		db = new Relational();
		
		//Stores to the database
		System.out.println("Storing data to the database.");
		db.performStore();
		
		//User changes the active database type
		System.out.println("The user changes the database form to NoSQL");
		setStoreStrategy(new NoSQL());
		
		//Stores to the database
		System.out.println("Storing data to the database.");
		db.performStore();
		
		System.out.println("Finished.");
	}
	
	//Changes the active database type based on user input
	public static void setStoreStrategy(Database database) {
		db = database;
	}
}
package hw_2;

/*
 * Authors: Alonso Darias, Miles Naberhaus
 * Graph database type which utilizes the DocumentStore strategy.
 */
public class NoSQL extends Database {
	public StoreType st;
	
	public NoSQL() {
		st = new DocumentStore();
	}
	
	public void performStore() {
		st.store();
	}
}

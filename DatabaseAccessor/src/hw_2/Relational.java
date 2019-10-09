package hw_2;

/*
 * Authors: Alonso Darias, Miles Naberhaus
 * Graph database type which utilizes the TableStore strategy.
 */
public class Relational extends Database {
	public StoreType st;
	
	public Relational() {
		st = new TableStore();
	}
	
	public void performStore() {
		st.store();
	}
}
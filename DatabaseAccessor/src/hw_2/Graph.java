package hw_2;

/*
 * Authors: Alonso Darias, Miles Naberhaus
 * Graph database type which utilizes the NodeStore strategy.
 */
public class Graph extends Database {
	public StoreType st;
	
	public Graph() {
		st = new NodeStore();
	}
	
	public void performStore() {
		st.store();
	}
}

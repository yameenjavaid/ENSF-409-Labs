import java.util.ArrayList;

/**
 * Represents a single Supplier that supplies items to the shop.
 * 
 * @author P. Link
 * @version 1.0.0
 * @since Feb. 12, 2020
 */
public class Supplier {
	
	/**
	 * The ID of the supplier
	 */
	private int id;
	
	/**
	 * The name of the company
	 */
	private String company;
	
	/**
	 * The physical address of the company
	 */
	private String address;
	
	/**
	 * The Sales Contact at the company (name of person)
	 */
	private String contact;
	
	/**
	 * List of all items this supplier provides.
	 */
	private ArrayList<Item> itemList;

	/**
	 * Creates a single Supplier object, which contains all information about each supplier.
	 * 
	 * @param id The ID of the supplier
	 * @param company The name of the company
	 * @param address The physical address of the company
	 * @param contact The Sales Contact at the company (name of person)
	 */
	public Supplier(int id, String company, String address, String contact) {
		setAllInfo(id, company, address, contact);
	}
	
	/**
	 * Sets all the info about a supplier
	 * 
	 * @param id The ID of the supplier
	 * @param company The name of the company
	 * @param address The physical address of the company
	 * @param contact The Sales Contact at the company (name of person)
	 */
	public void setAllInfo(int id, String company, String address, String contact) {
		this.id = id;
		this.company = company;
		this.address = address;
		this.contact = contact;
	}
	
	/**
	 * Gets the ID of a supplier
	 * 
	 * @return The ID of the supplier
	 */
	public int getID() {
		return id;
	}
	
	/**
	 * Gets the Item List of this supplier.
	 * 
	 * @return The item list of all Items this supplier provides.
	 */
	public ArrayList<Item> getItemList() {
		return itemList;
	}

}

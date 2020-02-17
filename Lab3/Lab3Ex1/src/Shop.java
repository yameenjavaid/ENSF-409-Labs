
/**
 * The Shop is the main backend controller for the entire shop.
 * It contains access to the Inventory and SupplierList "databases".
 * 
 * @author P. Link
 * @version 1.0.0
 * @since Feb. 12, 2020
 */
public class Shop {
	
	/**
	 * The Inventory, which holds all the items.
	 */
	private Inventory inventory;
	
	/**
	 * The Supplier List, which keeps track of all shop Suppliers.
	 * 
	 * It is unused because it does not need to be used, as each item references its supplier directly.
	 */
	@SuppressWarnings("unused")
	private SupplierList supplierList;
	

	/**
	 * The constructor for the Shop, which loads in an Inventory and a SupplierList, based on data from files (for example).
	 * 
	 * @param inventory The inventory to set for the shop
	 * @param supplierList The supplier list to set for the shop
	 */
	public Shop(Inventory inventory, SupplierList supplierList) {
		setInventory(inventory);
		setSupplierList(supplierList);
	}
	
	
	/**
	 * Sets the Inventory.
	 * 
	 * @param inventory The new inventory object to set as the shop's inventory
	 */
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	

	/**
	 * Sets the SupplierList.
	 * 
	 * @param inventory The new inventory object to set as the shop's inventory
	 */
	public void setSupplierList(SupplierList supplierList) {
		this.supplierList = supplierList;
	}

	/**
	 * Gets the current order, stored in the inventory.
	 */
	public Order getOrder() {
		return inventory.getOrder();
	}
	
	/**
	 * Gets the item quantity, by name.
	 */
	public int getQuantity(String name) {
		return inventory.getQuantity(name);
	}

	/**
	 * Decreases an item quantity by name
	 * 
	 * @param itemName The name of the item to decrease the quantity of.
	 * @return Whether quantity decrease was successful
	 */
	public boolean decreaseQuantity(String itemName) {
		return inventory.decreaseQuantity(itemName);
	}

	/**
	 * Gets an Item by its ID.
	 * 
	 * @param search The Item's ID
	 * @return The Item
	 */
	public Item getItem(int id) {
		return inventory.getItem(id);
	}
	
	/**
	 * Gets an Item by its name.
	 * 
	 * @param search The Item's name
	 * @return The Item
	 */
	public Item getItem(String name) {
		return inventory.getItem(name);
	}

	/**
	 * Lists all the items in the shop's inventory by calling their toString methods.
	 * @return 
	 * 
	 * @return String representation of all items in the shop
	 */
	public String listAllItems() {
		return inventory.listAllItems();
	}

}

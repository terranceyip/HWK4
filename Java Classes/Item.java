public abstract class Item {

	public abstract String getInfo();
	public abstract int getPrice();
	public abstract int getShipping();

	protected int price;
	protected int sNo;
	protected String name;
	protected int quantity;
	protected String type;

	//Add other fields if necessary

}

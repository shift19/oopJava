package myproducts;

public interface ForSale {
	int price = 1;
	String currency = "Ft";
	
	public int getPrice();
	public String getCurrency();
	
	public void setPrice(int price);
	public void setCurrency(String currency);
	
}

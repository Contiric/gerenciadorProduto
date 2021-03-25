package entities;
public class ImportedProduct extends Product {
	
	protected double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		
		 return getPrice() + customsFee;	
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f,", totalPrice()) 
				+ "(Custom Fee: $ "
				+ String.format("%.2f", customsFee)
				+ ")";
	}
	
}

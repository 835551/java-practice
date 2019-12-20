
public class Product2 {
 
 private long id;
 private String productName;
 private String suplierName;
 public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getSuplierName() {
	return suplierName;
}
public void setSuplierName(String suplierName) {
	this.suplierName = suplierName;
}
public Product2(long id, String productName, String suplierName) {
	super();
	this.id = id;
	this.productName = productName;
	this.suplierName = suplierName;
}
 public void display() {
	 System.out.println("product id is "+id);
	 System.out.println("product name is "+productName);
	 System.out.println("suplier name is "+suplierName);
 }
 
 }

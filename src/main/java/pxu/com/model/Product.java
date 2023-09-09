package pxu.com.model;

public class Product {
	private int code;
	private String name;
	private float price;
	private String imageUrl;
	
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public Product(int code, String name, float price, String imageUrl) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.imageUrl = imageUrl;
	}
	public Product() {
		super();
	}
	
	
	
}

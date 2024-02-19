package cn.tut.model;

public class Product {
private int id;
private String name;
private String category;
private String price;
private String image;

public Product() {
	super();
}

public Product(int id, String category, String price, String image) {
	this.id = id;
	this.category = category;
	this.price = price;
	this.image = image;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

@Override
public String toString() {
	return "Product [id=" + id + ", category=" + category + ", price=" + price + ", image=" + image + "]";
}


}

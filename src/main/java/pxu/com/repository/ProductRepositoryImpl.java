package pxu.com.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pxu.com.model.Product;

public class ProductRepositoryImpl implements ProductRepository {

	private static final Map<Integer, Product> products;

	static {
		products = new HashMap<Integer, Product>();
		products.put(1, new Product(1, "Iphone1", 101, "https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/t/_/t_m_12.png"));
		products.put(2, new Product(2, "Iphone2", 102, "https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/1/4/14_1_9_2_9.jpg"));
		products.put(3, new Product(3, "Iphone1", 103, "https://cdn2.cellphones.com.vn/358x/media/catalog/product/b/_/b_c_1_10.png"));
		products.put(4, new Product(4, "Iphone2", 104, "https://cdn2.cellphones.com.vn/358x/media/catalog/product/v/_/v_ng_18_1.png"));
		products.put(5, new Product(5, "Iphone1", 105, "https://cdn2.cellphones.com.vn/358x/media/catalog/product/x/_/x_m_25.png"));
		products.put(6, new Product(6, "Iphone2", 106, "https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/1/_/1_252.jpg"));
		products.put(7, new Product(7, "Iphone2", 107, "https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/p/h/photo_2022-09-28_21-58-51_4.jpg"));
	}

	@Override
	public List<Product> fimAll() {
		// TODO Auto-generated method stub
		return new ArrayList<Product>(products.values());
	}

	@Override
	public Product finByid(int code) {
		// TODO Auto-generated method stub
		Product product = products.get(code);
		return product;
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		products.put(product.getCode(), product);
	}

	@Override
	public void delete(int code) {
		products.remove(code);
	}

	@Override
	public void update(Product product) {
		int productId = product.getCode();
		if (products.containsKey(productId)) {
			products.put(productId, product);
		}
	}

}

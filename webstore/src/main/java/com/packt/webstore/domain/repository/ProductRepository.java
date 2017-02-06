package com.packt.webstore.domain.repository;

import java.util.List;
import com.packt.webstore.domain.Product;

/**
 * 
 * @author Paola
 *
 */
public interface ProductRepository {
	
	List <Product> getAllProducts();
	
	Product getProductById(String productID);

}

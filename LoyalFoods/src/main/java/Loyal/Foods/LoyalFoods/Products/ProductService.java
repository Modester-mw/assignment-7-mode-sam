package Loyal.Foods.LoyalFoods.Products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductService {
	
	
	@Autowired
		public List<Product> getProducts() {
			return List.of(
					new Product("Rosemary Leaves",1L,1500),
					new Product("Rosemary Powder",2L,1500),
					new Product("Birunga Natural Spring Water",3L,1500),
					new Product("Hibiscus Tea",4L,1500),
					new Product("Ginger Black Tea",5L,1500),
					new Product("Spiced Tea",6L,1500),
					new Product("Lemon Ginger",7L,1500));
					
		}

		public static void addproduct(Product product) {
				// TODO Auto-generated method stub
			
		}

		public static Product getProductById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

}

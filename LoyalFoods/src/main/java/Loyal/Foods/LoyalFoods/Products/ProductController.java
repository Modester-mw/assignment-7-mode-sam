package Loyal.Foods.LoyalFoods.Products;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/LoyalFoods")
public class ProductController {
	
	private final ProductService productService;
	
	@Autowired
	public ProductController( ProductService productService) {
		this.productService = productService;
		// TODO Auto-generated constructor stub
	}
	
	
	
  @GetMapping
	public List<Product> getProducts() {
	  return productService.getProducts();
	}
  @GetMapping(path = "{id}")
  public Product getProductById(@PathVariable("id") Long id) {
	  return productService.getProductById(id);
  }
  
   
  @PostMapping
  public void addproduct(@RequestBody Product product) {
	  ProductService.addproduct(product);
  }
  

}

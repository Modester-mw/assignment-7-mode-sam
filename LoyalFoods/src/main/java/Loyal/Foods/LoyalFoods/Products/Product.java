package Loyal.Foods.LoyalFoods.Products;

import org.springframework.boot.context.properties.ConfigurationProperties;

@javax.persistence.Entity
@ConfigurationProperties
public class Product {
	
	    private String Name;
		private Long id;
	    private double Price;


	    public Product(){

	    }

	    public Product(String Name,Long id, double Price){
	        this.Name = Name;
	        this.id = id;
	        this.Price = Price;

	    }

	    public String getName(){
	        return Name;
	    }
	    public void setName(String Name){
	        this.Name = Name;
	        
	    }

	    public Long getid(){
	        return id;
	    }
	    public void setName(Long id){
	        this.id = id;
	        
	    }


	    public double getPrice(){
	        return Price;
	    }
	    public void setPrice(double Price){
	        this.Price = Price;
	        
	    }

	    
	    @Override
	    public String toString() {
	    	return "Product{" +
	    			"Name" + Name +
	    			"ID" + id + '\n' + 
	    			"Price" + Price + '\n' + "}";
	    			
	    }

	    

}

import java.util.Scanner;

import com.dao.ProductDAO;
import com.dao.ProductDAOImpl;
import com.exceptions.ProductNotFoundException;
import com.pojo.ProductInfo;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductInfo product = new ProductInfo();
        ProductDAO p = new ProductDAOImpl();
      
        int i;
        Scanner sc = new Scanner(System.in);
        
        while(true){
        	
        	System.out.println("\n1.Add_Product");
            System.out.println("\n2.Update_Product by Price");
            System.out.println("\n3.Update_Product by Quantity");
            System.out.println("\n4.Find_by_ID");
            System.out.println("\n5.Find_All");
            System.out.println("\n6.Find_by_category");
            System.out.println("\n7.Delete Product");
            System.out.println("\n8.Exit");
            
            System.out.println("\n9.Enter your choice: ");
            i = sc.nextInt();
        	
           switch(i){
           case 1:
        	  p.addProduct(product);
        	  break;
           case 2:
        	   
        	        p.updateProductPrice(product.getpId(), product.getPrice());
        	   
        	   break;
           case 3:
        		   p.updateProduct(product.getpId(), product.getQuantity());
        	   
        	   break;
           case 4:
        	   
        	       p.findById(product.getpId());
        	      
        	   break;
           case 5:
        	  
        	        p.findAll();
        	  
        	   break;
           case 6:
        		   p.findAllByCategory(product.getCategory());
        	   
        	   break;
           case 7:
        	   p.deleteByPrice(product.getPrice());
           case 8:
        	   System.out.println("\nExited...");
        	   System.exit(0);
        	   
        	   break;
           }
           
        }
        
	}

}

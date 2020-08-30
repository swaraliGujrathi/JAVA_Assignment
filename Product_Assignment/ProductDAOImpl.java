package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.exceptions.ProductNotFoundException;
import com.io.ProductIO;
import com.io.ProductIOImpl;
import com.pojo.ProductInfo;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public int addProduct(ProductInfo product) {
		// TODO Auto-generated method stub
		
		ProductIO product1 = new ProductIOImpl();
		
		product = product1.getProduct();
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","temp");
			System.out.println("Got the Connection");
		    
		    String insertData = "insert into product values(?,?,?,?,?)";
		    
		    PreparedStatement ps = con.prepareStatement(insertData);
		    ps.setInt(1, product.getpId());
		    ps.setString(2, product.getPname());
		    ps.setInt(3, product.getPrice());
		    ps.setInt(4, product.getQuantity());
		    ps.setString(5, product.getCategory());
		    
		    int updated = ps.executeUpdate();
		    if(updated>0){
		    	System.out.println("Inserted Value");
		    }
		    else{
		    	System.out.println("Sorry!");
		    }
			

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public boolean updateProductPrice(int productId, int price) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the product you want to update: ");
		productId = sc.nextInt();
		System.out.println("Enter the updated price of the product: ");
		price = sc.nextInt();
				
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","temp");
			System.out.println("Got the Connection");
		    
		    String updateData = "update product set price=? where pId=?";
		    
		    PreparedStatement ps = con.prepareStatement(updateData);
		    
		    
		    	ps.setDouble(1, price);
		    	ps.setInt(2, productId);
		    int updated = ps.executeUpdate();
		    if(updated>0){
		    	System.out.println("Product Found and value updated");
		    }
		    else{
		    	try {
					throw new ProductNotFoundException("Sorry Product not found!!!");
				} catch (ProductNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		   
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateProduct(int productId, int quantity) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the product you want to update: ");
		productId = sc.nextInt();
		System.out.println("Enter the updated quantity of the product: ");
		quantity = sc.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","temp");
			System.out.println("Got the Connection");
		    
		    String updateData = "update product set quantity=? where pId=?";
		    
		    PreparedStatement ps = con.prepareStatement(updateData);
		    ps.setInt(1, quantity);
		    ps.setInt(2, productId);
		    int updated = ps.executeUpdate();
		    if(updated>0){
		    	System.out.println("Product Found and value updated");
		    }
		    else{
		    	//System.out.println("NotFound");
		    	try {
					throw new ProductNotFoundException("Sorry! Product Not Found");
				} catch (ProductNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		  
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@SuppressWarnings("unused")
	@Override
	public ProductInfo findById(int productId) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the product you want to find: ");
		productId = sc.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","temp");
			System.out.println("Got the Connection");
		    
		    String findData = "select * from product where pId = ?";
		    
		    PreparedStatement ps = con.prepareStatement(findData);
		    ps.setInt(1,productId);
		    
		    ResultSet set = ps.executeQuery();
		    
		    if(set.next()){
		    	int id = set.getInt("pId");
		    	String name = set.getString(2);
		    	int price = 	set.getInt(3);
		    	int quantity = set.getInt(4);
		    	String category = set.getString("category");
		    	System.out.println(id+","+name+","+price+","+quantity+","+category);
		    	ProductInfo product = new ProductInfo(id,name,price,quantity,category);
		    }
		    
		    else{
		    	try {
					throw new ProductNotFoundException("Sorry! Product Not Found");
				} catch (ProductNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		  
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<ProductInfo> findAll() {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","temp");
			System.out.println("Got the Connection");
		    
		    String findData = "select * from product";
		    
		    PreparedStatement ps = con.prepareStatement(findData);
		    
		    ResultSet set = ps.executeQuery();
		    
		    while(set.next()){
		    	int id = set.getInt("pId");
		    	String name = set.getString(2);
		    	int price = 	set.getInt(3);
		    	int quantity = set.getInt(4);
		    	String category = set.getString("category");
		    	System.out.println(id+","+name+","+price+","+quantity+","+category);
		    	ProductInfo product = new ProductInfo(id,name,price,quantity,category);
		    }
		    
		    
			

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

	@Override
	public List<ProductInfo> findAllByCategory(String category) {
		// TODO Auto-generated method stub
		ProductInfo pro = new ProductInfo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Category of the product");
		category = sc.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","temp");
			System.out.println("Got the Connection");
		    
		    String findData = "select * from product where category = ?";
		    
		    PreparedStatement ps = con.prepareStatement(findData);
		    ps.setString(1, category);
		    ResultSet set = ps.executeQuery();
		    
		    while(set.next()){
		    	int id = set.getInt("pId");
		    	String name = set.getString(2);
		    	int price = 	set.getInt(3);
		    	int quantity = set.getInt(4);
		    	String category1 = set.getString("category");
		    	System.out.println(id+","+name+","+price+","+quantity+","+category);
		    	ProductInfo product = new ProductInfo(id,name,price,quantity,category1);
		    }
		  
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductInfo deleteByPrice(int price) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of the product: ");
		price = sc.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","temp");
			System.out.println("Got the Connection");
		    
		    String deleteData = "delete from product where price=?";
		    
		    PreparedStatement ps = con.prepareStatement(deleteData);
		    ps.setInt(1, price);
		    
		    int deleted = ps.executeUpdate();
		    if(deleted>0){
		    	System.out.println("Product Found and value updated");
		    }
		    else{
		    	//System.out.println("NotFound");
		    	try {
					throw new ProductNotFoundException("Sorry! Product Not Found");
				} catch (ProductNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		    
			

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}

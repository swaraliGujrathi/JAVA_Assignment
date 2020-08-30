package com.io;

import java.util.Scanner;

import com.pojo.ProductInfo;

public class ProductIOImpl implements ProductIO {

	@Override
	public ProductInfo getProduct() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product_ID: ");
		int id = sc.nextInt();
		System.out.println("Enter the Product_name: ");
		String name = sc.next();
		System.out.println("Enter the Product_Price: ");
		int price = sc.nextInt();
		System.out.println("Enter the Product_Quantity: ");
		int quantity = sc.nextInt();
		System.out.println("Enter the Product_Category: ");
		String category = sc.next();
		
		return new ProductInfo(id,name,price,quantity,category);
	}

	@Override
	public void displayProduct(ProductInfo product) {
		// TODO Auto-generated method stub
         System.out.println(product);
	}

}

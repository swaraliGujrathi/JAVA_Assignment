package com.dao;

import java.util.List;

import com.pojo.ProductInfo;

public interface ProductDAO {
     int addProduct(ProductInfo product);
     boolean updateProductPrice(int productId, int price);
     boolean updateProduct(int productId,int quantity);
     ProductInfo findById(int productId);
     List<ProductInfo> findAll();
     List<ProductInfo> findAllByCategory(String category);
     
     ProductInfo deleteByPrice(int price);
     
}

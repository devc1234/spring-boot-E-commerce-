package com.dbms.dev.dao;

import java.util.List;

import com.dbms.dev.entity.Product;

public interface ProductDao {

    List<Product> queryProduct();

    List<Product> queryProductById(int productId);

    List<Product> queryProductByName(String name);

    int insertProduct(Product product);

    int updatedProduct(Product product);

    int deleteProduct(int productId);

    int queryCountProduct();

    List<Product> querySortByPrice();

    List<Product> querySortByPriceDesc();

    List<Product> queryForCamera();

    List<Product> queryForHeadphone();

    List<Product> queryForAccessories();

    List<Product> queryForCellphone();

    List<Product> queryForLaptop();

    List<Product> queryForTele();

    List<Product> queryForTablet();

}

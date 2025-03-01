package edu.eci.arsw.parcial.Services.Impl;

import edu.eci.arsw.parcial.Classes.Product;
import edu.eci.arsw.parcial.ProductException.ProductException;
import edu.eci.arsw.parcial.Services.ProductServiceInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements ProductServiceInterface {
        private List<Product> products = new ArrayList<>();

        @Override
        public List<Product> getAllProducts() throws ProductException{
            if(products.isEmpty() || products == null){
                throw new ProductException(ProductException.productNotExist);
            }
            return products;
        }
        @Override
        public Product getProductById(int id) throws ProductException{
            Product pr = products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
            if(pr == null){
                throw new ProductException(ProductException.productNotFound);
            }
            return pr;
        }
        @Override
        public Product addProduct(String nombre, double precio) throws ProductException{
            if(nombre == null || precio < 0){
                throw new ProductException(ProductException.productNotCreated);
            }
            Product product = new Product(nombre, precio);
            products.add(product);
            return product;
        }
}


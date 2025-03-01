package edu.eci.arsw.parcial.Services;

import edu.eci.arsw.parcial.Classes.Product;
import edu.eci.arsw.parcial.ProductException.ProductException;

import java.util.ArrayList;
import java.util.List;

public interface ProductServiceInterface {

    public List<Product> getAllProducts() throws ProductException;
    public Product getProductById(int id) throws ProductException;
    public Product addProduct(String nombre, double precio) throws ProductException;
}

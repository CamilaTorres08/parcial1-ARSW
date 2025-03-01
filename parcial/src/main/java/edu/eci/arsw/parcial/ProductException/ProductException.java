package edu.eci.arsw.parcial.ProductException;

public class ProductException extends Exception{
    public static final String productNotCreated = "The product cannot create";
    public static final String productNotFound = "The product cannot found";
    public static final String productNotExist = "Products does not exist";
    public ProductException(String message){
        super(message);
    }
}

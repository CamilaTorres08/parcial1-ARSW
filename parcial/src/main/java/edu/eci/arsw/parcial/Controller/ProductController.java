package edu.eci.arsw.parcial.Controller;

import edu.eci.arsw.parcial.Classes.Product;
import edu.eci.arsw.parcial.ProductException.ProductException;
import edu.eci.arsw.parcial.Services.Impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public ResponseEntity<?> getProducts() {
        try{
            List<Product> products = productService.getAllProducts();
            return new ResponseEntity<>(products,HttpStatus.OK);
        }catch(ProductException p){
            return new ResponseEntity<>(p.getMessage(), HttpStatus.NOT_FOUND);
        }


    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable int id) {
        try{
            Product product = productService.getProductById(id);
            return new ResponseEntity<>(product,HttpStatus.OK);
        }catch(ProductException p){
            return new ResponseEntity<>(p.getMessage(), HttpStatus.NOT_FOUND);
        }

    }
    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        try{
            Product productReturned = productService.addProduct(product.getNombre(), product.getPrecio());
            return new ResponseEntity<>(product, HttpStatus.CREATED);
        }catch(ProductException p){
            return new ResponseEntity<>(p.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
}

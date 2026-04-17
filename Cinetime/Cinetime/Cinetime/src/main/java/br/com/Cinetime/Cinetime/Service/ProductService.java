package br.com.Cinetime.Cinetime.Service;


import br.com.Cinetime.Cinetime.Dto.ProductRequestDTO;
import br.com.Cinetime.Cinetime.Exception.ProductNotFoundException;
import br.com.Cinetime.Cinetime.Model.Product;
import br.com.Cinetime.Cinetime.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public Product create(ProductRequestDTO productDTO) {
        var product = new Product(productDTO.name(),
                productDTO.description(),
                productDTO.price(),
                productDTO.category(),
                productDTO.imageUrl());

        return repository.save(product);
    }

    public Product update(Long id, ProductRequestDTO dto) {
        var product = findById(id);
        product.setName(dto.name());
        product.setDescription(dto.description());
        product.setPrice(dto.price());
        product.setCategory(dto.category());
        product.setImageUrl(dto.imageUrl());

        return repository.save(product);
    }

    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
    }
}
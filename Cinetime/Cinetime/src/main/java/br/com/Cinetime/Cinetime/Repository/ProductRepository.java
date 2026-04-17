package br.com.Cinetime.Cinetime.Repository;


import br.com.Cinetime.Cinetime.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {



}

package learn.luv2code.ecommerce.dao;

import learn.luv2code.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4202")
public interface ProductRepository extends JpaRepository<Product, Long> {
}

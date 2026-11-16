package ma.mundiapolis.bdccmundiaspringmvc.repository;

import ma.mundiapolis.bdccmundiaspringmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

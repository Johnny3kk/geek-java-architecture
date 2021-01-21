package HomeWork7.persist;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ProductRepository {

    void insert(Product product);

    void update(Product product);

    void delete(Integer id);

    Product findById(Integer id);

    List<Product> findAll();

}

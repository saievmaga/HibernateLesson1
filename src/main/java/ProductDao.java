import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ProductDao {

    private SessionFactory factory;
    private Session session;

    public ProductDao() {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        session = null;
    }

    public Product findById(Long id) throws ProductNotFoundException {
        session = factory.getCurrentSession();
        session.beginTransaction();

        Product product = session.get(Product.class, id);
        session.getTransaction().commit();

        if (product == null) {
            throw new ProductNotFoundException("Product with id = " + id + " not found");
        }
        return product;
    }

    public List<Product> findAll() {
        session = factory.getCurrentSession();
        session.beginTransaction();

        List<Product> products = session.createQuery("from Product").getResultList();
        session.getTransaction().commit();

        return products;
    }

    public void deleteById(Long id) throws ProductNotFoundException {
        session = factory.getCurrentSession();
        session.beginTransaction();

        Product product = session.get(Product.class, id);
        if (product == null) {
            throw new ProductNotFoundException("Product with id = " + id + " not found");
        }
        session.delete(product);
        session.getTransaction().commit();
    }

    public Product saveOrUpdate(Product product) {
        session = factory.getCurrentSession();
        session.beginTransaction();

        Product productDB = session.get(Product.class, product.getId());
        productDB.setTitle(product.getTitle());
        productDB.setPrice(product.getPrice());
        session.getTransaction().commit();

        return product;
    }
}
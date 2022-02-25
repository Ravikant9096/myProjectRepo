package sportyshoes.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sportyshoes.model.Product;
import sportyshoes.model.User;
@Repository
@Component
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int saveUser(User user) {
		int id= (Integer)this.hibernateTemplate.save(user);
		return id;
	}
	
	// Read user
	
		public User getUser(String uemail) {
			return this.hibernateTemplate.get(User.class, uemail);
		}
	
	
	// CREATE PRODUCT
    
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
		
				
	}
	
	
	
	// read all data
	
	public List<Product> getProducts() {
		
		
		List<Product> products =this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	// delete product
	
	 @Transactional
	public void deleteProduct(int pid) {
		
		Product p =this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
		
	}
	
	// Read single Product
	
	public Product getProduct(int pid) {
		return this.hibernateTemplate.get(Product.class, pid);
	}
	
}

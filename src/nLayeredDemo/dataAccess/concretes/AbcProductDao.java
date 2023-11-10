package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class AbcProductDao implements ProductDao {

	@Override
	public void add(Product product1) {
		System.out.println("Abc ile eklendi: " + product1.getName());
		
	}

	@Override
	public void update(Product product1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

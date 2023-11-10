package nLayeredDemo.dataAccess.abstracts;


import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product1);  //ürün ekleme için
	void update(Product product1); //ürün güncelleme
	void delete(Product product1); //ürün silme
	Product get(int id);
	List <Product> getAll();    //ürün listesi için

}

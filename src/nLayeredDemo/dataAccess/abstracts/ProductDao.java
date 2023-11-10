package nLayeredDemo.dataAccess.abstracts;


import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product1);  //�r�n ekleme i�in
	void update(Product product1); //�r�n g�ncelleme
	void delete(Product product1); //�r�n silme
	Product get(int id);
	List <Product> getAll();    //�r�n listesi i�in

}

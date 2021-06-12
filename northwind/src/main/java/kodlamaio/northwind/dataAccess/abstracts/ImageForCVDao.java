package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entity.concretes.ImageForCV;

public interface ImageForCVDao {
	ImageForCV getById(int id);
	
	ImageForCV getByJobSeeker_id(int id);
}

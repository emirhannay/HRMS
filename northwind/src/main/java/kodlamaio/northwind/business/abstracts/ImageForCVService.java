package kodlamaio.northwind.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.ImageForCV;

public interface ImageForCVService {
		Result add(ImageForCV imageForCV, MultipartFile imageFile);
		Result update(ImageForCV imageForCV);
		Result delete(int id);
		DataResult<ImageForCV> getById(int id);
		DataResult<List<ImageForCV>> getAll();
		DataResult<ImageForCV> getByJobseekerId(int id);
}

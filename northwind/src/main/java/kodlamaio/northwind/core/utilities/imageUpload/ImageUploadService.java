package kodlamaio.northwind.core.utilities.imageUpload;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.northwind.core.utilities.results.DataResult;

public interface ImageUploadService {
	
	DataResult<Map> uploadImageFile(MultipartFile imageFile);
}

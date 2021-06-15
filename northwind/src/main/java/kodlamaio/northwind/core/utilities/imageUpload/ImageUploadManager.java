package kodlamaio.northwind.core.utilities.imageUpload;

import java.io.IOException;


import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.ErrorDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;

@Service
public class ImageUploadManager implements ImageUploadService{

	private Cloudinary cloudinary;
	
	public ImageUploadManager() {
		this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dw2gabnl5",
				"api_key", "866372335659382",
				"api_secret", "3lUUoU-hBncht95H2o-7Bgl3vrU"));
		
	}

	@Override
	public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
		try {
			@SuppressWarnings("unchecked")
			Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(resultMap);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return new ErrorDataResult<Map>();
	}

}
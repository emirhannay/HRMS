package kodlamaio.northwind.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.northwind.business.abstracts.ImageForCVService;
import kodlamaio.northwind.core.utilities.imageUpload.ImageUploadService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ImageForCVDao;
import kodlamaio.northwind.entity.concretes.ImageForCV;

@Service
public class ImageForCVManager implements ImageForCVService {
	private ImageForCVDao imageForCVDao;
	private ImageUploadService imageUploadService;

	@Autowired
	public ImageForCVManager(ImageForCVDao imageForCVDao, ImageUploadService imageUploadService) {
		super();
		this.imageForCVDao = imageForCVDao;
		this.imageUploadService = imageUploadService;
	}

	@Override
	public Result add(ImageForCV imageForCV, MultipartFile imageFile) {
		Map<String, String> uploadImage = this.imageUploadService.uploadImageFile(imageFile).getData();
		imageForCV.setUrl(uploadImage.get("url"));
		this.imageForCVDao.save(imageForCV);

		return new SuccessResult("Image has been added.");
	}

	@Override
	public Result update(ImageForCV imageForCV) {

		this.imageForCVDao.save(imageForCV);
		return new SuccessResult("Image updated.");
	}

	@Override
	public Result delete(int id) {
		this.imageForCVDao.deleteById(id);
		return new SuccessResult("Image deleted.");
	}

	@Override
	public DataResult<ImageForCV> getById(int id) {
		return new SuccessDataResult<ImageForCV>(this.imageForCVDao.getById(id));
	}

	@Override
	public DataResult<List<ImageForCV>> getAll() {
		
		return new SuccessDataResult<List<ImageForCV>>(this.imageForCVDao.findAll());
	}

	@Override
	public DataResult<ImageForCV> getByJobseekerId(int id) {
		
		return new SuccessDataResult<ImageForCV>(this.imageForCVDao.getByJobSeeker_id(id));
	}

}

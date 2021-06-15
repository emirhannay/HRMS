package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.LinkForCVService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.LinkForCVDao;
import kodlamaio.northwind.entity.concretes.LinkForCV;

@Service
public class LinkForCVManager implements LinkForCVService {
	
	LinkForCVDao linkForCVDao;
	
	@Autowired
	public LinkForCVManager(LinkForCVDao linkForCVDao) {
		super();
		this.linkForCVDao = linkForCVDao;
	}

	@Override
	public Result add(LinkForCV linkForCV) {
		this.linkForCVDao.save(linkForCV);
		return new SuccessResult("Link added.");
	}

	@Override
	public Result update(LinkForCV linkForCV) {
		this.linkForCVDao.save(linkForCV);
		return new SuccessResult("Link updated.");
	}

	@Override
	public Result delete(int id) {
		this.linkForCVDao.deleteById(id);
		return new SuccessResult("Link has been deleted.");
	}

	@Override
	public DataResult<LinkForCV> getById(int id) {
	
		return new SuccessDataResult<LinkForCV>(this.linkForCVDao.getById(id));
	}

	@Override
	public DataResult<List<LinkForCV>> getAll() {
		
		return new SuccessDataResult<List<LinkForCV>>(this.linkForCVDao.findAll());
	}

	@Override
	public DataResult<List<LinkForCV>> getAllByJobSeekerId(int id) {
	
		return new SuccessDataResult<List<LinkForCV>>(this.linkForCVDao.getAllByJobSeeker_id(id));
	}

}

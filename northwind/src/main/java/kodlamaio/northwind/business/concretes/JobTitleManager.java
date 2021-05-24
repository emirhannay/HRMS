package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.JobTitleService;
import kodlamaio.northwind.dataAccess.abstracts.JobTitleDao;
import kodlamaio.northwind.entity.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

	JobTitleDao dao;
	
	public JobTitleManager(JobTitleDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<JobTitle> getAll() {
		
		return dao.findAll();
	}

	@Override
	public void save(JobTitle jobtitle) {
		dao.save(jobtitle);
		
	}

}

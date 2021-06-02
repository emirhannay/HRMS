package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.JobSeekerService;
import kodlamaio.northwind.core.utulities.adapters.ValidationService;
import kodlamaio.northwind.core.utulities.results.DataResult;
import kodlamaio.northwind.core.utulities.results.ErrorResult;
import kodlamaio.northwind.core.utulities.results.Result;
import kodlamaio.northwind.core.utulities.results.SuccessDataResult;
import kodlamaio.northwind.core.utulities.results.SuccessResult;
import kodlamaio.northwind.core.verification.VerificationService;
import kodlamaio.northwind.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.northwind.entity.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	private ValidationService validationService;
	private VerificationService verificationService;
	private JobSeekerValidationManager jobSeekerValidationManager;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, ValidationService validationService,
			VerificationService verificationService, JobSeekerValidationManager jobSeekerValidationManager) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.validationService = validationService;
		this.verificationService = verificationService;
		this.jobSeekerValidationManager = jobSeekerValidationManager;
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		verificationService.sendLink(jobSeeker.getEmail());
		if (validationService.validateByMernis(jobSeeker.getIdentificationNo(), jobSeeker.getFirstName(),
				jobSeeker.getLastName(), jobSeeker.getBirthDate().getYear()) & verificationService.isUserClickedToLink()
				& jobSeekerValidationManager.checkEmailSingularity(jobSeeker)
				& jobSeekerValidationManager.checkIdentificationNoSingularity(jobSeeker) == true) {
			this.jobSeekerDao.save(jobSeeker);
			return new SuccessResult("Jobseeker has been added.");
		} else {
			return new ErrorResult("Jobseeker could not be added because it isnt verified from Mernis ");
		}

	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {

		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "Data listed");
	}

	@Override
	public DataResult<JobSeeker> getByNationalId(String nationalId) {

		return null;
	}

}

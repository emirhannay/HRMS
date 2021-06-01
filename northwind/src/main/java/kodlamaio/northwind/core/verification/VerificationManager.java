package kodlamaio.northwind.core.verification;

import org.springframework.stereotype.Service;

@Service
public class VerificationManager implements VerificationService {

	@Override
	public void sendLink(String email) {
		
		
	}

	@Override
	public boolean isUserClickedToLink() {
		return true;
		
	}
	
	
	 
	

}

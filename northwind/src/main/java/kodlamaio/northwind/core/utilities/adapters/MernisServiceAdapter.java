package kodlamaio.northwind.core.utilities.adapters;

import org.springframework.stereotype.Service;

import kodlamaio.northwind.fakeMernisService.FakeMernisService;

@Service
public class MernisServiceAdapter implements ValidationService {

	@Override
	public boolean validateByMernis(String nationalId, String firstName, String lastName, int yearOfBirth) {

		FakeMernisService client = new FakeMernisService();
		if (client.ValidateByPersonalInfo(nationalId, firstName, lastName, yearOfBirth) == true) {
			return true;
		} else {
			return false;
		}

	}

}

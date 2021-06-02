package kodlamaio.northwind.fakeMernisService;

public class FakeMernisService {
	public boolean ValidateByPersonalInfo(String nationalId, String firstName, String lastName, int yearOfBirth)
	{
		System.out.println(firstName + " " + lastName + " is valid person." );
		return true;
	}
}

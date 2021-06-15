	package kodlamaio.northwind.core.utilities.adapters;

public interface ValidationService {
	public boolean validateByMernis(String nationalId, String firstName, String lastName, int yearOfBirth);
}

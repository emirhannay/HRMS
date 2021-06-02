	package kodlamaio.northwind.core.utulities.adapters;

public interface ValidationService {
	public boolean validateByMernis(String nationalId, String firstName, String lastName, int yearOfBirth);
}

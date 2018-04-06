package data;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name="validTest")
	public Object[][] valid(){
		return new Object[][] {
			{"testuser@example.com","test123", "My Notes"},
		};
	}
	
	@DataProvider(name="wrongTest")
	public Object[][] wrong(){
		return new Object[][] {
			{"testuser@example.com","", "The username or password are incorrect"},
			{"","test123", "The username or password are incorrect"},
			{"","", "The username or password are incorrect"}
		};
	}
	
	@DataProvider(name="notesTest")
	public Object[][] notes(){
		return new Object[][] {
			{"testuser@example.com","test123", "A", "B", "My Notes"},
		};
	}

}
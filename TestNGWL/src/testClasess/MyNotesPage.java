package testClasess;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseSuite;
import data.TestData;

public class MyNotesPage extends BaseSuite {
	
	@Test(dataProvider="notesTest", dataProviderClass=TestData.class)
	  public void addNotes(String username, String password, String tittle, String description, String message) {
		loginPF().loginToTheApp(username, password);
		notes().clickAddBtn();
		notes().typeATittle(tittle);
		notes().typeADesc(description);
		notes().clickAddBtn();
		Assert.assertEquals(loginPF().getSucessMsg(), message);;
		Assert.assertTrue(notes().validateTittle(tittle));
	  }

}

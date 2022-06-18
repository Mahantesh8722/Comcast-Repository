package Practice;

import org.testng.annotations.Test;

public class ContactTest {

		@Test(groups = "smokeTest")
		public void CreateContactTest() {
			System.out.println("===Contact Created=====");
		}
		
		@Test(groups = "regressionTest")
		public void ModifyContactTest() {
			System.out.println("===Contact Modified=====");
		}
		
		@Test(groups = "regressionTest")
		public void DeleteContactTest() {
			System.out.println("===Contact Deleted=====");
		}
}

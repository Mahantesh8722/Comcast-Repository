import org.testng.annotations.Test;

public class OrganisationTest {

	public class OrganizationTest {

		@Test(groups = "smokeTest")
		public void CreateOrganizationTest() {
			System.out.println("===Organization Created=====");
		}
		
		@Test(groups = "regressionTest")
		public void ModifyOrganizationTest() {
			System.out.println("===Organization Modified=====");
		}
		
		@Test(groups = "regressionTest")
		public void DeleteOrganizationTest() {
			System.out.println("===Organization Deleted=====");
		}
	}
}

import org.testng.annotations.Test;

public class CampaignTest {

		@Test(groups = "smokeTest")
		public void CreateCampaignTest() {
			System.out.println("===Campaign Created=====");
			String value1 = System.getProperty("BROWSER");
			System.out.println(value1);
		}

		@Test(groups = "regressionTest")
		public void ModifyCampaignTest() {
		System.out.println("===Campaign Modified sucessfully=====");
		}
		
		@Test(groups = "regressionTest")
		public void DeleteCampaignTest() {
		System.out.println("===Campaign Deleted=====");
		}
	}

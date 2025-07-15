package simpleProject;

public class Browser {
	// To verify lanuchBrowser
		public void launchBrowser()
		{
			System.out.println("Browser launched successfully");
			System.out.println();
		}
		// To verify loadUrl
		public void loadUrl()
		{
			System.out.println("Application url loaded successfully");
		}
		
		public static void main(String[] args) {
			Browser browser = new Browser();
			browser.launchBrowser();
			browser.loadUrl();
		}
	}


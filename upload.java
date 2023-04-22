public class UploadFileTest2 
{
	WebDriver driver;
	@Test
	public void testUploadFile2() throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "screenshots" + File.separator + "test.png";
		System.out.println("The path is :: " + path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.filemail.com/share/upload-file");
		Thread.sleep(Duration.ofSeconds(5));
		//here, we are not directly pointing to input element with type="file", hence directly we can't paste file path
		driver.findElement(By.id("addBtn")).click();
		Thread.sleep(Duration.ofSeconds(5));
		
		Robot robot = new Robot();
		StringSelection ss = new StringSelection(System.getProperty("user.dir")+ File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "screenshots" + File.separator + "test.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Thread.sleep(Duration.ofSeconds(5));
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(Duration.ofSeconds(5));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(Duration.ofSeconds(5));
	}
}

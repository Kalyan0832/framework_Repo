package kalyan;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EnterNameInGoogleSearchAndFindThirdIndex {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https:google.com");
	driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("pavan kalyan");
	List<WebElement> alldata = driver.findElements(By.xpath("//div[@id=\"Alh6id\"]/descendant::ul/li"));

	ArrayList<String> al=new ArrayList<String>();
	for (WebElement data : alldata) {
		al.add(data.getText());
		System.out.println(data.getText());
	}
	System.out.println("-------------------------------");
	Collections.sort(al);    // sort in ascending order
	for (String info : al) {
		System.out.println(info);
	}
	System.out.println("-------------------------------");
	System.out.println("Third Index Data  "+al.get(3));
	driver.quit();
}

}

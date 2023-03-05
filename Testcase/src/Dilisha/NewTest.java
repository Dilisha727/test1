package Dilisha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class NewTest {
	
	  public String baseUrl = "https://www.phptravels.net";
	  public WebDriver driver;
		
		
		@BeforeTest
		public void setbaseURL()
		{
			System.setProperty("webdriver.chrome.driver", "E:\\eclips\\1\\SQA\\3rd_party\\chromedriver\\chromedriver11.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get(baseUrl);
	  
         }
		// click flight  button
		 @Test(priority=1)

		  public void click_flight() throws Throwable {
			 
			 //click flightbutton
			 Thread.sleep(1000); 
			 driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/ul/li[2]/button")).click();
			 System.out.println("flight button is click"); 
			 
		 }
		 @Test(priority=2)

		  public void flight() throws Throwable {
			 
			 Thread.sleep(1000); 
			    WebElement optionButton_1 = driver.findElement(By.id("one-way"));
				WebElement optionButton_2 = driver.findElement(By.id("round-trip"));
				
				// Select round-trip

				optionButton_2.click();
				
				
				if(optionButton_1.isSelected())
				{
					System.out.println("option 1 button has selected");
					
				}
				else
				{

					System.out.println("option 2 button has selected");
				}
				
		 }
		 
		//type flight 	
		 
		 @Test(priority=3)
		  public void fill_the_Flight_detials() {
			  
		 	 //Flying From text feild fill
		 WebElement PassTextBox = driver.findElement(By.id("autocomplete"));
			 // Send values to the PassTextBox
		PassTextBox.sendKeys("Indi");
		//select the one city get Xpath
		driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[1]/div/div[1]/div/div/div/div/div[1]")).click();
				 
			
			
		// TO Destion
		WebElement PassTextBox2 = driver.findElement(By.id("autocomplete2"));
		 // Send values to the PassTextBox
		PassTextBox2.sendKeys("Tokyo");
		//select the one city
		driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[1]/div/div[2]/div/div[2]/div/div/div[1]")).click();
				 

		//choice  Passengers
		driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[3]/div/div/div/a")).click();
			 
			 
			 //Select Adults 
			 driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[3]/div/div/div/div/div[1]/div/div/div[2]")).click();
			 System.out.println("Adults + click ");
			 
			//Select  Childs 
			driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div[2]/form/div[2]/div[3]/div/div/div/div/div[2]/div/div/div[2]")).click();
			 System.out.println(" Childs add ");
			 
			//Select  Infants
			 driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div[2]/form/div[2]/div[3]/div/div/div/div/div[3]/div/div/div[2]")).click();
			 System.out.println("  Infants add");
			 
			  
		 }
		 
		 //SELECT_FLIGT_TYPE		 
		 @Test(priority=4)
		  public void SELECT_FLIGT_TYPE() throws Throwable 
		  {
			 Thread.sleep(1000); 
	
			 
			 
					 //Select Economy Premium
			 		 Thread.sleep(1000);
					 Select droupdown1 = new Select(driver.findElement(By.id("flight_type")));
					 droupdown1.selectByVisibleText("Economy Premium");
					 driver.findElement(By.id("flights-search")).click();
					 System.out.println("1St class click ");
					
					 
					 
					//Select Business
					 Thread.sleep(1000);
					 Select droupdown2 = new Select(driver.findElement(By.id("flight_type")));
					 droupdown2.selectByVisibleText("Business");
		 			 driver.findElement(By.id("flights-search")).click();
					 System.out.println("select Business class");
				
					 
				
					//Select First class
					 Select droupdown3 = new Select(driver.findElement(By.id("flight_type")));
					 droupdown3.selectByVisibleText("First");
					 driver.findElement(By.id("flights-search")).click();
					 System.out.println("Select First class ");
				
					 
					 Thread.sleep(1000);
					 //Select Economy 
					 Select droupdown4 = new Select(driver.findElement(By.id("flight_type")));
					 droupdown4.selectByVisibleText("Economy");
					 driver.findElement(By.id("flights-search")).click();
					 System.out.println("Select Economy class ");
			 
		  }
			 
		 
		 //next page Flight_Stops
		 @Test(priority=5)
		  public void Flight_Stops() throws Throwable 
		  {
			 
			 
			//Identify the user radio button  the UI
				driver.findElement(By.id("all")).click();
				driver.findElement(By.id("direct")).click();
				driver.findElement(By.xpath("//*[@id=\"3\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"0\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"20\"]")).click();
				Thread.sleep(300);		
				 		  
		  }
		 //Select__Airlines
		 
		 @Test(priority=6)
		  public void Select__Airlines() throws Throwable 
		  {
			 Thread.sleep(1000); 
			 //select airLine
			    WebElement cheack_box_1=  driver.findElement(By.xpath("//*[@id=\"fadein\"]/div/form/div[2]/div/div/div/fieldset/div/ul/li[1]/div/label"));
				WebElement cheack_box_2 = driver.findElement(By.xpath("//*[@id=\\\"fadein\\\"]/div/form/div[2]/div/div/div/fieldset/div/ul/li[2]/div/label"));
				WebElement cheack_box_3 = driver.findElement(By.xpath("//*[@id=\\\"fadein\\\"]/div/form/div[2]/div/div/div/fieldset/div/ul/li[3]/div/label"));
				WebElement cheack_box_4 = driver.findElement(By.xpath("//*[@id=\\\"fadein\\\"]/div/form/div[2]/div/div/div/fieldset/div/ul/li[4]/div/label"));
				WebElement cheack_box_5 = driver.findElement(By.xpath("//*[@id=\\\"fadein\\\"]/div/form/div[2]/div/div/div/fieldset/div/ul/li[5]/div/label"));
				WebElement cheack_box_6 = driver.findElement(By.xpath("//*[@id=\\\"fadein\\\"]/div/form/div[2]/div/div/div/fieldset/div/ul/li[6]/div/label"));

				for (int i = 0; i <5; i++) 
				{
					//click VietjetAir
					if(i==1)
					{
						cheack_box_1.click();
					}
					//click Srilankan Airlines
					else if(i==2)
					{
						cheack_box_2.click();
					}
					//click Thai Airways
					else if(i==3)
					{
						cheack_box_3.click();
					}
					//click Air India
					else if(i==4)
					{
						cheack_box_4.click();
					}
					//click IndiGo
					else if(i==5)
					{
						cheack_box_5.click();
					}
					//click Vistara
					else if(i==6)
					{
						cheack_box_6.click();
					}
					//unclick ALL moood
					else if(i==7)
					{
						cheack_box_1.click();
						cheack_box_2.click();
						cheack_box_3.click();
						cheack_box_4.click();
						cheack_box_5.click();
						cheack_box_6.click();
						
					}
					
					
				}
				
		  }
		 
		 
		 @Test(priority=7)

		  public void bookingFuction() throws Throwable {
			 
			 Thread.sleep(1000);
			 driver.findElement(By.id("/html/body/main/div/div[2]/section/ul/li[1]/div/form/div/div[2]/div/button")).click();
		 }
			
		 
		 @Test(priority=8)
			public void FiPassengerInformation() throws InterruptedException
			{
				WebElement FirstNameTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[1]/div/div/input"));
				FirstNameTextBox.sendKeys("Dilisha");
				
				
				WebElement LastNameTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/div/input"));
				LastNameTextBox.sendKeys("Priyashan");
				
				
				WebElement EmailTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[3]/div/div/input"));
				EmailTextBox.sendKeys("Dilisha@gmail.com");
				
				
				WebElement PhoneTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[4]/div/div/input"));
				PhoneTextBox.sendKeys("076624640");
				
				
				WebElement AddressTextBox = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[5]/div/div/input"));
				AddressTextBox.sendKeys("BEMMULLEGEDARA,NARAMMALA");
				
				
				Select dropDownCountry = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[6]/div/div/div/span/span[1]/span/span[1]")));
				dropDownCountry.selectByVisibleText("Sri Lanka");
				
				Select dropDownNationality = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[7]/div/div/div/span/span[1]/span/span[1]")));
				dropDownNationality.selectByVisibleText("Sri Lanka");
			}
			@Test(priority=9)
			//Identify the elements and send values
			public void AdultPassengerDetails() throws InterruptedException
			{
				Select dropDownTitle = new Select(driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[1]/select")));
				dropDownTitle.selectByVisibleText("MR");
				
				WebElement FirstNameTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/input"));
				FirstNameTextBox.sendKeys("SHAYAM");
				
				
				WebElement LastNameTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/input"));
				LastNameTextBox.sendKeys("MUNASIGHA");
				
				
				Select dropDownNationality = new Select(driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[1]/select")));
				dropDownNationality.selectByVisibleText("Sri Lanka");
				
				
				Select dropDownMonth = new Select(driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/select")));
				dropDownMonth.selectByVisibleText("05 octomber");
				
				
				Select dropDownDay = new Select(driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/select")));
				dropDownDay.selectByVisibleText("6");
			
				
				Select dropDownYear = new Select(driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/select")));
				dropDownYear.selectByVisibleText("1998");
				
				
				WebElement NICTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[1]/input"));
				NICTextBox.sendKeys("982752025V");
			
				
				WebElement PassportIssuanceMonthTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/select"));
				PassportIssuanceMonthTextBox.sendKeys("12 MAY");
			
				
				WebElement PassportIssuanceDayTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/select"));
				PassportIssuanceDayTextBox.sendKeys("24");
			
				
				WebElement PassportIssuanceYearTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[2]/div/div[3]/select"));
				PassportIssuanceYearTextBox.sendKeys("2017");
			
				
				WebElement PassportExpiryMonthTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[3]/div/div[1]/select"));
				PassportExpiryMonthTextBox.sendKeys("5 MAY");
				Thread.sleep(3000);
				
				WebElement PassportExpiryDayTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[3]/div/div[2]/select"));
				PassportExpiryDayTextBox.sendKeys("27");
				Thread.sleep(3000);
				
				WebElement PassportExpiryYearTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div[3]/div/div[3]/select"));
				PassportExpiryYearTextBox.sendKeys("2030");
				Thread.sleep(3000);
			}
			
			@Test(priority=10)
			public void AdultPassenger2Details() throws InterruptedException
			{
				Select dropDownTitle = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/select")));
				dropDownTitle.selectByVisibleText("MISS");
				
				WebElement FirstNameTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/input"));
				FirstNameTextBox.sendKeys("ANUPAMA");
				Thread.sleep(3000);
				
				WebElement LastNameTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/input"));
				LastNameTextBox.sendKeys("JAYASINGHA");
				Thread.sleep(3000);
				
				Select dropDownNationality = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/select")));
				dropDownNationality.selectByVisibleText("Sri Lanka");
				Thread.sleep(3000);
				
				Select dropDownMonth = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/select")));
				dropDownMonth.selectByVisibleText("08 MAY");
				Thread.sleep(3000);
				
				Select dropDownDay = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[2]/select")));
				dropDownDay.selectByVisibleText("15");
				Thread.sleep(3000);
				
				Select dropDownYear = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[3]/select")));
				dropDownYear.selectByVisibleText("199");
				Thread.sleep(3000);
				
				WebElement NICTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/input"));
				NICTextBox.sendKeys("9988845254V");
				Thread.sleep(3000);
				
				WebElement PassportIssuanceMonthTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[1]/select"));
				PassportIssuanceMonthTextBox.sendKeys("7 MAY");
				Thread.sleep(3000);
				
				WebElement PassportIssuanceDayTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/select"));
				PassportIssuanceDayTextBox.sendKeys("28");
				Thread.sleep(3000);
				
				WebElement PassportIssuanceYearTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[3]/select"));
				PassportIssuanceYearTextBox.sendKeys("2020");
				Thread.sleep(3000);
				
				WebElement PassportExpiryMonthTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[1]/select"));
				PassportExpiryMonthTextBox.sendKeys("01 JUNE");
				Thread.sleep(3000);
				
				WebElement PassportExpiryDayTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/select"));
				PassportExpiryDayTextBox.sendKeys("27");
				Thread.sleep(3000);
				
				WebElement PassportExpiryYearTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[3]/select"));
				PassportExpiryYearTextBox.sendKeys("2028");
				Thread.sleep(3000);
			}
			
			@Test(priority=11)
			public void FillChildPassengerDetails() throws InterruptedException
			{
				Select dropDownTitle = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[1]/select")));
				dropDownTitle.selectByVisibleText("MR");
				
				WebElement FirstNameTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[1]/select"));
				FirstNameTextBox.sendKeys("SANITHA");
				Thread.sleep(3000);
				
				WebElement LastNameTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[1]/select"));
				LastNameTextBox.sendKeys("Herath");
				Thread.sleep(3000);
				
				Select dropDownNationality = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/input")));
				dropDownNationality.selectByVisibleText("Sri Lanka");
				Thread.sleep(3000);
				
				Select dropDownMonth = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/input")));
				dropDownMonth.selectByVisibleText("04 April");
				Thread.sleep(3000);
				
				Select dropDownDay = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/input")));
				dropDownDay.selectByVisibleText("2");
				Thread.sleep(3000);
				
				Select dropDownYear = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/input")));
				dropDownYear.selectByVisibleText("2015");
				Thread.sleep(3000);
				
				WebElement NICTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/input"));
				NICTextBox.sendKeys("");
				Thread.sleep(3000);
				
				WebElement PassportIssuanceMonthTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/input"));
				PassportIssuanceMonthTextBox.sendKeys("25 Sepetember");
				Thread.sleep(3000);
				
				WebElement PassportIssuanceDayTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/input"));
				PassportIssuanceDayTextBox.sendKeys("28");
				Thread.sleep(3000);
				
				WebElement PassportIssuanceYearTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/input"));
				PassportIssuanceYearTextBox.sendKeys("2022");
				Thread.sleep(3000);
				
				WebElement PassportExpiryMonthTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/input"));
				PassportExpiryMonthTextBox.sendKeys("01 January");
				Thread.sleep(3000);
				
				WebElement PassportExpiryDayTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/input"));
				PassportExpiryDayTextBox.sendKeys("27");
				Thread.sleep(3000);
				
				WebElement PassportExpiryYearTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/input"));
				PassportExpiryYearTextBox.sendKeys("2028");
				Thread.sleep(3000);
			}
			
			@Test(priority=12)
			public void FillInfantPassengerDetails() throws InterruptedException
			{
				Select dropDownTitle = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/div[1]/select")));
				dropDownTitle.selectByVisibleText("MR");
				
				WebElement FirstNameTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/div[2]/input"));
				FirstNameTextBox.sendKeys("DINUSHA");
				Thread.sleep(3000);
				
				WebElement LastNameTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/div[3]/input"));
				LastNameTextBox.sendKeys("SUBASINHA");
				Thread.sleep(3000);
				
				Select dropDownNationality = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[2]/div[1]/select")));
				dropDownNationality.selectByVisibleText("Sri Lanka");
				Thread.sleep(3000);
				
				Select dropDownMonth = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[2]/div[2]/div/div[1]/select")));
				dropDownMonth.selectByVisibleText("05 AGUST");
				Thread.sleep(3000);
				
				Select dropDownDay = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[3]/div[2]/div[2]/div[2]/div/div[2]/select")));
				dropDownDay.selectByVisibleText("28");
				Thread.sleep(3000);
				
				Select dropDownYear = new Select(driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[2]/div[2]/div/div[3]/select")));
				dropDownYear.selectByVisibleText("2021");
				Thread.sleep(3000);
				
				WebElement NICTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[3]/div[1]/input"));
				NICTextBox.sendKeys("7894561230");
				Thread.sleep(3000);
				
				WebElement PassportIssuanceMonthTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[3]/div[2]/div/div[1]/select"));
				PassportIssuanceMonthTextBox.sendKeys("01 January");
				Thread.sleep(3000);
				
				WebElement PassportIssuanceDayTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[3]/div[2]/div/div[2]/select"));
				PassportIssuanceDayTextBox.sendKeys("28");
				Thread.sleep(3000);
				
				WebElement PassportIssuanceYearTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[3]/div[2]/div/div[3]/select"));
				PassportIssuanceYearTextBox.sendKeys("2022");
				Thread.sleep(3000);
				
				WebElement PassportExpiryMonthTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[3]/div[3]/div/div[1]/select"));
				PassportExpiryMonthTextBox.sendKeys("01 January");
				Thread.sleep(3000);
				
				WebElement PassportExpiryDayTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[3]/div[3]/div/div[2]/select"));
				PassportExpiryDayTextBox.sendKeys("27");
				Thread.sleep(3000);
				
				WebElement PassportExpiryYearTextBox = driver.findElement(By.xpath("/html/body/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[3]/div[3]/div/div[3]/select"));
				PassportExpiryYearTextBox.sendKeys("2028");
				Thread.sleep(3000);
			}
			@Test(priority=13)
			public void selectPaymentMethod() throws InterruptedException
			{
				//identify the Radio buttons and click the Radio button in the UI
				WebElement RadioButtonBankTransfer = driver.findElement(By.xpath("//*[@id=\"gateway_bank-transfer\"]"));
				WebElement RadioButtonPayLater = driver.findElement(By.xpath("//*[@id=\"gateway_pay-later\"]"));
				WebElement RadioButtonPaypal = driver.findElement(By.xpath("//*[@id=\"gateway_paypal\"]"));
				WebElement RadioButtonStripe = driver.findElement(By.xpath("//*[@id=\"gateway_stripe\"]"));
				
				//click pay later option 
				RadioButtonPayLater.click();
				
				if(RadioButtonBankTransfer.isSelected())
				{
					System.out.println("Bank transfer radio button has been selected");
				}
				else if(RadioButtonPayLater.isSelected())
				{
					System.out.println("Pay later radio button has been selected");
				}
				else if(RadioButtonPaypal.isSelected())
				{
					System.out.println("Paypal radio button has been selected");
				}
				else
				{
					System.out.println("Stripe radio button has been selected");
				}
				Thread.sleep(10000);
			}
			@Test(priority=14)
			public void ClickConfirmBookingButton() throws InterruptedException
			{
				//Identify the confirm button and click the button in the UI
				WebElement ConfirmBookingButton = driver.findElement(By.id("booking"));
				ConfirmBookingButton.click();
				Thread.sleep(3000);
			}
			
			
		}
	

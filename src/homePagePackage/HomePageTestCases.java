package homePagePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTestCases extends Parameters {

	@BeforeTest

	public void mySetup() {
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

	}

	@Test(priority = 1, enabled = false)

	public void addAllIitem() throws InterruptedException {

		WebElement Contanier = driver.findElement(By.className("products"));
		List<WebElement> myList = Contanier.findElements(By.cssSelector("a.btn.btn-success[ng-click*='add(item)']"));

		for (int i = 0; i < myList.size(); i++) {

			WebElement item = myList.get(i);
			item.click();

			Thread.sleep(2000);

		}

	}

	@Test(priority = 2, enabled = false)

	public void checkOut() throws InterruptedException {

		WebElement cartBtn = driver.findElement(By.xpath("//a[@href='#/cart']"));
		cartBtn.click();

		Thread.sleep(2000);

		WebElement CheckoutBtn = driver.findElement(By.cssSelector("a[class='ng-scope']"));
		CheckoutBtn.click();

		Thread.sleep(2000);

		WebElement ForeName = driver.findElement(By.id("forename"));
		ForeName.sendKeys(MyForename);
		Thread.sleep(1000);

		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys(MyEmail);
		Thread.sleep(1000);

		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys(MyAddress);
		Thread.sleep(1000);

		WebElement CardType = driver.findElement(By.id("cardType"));

		Select select = new Select(CardType);

		select.selectByVisibleText("Mastercard");

		Thread.sleep(1000);

		WebElement CardNumber = driver.findElement(By.id("card"));
		CardNumber.sendKeys(MyCardNum);
		Thread.sleep(1000);

		WebElement SubmitBtn = driver.findElement(By.id("checkout-submit-btn"));
		SubmitBtn.click();

	}

	@Test(priority = 3,enabled = false)

	public void addSecondRow() throws InterruptedException {
		
		WebElement Contanier = driver.findElement(By.className("products"));
		List<WebElement> mySecoundList = Contanier.findElements(By.cssSelector("a.btn.btn-success[ng-click*='add(item)']"));
		
		for(int i = 4 ; i<mySecoundList.size();i++) {
			
			WebElement item = mySecoundList.get(i);
			item.click();

			Thread.sleep(3000);
			
		}
		
		
		
		
			
		}
		
		
		@Test(priority = 4,enabled = false)
		
		public void removeFiirstThird() throws InterruptedException {
			
			WebElement cartBtn = driver.findElement(By.xpath("//a[@href='#/cart']"));
			cartBtn.click();
			
			Thread.sleep(2000);
			
			
			WebElement RemoveItemOne = driver.findElement(By.xpath("//ng-confirm[@action-text='Are you sure that you want to remove <strong>Smiley Bear</strong> from your cart?']//a[@class='remove-item btn btn-mini btn-danger']"));
			RemoveItemOne.click();
			
			Thread.sleep(1000);
			WebElement YesBtn = driver.findElement(By.cssSelector("a[class='btn btn-success']"));
			YesBtn.click();
			
			
			Thread.sleep(1000);
			
			
			WebElement RemoveItemThree = driver.findElement(By.xpath("//ng-confirm[@action-text='Are you sure that you want to remove <strong>Valentine Bear</strong> from your cart?']//i[@class='icon-remove icon-white']"));
			RemoveItemThree.click();
			
			Thread.sleep(1000);
			
			WebElement YesBtnTwo = driver.findElement(By.cssSelector("a[class='btn btn-success']"));
			YesBtnTwo.click();
			
				
					
		   }
		
		
		@Test()
		
		
		public void addHighestAmount() {
			
			
			
			
			List<WebElement> products = driver.findElements(By.className("products"));

	        // Initialize variables to track the highest price and its corresponding product
	        double highestPrice = 0;
	        WebElement productWithHighestPrice = null;

	        // Iterate through each product to find the one with the highest price
	        for (WebElement product : products) {
	            // Extract the price of the product
	            String priceText = product.findElement(By.xpath("//li[@id='product-7']//span[@class='product-price ng-binding'][normalize-space()='$14.99']")).getText();
	            // Remove currency symbol and convert the price to double
	            double price = Double.parseDouble(priceText.replaceAll("[^0-9.]", ""));
	            
	            // Check if the current product's price is higher than the highest price found so far
	            if (price > highestPrice) {
	                highestPrice = price;
	                productWithHighestPrice = product;
	            }
	        }

	        // Click on the "Add to Cart" button of the product with the highest price
	        if (productWithHighestPrice != null) {
	            productWithHighestPrice.findElement(By.cssSelector("li[id='product-7'] a[class='btn btn-success']")).click();
	            System.out.println("Added the product with the highest price to the cart.");
	        } else {
	            System.out.println("No products found.");
	        }
			
			
			
			
			
		}
				
		
		
		
		
		
			
		
		
		
				
				
			
			
			
			
			
		}
		
		
		
		
		
		
		

	



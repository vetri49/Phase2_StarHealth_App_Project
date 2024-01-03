package com.simplilearn.bddtest.stepdefinitions;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StarHealthSteps {
	String driverpath="C:\\Phase2_Eclipse_Workspace\\Phase2_Selenium_StarHealth_App\\src\\test\\resources\\drivers\\windows\\geckodriver.exe";
	WebDriver driver;
	
	@Before(value="@Test")
	public void setUp() {
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
	
	@After(value="@Test")
	public void cleanUp() {
		if(driver!=null)
			driver.quit();
	}
	
	
	@Given("^User launches the Star Health application with \"([^\"]*)\"$")
	public void user_launches_the_star_health_application_with(String url) {
	    driver.get(url);
	}
	

	@Given("User waits for the Welcome to Star Health pop-up and closes it")
	public void user_waits_for_the_welcome_to_star_health_pop_up_and_closes_it() {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@Then("User validates the Star Health home page title using a JUnit assertion")
	public void user_validates_the_star_health_home_page_title_using_a_j_unit_assertion() {
	    String expectedTitle="Star Health Insurance: Medical, Accident and Travel insurance policies";
	    Assertions.assertEquals(expectedTitle,driver.getTitle());
	}

	@Then("User clicks on the Buy Now button")
	public void user_clicks_on_the_buy_now_button() {
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/div[2]/div[2]/div")).click();
	}

	@Then("User types Name as \"([^\"]*)\"$")
	public void user_types_name_as(String name) {
	    driver.findElement(By.id("fullname")).sendKeys(name);
	}

	@Then("User types Phone as \"([^\"]*)\"$")
	public void user_types_phone_as(String mobile) {
		driver.findElement(By.id("email")).sendKeys("mkidir@mail.com");
		driver.findElement(By.id("mobile")).sendKeys(mobile);
	}

	@Then("User types the PIN as \"([^\"]*)\"$")
	public void user_types_the_pin_as(String pincode) {
		driver.findElement(By.id("zipcode")).sendKeys(pincode);
	}

	@Then("User clicks on I need health insurance from the drop-down menu")
	public void user_clicks_on_i_need_health_insurance_from_the_drop_down_menu() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("/html/body/div[1]/div/main/form/div/div/div/div[1]/div/div/div[2]/div/button")).click();
       driver.findElement(By.id("myself")).click();
       
	}
       

	@Then("User selects the option \"([^\"]*)\"$")
	public void user_selects_the_option(String string) {
		
	    
	}

	@Then("User sees the Plan for My Family page")
	public void user_sees_the_plan_for_my_family_page() {
	   
	}

	@Then("User validates that the mobile number is the same as the previously entered number using a JUnit assertion")
	public void user_validates_that_the_mobile_number_is_the_same_as_the_previously_entered_number_using_a_j_unit_assertion() {
	 
	}

	@Then("User clicks on the Star Health logo")
	public void user_clicks_on_the_star_health_logo() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("https://www.starhealth.in/");
	}

	@Then("The Application should redirect to the home page")
	public void the_application_should_redirect_to_the_home_page() {
	    
	}

	@Then("User closes the child tab")
	public void user_closes_the_child_tab() {
	    driver.manage().window().maximize();
	}

	@Then("User navigates back to the parent tab")
	public void user_navigates_back_to_the_parent_tab() {
	    driver.manage().window().minimize();
	}

}

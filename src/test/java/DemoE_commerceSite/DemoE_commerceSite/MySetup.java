package DemoE_commerceSite.DemoE_commerceSite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySetup {
	
	WebDriver driver = new ChromeDriver();
	Random Rand = new Random();

	String TheWebSiteUrl = "https://practicesoftwaretesting.com/";

	Connection con;
	Statement stmt;
	ResultSet rs;

	int customerNumber;
	String customerName;
	String contactFirstName;
	String email;
	String password;
	LocalDate dateOfBirth;
	String addressLine;
	String PostalCode;
	String City;
	String State;
	String countryFromDb;
	String PhoneNumber;
	int productsToAdd = 3;
	int addedCount = 0;
	int tryCount = 0;
	
	String[] product = { "drill", "Wrench", "Pliers", "Sander", "Saw", "Hammer" };
	
	
	public void SetUp() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "246846");
		driver.get(TheWebSiteUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
	}

}

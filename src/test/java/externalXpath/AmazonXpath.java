package externalXpath;

public class AmazonXpath 
{
	// login xpath
	
	public static final String signin = "//*[text() = 'Hello, sign in']";
	public static final String userid = "//*[@type='email']";
	public static final String ctnbtn = "//*[@id=\"continue\"]";
	public static final String err1 = "//*[@id=\"auth-email-invalid-claim-alert\"]/div/div";
	public static final String password = "//*[@type = 'password']";
	public static final String submit = "//*[@type='submit']";
	public static final String err2 = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span";
	
	// search products
	public static final String searchtxtbox = "//*[@id=\"twotabsearchtextbox\"]";
	
	public static final String productdcp = "//*[@class = 'a-size-base-plus a-color-base']";

	// new customer
	public static final String starthere = "//*[text() = 'Start here.']";
	public static final String name = "//*[@placeholder = 'First and last name']";
}

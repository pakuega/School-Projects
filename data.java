import java.util.*;
import java.text.*;
import java.io.*;
import java.security.SecureRandom;
public class data {
	//Variables
	String firstName;
	String lastName;
	String fullName;
	String cardNum = "";
	String ssNum;
	String phoneNum;
	String address;
	String username = null;
	String password = null;
	double creditLine = 2000;
	double currentBalance = 0.0;
	double availableCredit = creditLine;
	double minPayment = 0.0;
	double interestRate = 16.99;
	Scanner kbd = new Scanner(System.in);
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	PrintWriter outputFile = null;
	File statement;
	  
	//Methods
	  
	//This method initializes variables to create
	//a new card. User input is taken.
	//A message is displayed showing new
	//credit card information
	public void OpenNewCard()
	{
	Print("Please enter your first name: ");
	firstName = kbd.nextLine();
	Print("Please enter your last name: ");
	lastName = kbd.nextLine();
	fullName = firstName + " " + lastName;
	Print("Please enter your social security number: ");
	ssNum = kbd.nextLine();
	Print("Please enter your phone number: ");
	phoneNum = kbd.nextLine();
	Print("Please enter your address: ");
	address = kbd.nextLine();
	Print("Please enter your desired username: ");
	username = kbd.nextLine();
	Print("Please enter a password: ");
	password = kbd.nextLine();
	  
	//////
	GenerateCardNumber();
	Print("Credit Card is available for you.");
	quickPrint();
	}


	//This method quickly prints a reusable statement
	//If called and one of the values is uninitialized it will throw an exception
	public void quickPrint() throws NullPointerException {
	Print("Name:");
	System.out.printf("%44s\n", fullName);
	Print("Card number:");
	System.out.printf("%44s\n", cardNum);
	Print("Credit Line:");
	System.out.printf("%44.2f\n", creditLine);
	Print("Available Credit:");
	System.out.printf("%44.2f\n", availableCredit);
	Print("Current Balance:");
	System.out.printf("%44.2f\n", currentBalance);
	Print("Interest Rate:");
	System.out.printf("%44.2f" + "%%\n", interestRate);
	Print("Minimum payment amount Due:");
	System.out.printf("%44.2f\n", minPayment);
	}
	  
	  
	//This method asks for a login then lets the user withdraw credit funds from the credit account
	//Those funds are added to the current balance, the amount of actual money the user has
	//A file is created to summarize the transaction
	public void OneTransaction()
	{
	//If no user or pass exists (null), return and ask to open a card
	if (username == null || password == null)
	{
	Print("No account on file. Please open a new card.");
	return;
	}
	else
	{
	boolean login = loginCheck();
	if (!login)
	{
	return;
	}
	}
	  
	Print("Please provide a description of the place the transaction occured in below:");
	String description = kbd.nextLine();
	Print("What type of transaction will it be today?");
	String type = kbd.nextLine();
	double withdrawalAmount;
	  
	do
	{
	Print("How much will you be withdrawing from your account today?");
	System.out.printf("Available Credit: %.2f\n", availableCredit);
	withdrawalAmount = kbd.nextDouble();
	  
	if (withdrawalAmount > availableCredit)
	{
	Print("Transaction is denied");
	Print("Not enough credit in account. Cancel transaction? 'yes' or 'no'.");
	if (kbd.nextLine() == "yes")
	{
	return;
	}
	else if (kbd.nextLine() == "no")
	{
	continue;
	}
	}
	}
	while (withdrawalAmount > availableCredit);
	  
	currentBalance = currentBalance + withdrawalAmount;
	availableCredit = availableCredit - withdrawalAmount;
	  
	statement = new File("_" + cardNum + ".txt");
	try{
	statement.createNewFile();
	}
	catch (IOException i)
	{
	Print("IOException error");
	}
	try
	{
	outputFile = new PrintWriter(statement.getName());
	}
	catch (FileNotFoundException f)
	{
	Print("File not found");
	}
	Calendar calendar = Calendar.getInstance();
	//Below is also printed to output file
	Print(dateFormat.format(calendar.getTime()) + " " + description + " " + type + " " + "$" + Double.toString(withdrawalAmount));
	outputFile.println(dateFormat.format(calendar.getTime()) + " " + description + " " + type + " " + "$" + Double.toString(withdrawalAmount));
	}

	//This method prints a summary statement to a file
	public void printStatement()
	{
	//If no user or pass exists (null), return and ask to open a card
	if (username == null || password == null)
	{
	Print("No account on file. Please open a new card.");
	return;
	}
	else
	{
	boolean login = loginCheck();
	if (!login)
	{
	return;
	}
	}
	  
	calculateMinPayment();
	System.out.printf("%33s\n", "CREDIT CARD STATEMENT");
	quickPrint();
	Print("Payment Due Date:");
	Calendar calendar = Calendar.getInstance();
	calendar.add(Calendar.DATE, 14);
	System.out.printf("%44s\n", dateFormat.format(calendar.getTime()));
	}
	  
	  

	//Updates the current balance, available credit, and minimum payment
	//Ask users to pay a certain amount - They're paying back what they owe
	public void Payment()
	{
	Print("Please enter the amount to pay:");
	double amountPaid = kbd.nextDouble();
	currentBalance -= amountPaid; //experimental - I assume user pays from their own wallet
	  
	if (currentBalance > 0)
	{
	interestRate = currentBalance * (interestRate/100);
	currentBalance = currentBalance + interestRate;
	}
	  
	availableCredit = creditLine - currentBalance;
	  
	calculateMinPayment();
	Print("Payment processed");
	}

	//Quicky calculates minimum payment
	void calculateMinPayment() {
	//interest rate 16.99 should be .1699 - so divide by 100
	minPayment = currentBalance * (interestRate/100) + currentBalance * .02;
	}
	  
	//Prints available credit amount variable on screen
	public void GetCreditAmount()
	{
	System.out.printf("Current available credit amount: %.2f\n", availableCredit);
	}
	  
	//Prints interest rate variable on screen
	public void GetInterestRate()
	{
	System.out.printf("Interest rate: %.2f\n", interestRate);
	}
	  

	//Ask users to type in their username and password. If incorrect, they can try again or return false
	//If correct, return true
	public boolean loginCheck() {
	String enteredUsername;
	String enteredPassword;
	do
	{
	Print("Debug: Current user and pass:");
	System.out.printf("Username: %s Pass: %s\n", username, password);
	Print("Please type in your username:");
	enteredUsername = kbd.nextLine();
	Print("Please type in your password:");
	enteredPassword = kbd.nextLine();
	if (!enteredUsername.equals(username) || !enteredPassword.equals(password))
	{
	Print("The username or password does not match");
	Print("Try again? Type 'yes' or 'no'.");
	if (kbd.nextLine().equals("no"))
	{
	return false;
	}
	else if (kbd.nextLine().equals("yes"))
	{
	continue;
	}
	}
	}
	while (!enteredUsername.equals(username) || !enteredPassword.equals(password));
	  
	Print("Login successful");
	Print(" ");
	return true;
	}
	  
	  
	//This method generates 4 random 4-digit
	//numbers and combines them to one
	//single card number
	private void GenerateCardNumber()
	{
	SecureRandom random = new SecureRandom();
	for(int count=0; count<4; count++)
	{
	String num1 = Integer.toString(random.nextInt(10));
	String num2 = Integer.toString(random.nextInt(10));
	String num3 = Integer.toString(random.nextInt(10));
	String num4 = Integer.toString(random.nextInt(10));
	String num = num1 + num2 + num3 + num4;
	cardNum += num;
	}
	}

	  
	//Method to quickly print a basic string
	//statement and move down a line
	public void Print(String output)
	{
	System.out.println(output);
	}
	  
	}


package TestingClassPrivacy.Bank;

public class BankAccount {

    private String firstName;
    private String lastName;
    private String accountNumber;
    private double balance;
    private int yearsActive;

    BankAccount(String fn , String ln, String accno, double bal, int years){
        firstName = fn;
        lastName = ln;
        accountNumber = accno;
        balance = bal;
        yearsActive = years;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public int getYearsActive() {
        return yearsActive;
    }

    public void setYearsActive(int yearsActive) {
        this.yearsActive = yearsActive;
    }

    public void printAccount() {
        System.out.println("First Name: " + this.firstName) ;
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("Years Active " + this.yearsActive);
    }
}

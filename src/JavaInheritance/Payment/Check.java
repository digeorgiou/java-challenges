package JavaInheritance.Payment;

public class Check extends Payment{
    private int checkNumber;
    private String bankCode;

    public Check(double amount, String bankCode, int checkNumber) {
        super(amount);
        this.bankCode = bankCode;
        this.checkNumber = checkNumber;
    }

    public void print() {
        System.out.println("Amount: " + this.getAmount());
        System.out.println("Check Number : " + this.checkNumber);
        System.out.println("Bank Code : " + this.bankCode);
    }
}

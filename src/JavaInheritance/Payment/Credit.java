package JavaInheritance.Payment;

public class Credit extends Payment {
    private String cardNumber;
    private String expDate;

    public Credit(double amount, String cardNumber, String expDate) {
        super(amount);
        this.cardNumber = cardNumber;
        this.expDate = expDate;
    }

    public void print() {
        System.out.println("Amount: " + this.getAmount());
        System.out.println("Card Number : " + this.cardNumber);
        System.out.println("Exp Date : " + this.expDate);
    }
}



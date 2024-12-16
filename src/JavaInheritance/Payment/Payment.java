package JavaInheritance.Payment;

public class Payment {

    private double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }


    public void print() {
        System.out.println("Amount : " + this.amount);
    }
}

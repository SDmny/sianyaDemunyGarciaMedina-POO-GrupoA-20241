public class BankAccount {

    // Atributos -------------------------------------------------------------------------------------------------
    private long accountNumber;
    private double amount=0;
    private char type;

    // Constructor -----------------------------------------------------------------------------------------------
    public BankAccount(long accountNumber, char type) {
        this.accountNumber = accountNumber;
        this.type = type;
    }

    // Getters y Setters ------------------------------------------------------------------------------------------
    public long getAccountNumber() {
        return accountNumber;
    }
    public char getType() {
        return type;
    }
    public double getAmount() {
        return amount;
    }

    // Metodos auxiliares ------------------------------------------------------------------------------------------

    public void addAmount(double amount) {
        if (type == 'A') addAmountA(amount);
        else if (type == 'B') addAmountB(amount);
        else this.amount += amount;
        System.out.println("Saldo actual: " + getAmount());
    }
    private void addAmountA(double amount) {
        if (this.amount + amount <= 50000) {
            this.amount += amount;
        } else {
            System.out.println("Límite de 50,000 para cuenta A alcanzado");
        }
    }
    private void addAmountB(double amount) {
        if (this.amount + amount <= 100000) {
            this.amount += amount;
        } else {
            System.out.println("Límite de 100,000 para cuenta B alcanzado");
        }
    }
    public void substractAmount(double amount) {
        if (type == 'A') substractAmountA(amount);
        else if (type == 'B') substractAmountB(amount);
        else if((this.amount-amount) >= 10000){
            this.amount -= amount;
        }
        else System.out.println("Cantidad minima de 10,000 requerida para cuenta tipo C");
        System.out.println("Saldo actual: " + getAmount());
    }
    private void substractAmountA(double amount) {
        if (this.amount - amount >= 1000) {
            this.amount -= amount;
        } else {
            System.out.println("Cantidad minima de 1,000 requerida para cuenta tipo A");
        }
    }
    private void substractAmountB(double amount) {
        if (this.amount - amount >= 5000) {
            this.amount -= amount;
        } else {
            System.out.println("Cantidad minima de 5,000 requerida para cuenta tipo B");
        }
    }
}


public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of R" + depositAmount + " made. New balance is R" + 
        this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if(balance - withdrawAmount < 0) {
            System.out.println("Insufficient funds! You only have R" + balance + " in your account.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal of R" + withdrawAmount + " processed. Remaining balance = R" + balance);
        }
    }

    //getters
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
//setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        if(balance < 0) {
            System.out.println("Balance cannot be negative.");
            return;
        }
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

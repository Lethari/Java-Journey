
public class BankMain {
    public static void main(String[] args) {
        BankAccount johnsAccount = new BankAccount();
        johnsAccount.setAccountNumber("123456789");
        johnsAccount.setBalance(1000.0);
        johnsAccount.setCustomerName("John Doe");
        johnsAccount.setEmail("john.doe@example.com");
        johnsAccount.setPhoneNumber("123-456-7890");
        johnsAccount.deposit(500.0);
        johnsAccount.withdraw(200.0);
    }
}
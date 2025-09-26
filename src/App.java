import utils.BankAccount;


public class App {

    public static void main(String[] args) {
        


        BankAccount cuenta1 = new BankAccount();

        cuenta1.setAccountNumber("JAVIER");

        cuenta1.setBalance(1000);
        cuenta1.showBalance();
        cuenta1.deposit(500);
        cuenta1.withdraw(300);
        cuenta1.showBalance();



        System.out.println("Persona 2");


     BankAccount cuenta2 = new BankAccount("SERNA", 2000);
        
     cuenta2.showBalance();
        cuenta2.deposit(1000);
        cuenta2.withdraw(3500); 
        cuenta2.showBalance();

 }


    
}

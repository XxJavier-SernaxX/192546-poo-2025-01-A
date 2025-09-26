package utils;

public class BankAccount {
    private String accountNumber;
    private double balance;

    
    public BankAccount() {
         

}



public BankAccount(String account, double balance) {
        this.accountNumber = account;
        this.balance = balance;

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

    public void setBalance(double balance) {
        this.balance = balance;
    }





    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depósito exitoso de "+amount+" Nuevo saldo: " + balance);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }



     public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Se ha retirado;Su nuevo saldo: " + balance);
        } else {
            System.out.println("monto inválido.");
        }
    }

    public void showBalance() {
        System.out.println("Su Saldo actual es de : " + balance);
    }


    
}




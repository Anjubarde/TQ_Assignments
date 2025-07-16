package first.practice;

//Q4)Create a class Account containing following methods :
//insert() to insert account data
//display() to display account information
//deposit() to deposit amount
//withdraw() to withdraw amount
//checkbalance() to check balance
//e.g.
//class Account{
//    int acc_no;
//    String name;
//    float amount;
//}

public class Account {
    int acc_no;
    String name;
    float amount;

    public void insert(int acc_no, String name, float amount) {
        this.acc_no = acc_no;
        this.name = name;
        this.amount = amount;
    }

    public void display() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Balance: " + amount);
    }

    public void deposit(float amount) {
        this.amount += amount;
    }

    public void withdraw(float amount) {
        this.amount -= amount;
    }

    public void checkBalance() {
        System.out.println("Account Balance: " + amount);
    }
}

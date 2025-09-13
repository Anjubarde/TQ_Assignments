package HomeWork_TQ;

/*
3. Covert password to string ->[1M]
password is India'sAge72@2019
convert to UllllSlUllNNSNNNN -> U= Uppercase, l= lowercase, S=
Specialcase, N= Number
shorten above to ->U4lSlU2l2NS4N

Bank            bankid, name,Address(varchar),city,state
Customer        cust_id, bank_id
Accounts        Acc_no,cust_id,Acctype_id,Balance
AccountType     acctype_id,acctype
Transaction     transaction_id, Acc_no,amount,transcation_type
                (1-debit,2-credit),dat e
Customer_Master Cust_id,cname,contact,age,pan_no
*/


import java.util.Date;

public class Bank 
{
    private int bankId;
    private String name;
    private String address;
    private String city;
    private String state;

    // Getters and Setters
}

public class Customer 
{
    private int custId;
    private int bankId;

    // Getters and Setters
}

public class Accounts 
{
    private long accNo;
    private int custId;
    private int accTypeId;
    private double balance;

    // Getters and Setters
}

public class AccountType 
{
    private int accTypeId;
    private String accType;

    // Getters and Setters
}


public class Transaction 
{
    private int transactionId;
    private long accNo;
    private double amount;
    private int transactionType; // 1 = debit, 2 = credit
    private Date date;

    // Getters and Setters
}

public class CustomerMaster 
{
    private int custId;
    private String cname;
    private String contact;
    private int age;
    private String panNo;

    // Getters and Setters
}

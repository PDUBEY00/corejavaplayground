package bankaccountapp;

import javax.xml.transform.sax.SAXSource;

public  abstract class  Account implements IBaseRate{

    String name;
    String niNumber;
    double balance;

    String accountNumber;
    double rate;
    static int index = 10000;




    public Account(String name,String niNumber ,double initDeposit) {
        this.name = name;
        this.niNumber = niNumber;
        this.balance = initDeposit;
        index++;
        this.accountNumber = createAccountNumber();



    }


    public void showInfo() {
        System.out.println( "Account{" +
                "name='" + name + '\'' +
                ", niNumber='" + niNumber + '\'' +
                ", balance=" + balance +
                ", account number = " + accountNumber +
                '}');
    }

    public String createAccountNumber(){
        String lastTwodigitNi = niNumber.substring(niNumber.length()-2,niNumber.length());
        int uniqueDigit = index;
        int randomNum = (int)(Math.random()*Math.pow(10 ,3));

        return lastTwodigitNi+uniqueDigit+randomNum;

    }

    public void deposit(int deposit){
        balance = balance + deposit;
        printBalance();
    }

    public void payment(int amount){
        balance = balance - amount;
        printBalance();
    }

    public void transfer(int amount){
        balance = balance - amount;
        printBalance();
    }

    public void printBalance(){
        System.out.println("Balance is  $"+ balance);
    }

    public abstract void setRate();

    public void compound(){
        double accuredInterest = balance *(rate/100);
        balance =  balance + accuredInterest;
        System.out.println("Accured Interest is "+accuredInterest);
        printBalance();
    }

}

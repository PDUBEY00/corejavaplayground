package bankaccountapp;

public class Checking extends Account {

    int debitCardNumber;
    int debitCardpin;

    public Checking(String name, String niNumber ,double initDeposit) {
        super(name ,niNumber,initDeposit);
        accountNumber = "2" + accountNumber;
        createDebitCardDetails();
        setRate();
    }


    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account details are"+
                           "\ndebitCard " + debitCardNumber+
                            "\ndebit card pin :"+ debitCardpin
        );

    }

    @Override
    public void setRate() {
   rate= baseRate()* 2/100;
        System.out.println("Rate for Checking account is %"+rate);
    }

    private void createDebitCardDetails(){
        debitCardNumber = (int)(Math.random()*Math.pow(10,12));
        debitCardpin = (int)(Math.random()*Math.pow(10,4));
    }



}

package bankaccountapp;

public class Savings extends Account {


    int safetyBoxDepositBoxId;
    int safetydepositBoxKey;

    public Savings(String name,String niNumber ,double initDeposit) {
        super(name ,niNumber,initDeposit);
        accountNumber = "1" + accountNumber;
        createSafetyBoxDetails();
        setRate();

    }

    public void showInfo() {
      super.showInfo();
        System.out.println("Your Savings Accounts details are "+
        "\nsafetyBoxDepositBoxId : "+ safetyBoxDepositBoxId+
        "\n safetydepositBoxKey :"+ safetydepositBoxKey);
    }

    @Override
    public void setRate() {
     rate = baseRate()-.25;
        System.out.println("Rate for Savings account is %"+rate);
    }

    public void createSafetyBoxDetails(){
        safetyBoxDepositBoxId = (int)(Math.random()*Math.pow(10,3));
        safetydepositBoxKey = (int)(Math.random()*Math.pow(10,3));
    }
}

package bankaccountapp;

import bankaccountapp.utilities.CSV;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

       /* Checking checking = new Checking("Prateek dubey" ,"ST123456", 10000.00);
        checking.showInfo();
        checking.deposit(5000);
        checking.transfer(2000);
        checking.compound();
        System.out.println("-----------------------------------------------------");

        Savings saving = new Savings("Shubhangi Bhardwaj","ST123457", 5000.00);
        saving.showInfo();*/
        String inputFilePath = "C:\\Users\\Prateek\\Desktop\\sampleBankAppData.txt";
        List<String[]> customerInfo = CSV.readCsvFile(inputFilePath);
        for (String[] data:customerInfo) {
            String name =(data[0]);
            String niNumber =(data[1]);
            Double initDeposit =Double.parseDouble(data[2]);
            String type = data[3];
            if(type.equalsIgnoreCase("checking")){
                Checking checkingAcc = new Checking(name ,niNumber, initDeposit);
                checkingAcc.showInfo();

            }
            else if(type.equalsIgnoreCase("saving")){
                Savings savingAcc = new Savings(name ,niNumber, initDeposit);
                savingAcc.showInfo();
            }



        }


    }



}

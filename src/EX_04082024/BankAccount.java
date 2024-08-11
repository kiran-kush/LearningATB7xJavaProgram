package EX_04082024;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class BankAccount {
    String Bank_name;
    int balance;
    String BankCode;// Instance variable

    public BankAccount() {
         Bank_name= "SBI";
         balance= 1000;
         BankCode= "SBI010";

    }

    public BankAccount( String bname,int balance, String bankCode) {
        this.Bank_name = bname;
        this.balance = balance;
        BankCode = bankCode;
    }
 // any numbe of varaible can be passed in the constructor, there is no limit in it.
    public BankAccount(String bank_name) {
        Bank_name = bank_name;
    }

    void printDetails(){
        System.out.println("Bankaccount:"+Bank_name);
        System.out.println("Balance:"+balance);
        System.out.println("Bankcode:"+BankCode);


    }
}

import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {
    private String name;
    private String accountNo;
    private String passWord;
    private double balance;

    private double rateOfInterest;

    public SBIUser(String name, String passWord, double balance) {
        this.name = name;
        this.passWord = passWord;
        this.balance = balance;

//        bank is initializing
        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public String addMount(int amount) {
        balance=balance+amount;
        return "Your new balance is: "+balance;
    }

    @Override
    public String withDraw(double amount, String enteredPassWord) {
        String ans="Wrong PassWord!!!";
        if(Objects.equals(passWord,enteredPassWord)) {
            if (amount > balance) {
                ans = "Insufficient amount!!";
            } else {
                balance = balance - amount;
                ans = "please collect your amount!!! and your remaining balance is: " + balance;
            }
        }
        return ans;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public double calcROI(int years) {
        return (balance*years*rateOfInterest)/100 ;
    }
}

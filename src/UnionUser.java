import java.util.Objects;
import java.util.UUID;

public class UnionUser implements BankInterface{
   private String name;

    private String passWord;
    private double balance;
    private double rateOfInterest;
    private String accountNumber;

    public UnionUser(String name, String mobileNo, String passWord, double balance) {
        this.name = name;
        this.passWord = passWord;
        this.balance = balance;

        this.rateOfInterest=6.0;
        this.accountNumber= String.valueOf(UUID.randomUUID());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String addMount(int amount) {
        return null;
    }

    @Override
    public String withDraw(double amount, String enteredPassWord) {
        String ans="Wrong password!!!";
        if(Objects.equals(passWord,enteredPassWord)){
            if(amount>balance){
                ans="Insufficient amount!!!";
            }
            else{
                balance=balance-amount;
                ans="please collect your amount!! Now your ramaining balance is: "+balance;
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
        return (balance*rateOfInterest*years)/100;
    }
}

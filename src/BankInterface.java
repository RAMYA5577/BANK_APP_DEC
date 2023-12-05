public interface BankInterface {
//    add amount
    String addMount(int amount);
//    withdraw
    String withDraw(double amount,String passWord);
//    check Balance
 double checkBalance();
//    calculate rate of interest
    double calcROI(int years);

}

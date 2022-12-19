public class Account {
    //sddsd
 private  double currentMoney = 0;
 private int accountNumber = 12369;
    public Account() {

    }

    public double getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(double currentMoney) {
        this.currentMoney = currentMoney;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(double money, int account) {
        this.currentMoney = money;
        this.accountNumber = account;
    }

    public void ingreso(int bankAccount,int quantity){
        currentMoney= currentMoney+quantity;

    }

    public double reintegro(int quantity){
         currentMoney = currentMoney- quantity;

        return currentMoney;


    }

    public  double tranferencia(double money, int account){
        currentMoney = currentMoney - money;

        return currentMoney;
    }
}

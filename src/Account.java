public class Account {
    //sddsd
 private  double currentMoney = 0;
 private int accountNumber = 12369;
    public Account() {
    }


    public void setCurrentMoney(double currentMoney) {
        this.currentMoney = currentMoney;
    }

    public Account(int accountNumber) {
        this.currentMoney = 0;
        this.accountNumber = accountNumber;
    }
    public double getCurrentMoney() {
        return currentMoney;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


//meter dinero
    public void ingreso(int quantity){
        System.out.println("ingreso de " + quantity + "$");
        currentMoney= currentMoney+quantity;

    }
    public void transferencia(int quantity, Account account){
        System.out.println("transferencia de " + quantity + "$  a la cuenta : " + account.accountNumber  );
        currentMoney= currentMoney-quantity;
        account.currentMoney += quantity;


    }

    public double reintegro(int quantity){
        System.out.println("dinero sacado :" + quantity);
         currentMoney = currentMoney- quantity;

        return currentMoney;


    }



    @Override
    public String toString() {
        return "Account{" +
                "currentMoney=" + currentMoney +
                ", accountNumber=" + accountNumber +
                '}';
    }
}

public class CreditCard {
Account account ;
    private int cardNumber ;
    private int ccv;
    private String rotDate;



    public CreditCard(Account account, int cardNumber, int ccv, String rotDate) {
        this.account = account;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.rotDate = rotDate;
    }



    public void chargeAmount(Account account,int quantity){
        double  currentMoney = account.getCurrentMoney();
        if (currentMoney > quantity){
            System.out.println("you dont have money enought");
        }else{

            account.ingreso(12369,70);


        }



    }
}
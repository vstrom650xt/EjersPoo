import java.text.SimpleDateFormat;

public class CreditCard {
    Account account;
    private int cardNumber;
    private int ccv;
    private String rotDate;


    public CreditCard(Account account, int cardNumber, int ccv, String rotDate) {
        this.account = account;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.rotDate = rotDate;
    }

    public boolean compareDate() {
        String todayDate = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
        boolean rooten = false;
        if (todayDate.compareTo(rotDate) > 0) {
            System.out.println("tu tarjeta ha caducado");
            rooten = true;

        }

        return rooten;

    }


    public void pagarCredito(Account account, int quantity) {
        double currentMoney = account.getCurrentMoney();
        if (currentMoney < quantity) {
            System.out.println("you dont have money enought");
        } else {

            account.ingreso(12369);


        }


    }

    public void pagarDedito(int quantity) {
        if (account.getCurrentMoney() < quantity) {
            System.out.println("no dispones de saldo");
        } else if (compareDate()) {


        } else {
            double a = account.getCurrentMoney();
            a -= quantity;
            account.setCurrentMoney(a);


        }


    }


    @Override
    public String toString() {

        return "CreditCard{" +
                "account=" + account +
                ", cardNumber=" + cardNumber +
                ", ccv=" + ccv +
                ", rotDate='" + rotDate + '\'' +
                '}';
    }


}
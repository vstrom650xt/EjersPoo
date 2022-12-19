import java.text.SimpleDateFormat;

public class Preubas {
    public static void main(String[] args) {
        //prueba enviar transferencia , decrementar en Account1 e incrementar en Account2
        Account account = new Account(1);
        Account account2 = new Account(2);

        System.out.println(account);
        account.ingreso(2000);

        System.out.println(account);
        System.out.println(account2);


        account.transferencia(200, account2);
        System.out.println(account2);
        System.out.println(account);

        account.reintegro(20);
        System.out.println(account);

        ////////
        System.out.println("///////");
        CreditCard creditCard = new CreditCard(account,258796,123,"2010-10-11");
        System.out.println(creditCard);
        creditCard.pagarDedito(999);
        System.out.println(creditCard);


    }
}

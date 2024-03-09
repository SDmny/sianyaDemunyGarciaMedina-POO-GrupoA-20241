import java.util.ArrayList;
import java.util.Iterator;
public class Bank {
    public static ArrayList<BankAccount> accounts = new ArrayList<>();
    public static void seeAccounts(){
        int numId=1;
        Iterator<BankAccount> bankIterator = accounts.iterator();
        System.out.println("Lista de cuentas\n");
        System.out.println("Numero de cuenta\tTipo de cuenta\tSaldo en cuenta");
        while (bankIterator.hasNext()){
            BankAccount bank = bankIterator.next();
            System.out.println(numId+" - "+bank.getAccountNumber() +"\t"+ bank.getType() +"\t"+ bank.getAmount());
            numId++;
        }
        System.out.println("");
    }
    public static void seeAccount(BankAccount account){
        System.out.println("\nNumero de cuenta: "+account.getAccountNumber());
        System.out.println("Tipo de cuenta: "+account.getType());
        System.out.println("Saldo en cuenta: "+account.getAmount());
    }
}


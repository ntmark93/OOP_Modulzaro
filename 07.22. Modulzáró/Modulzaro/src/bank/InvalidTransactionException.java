package bank;

public class InvalidTransactionException extends Exception{
    public InvalidTransactionException(){
        System.out.println("A kért művelet nem végrehajtható");
    }
}

package CompanyInterviewsQuestions.ScalingData;

/*
=== Java Coding Exercise ===

I have the code shown below. The caller of the transferFunds() method is multithreaded
and may call this method with the same account as either the source or the destination
argument from different threads.

For example, in thread 1, account #1 may be the source
while in thread 2 it may be the destination of a transfer. Make the implementation of
this method thread safe. Feel free to rewrite any portion of the transferFunds() method
necessary provided the result is the same. You can add new methods and classes as well.


=== Details & Assumptions ===

- I'm assuming that getAvailableFunds or setAvailableFunds need to be protected (thread-safe) because more than
one thread will read or write to that object and could cause inconsistencies in these values if that aren't
locked down. By wrapping the bulk of the transferFunds method in a synchronized statement. It will lock all
other threads until it finishes with the transfer, withdrawal or deposit.

- Added in the withdrawFunds and depositFunds to clarify these assumptions. If any of these methods are called.
We know that values won't change until the other thread finishes.


 */

public class AccountActions {

    /**
     * Transfers funds from source account to destination account
     * @param source Account Object
     * @param destination Account Object
     * @param amount the amount we are transferring.
     */
    public static void transferFunds(Account source, Account destination, int amount) {
        synchronized (Account.class) {
            if (source.getAvailableFunds() >= amount) {
                source.setAvailableFunds(source.getAvailableFunds() - amount);
                destination.setAvailableFunds(destination.getAvailableFunds() + amount);
            } else {
                throw new IllegalArgumentException("Insufficient funds in source: " + source);
            }
        }
    }

    /**
     * Withdrawals funds from the source account.
     * @param source Account Object
     * @param amount the amount we are withdrawing
     */
    public static void withdrawFunds(Account source, int amount){
        synchronized (Account.class){
            if(source.getAvailableFunds() >= amount){
                source.setAvailableFunds(source.getAvailableFunds() - amount);
            } else {
                throw new IllegalArgumentException("Insufficient funds in source: " + source);
            }
        }
    }

    /**
     * Deposit funds from the source account
     * @param source Account Object
     * @param amount the amount we are withdrawing
     */
    public static void depositFunds(Account source, int amount){
        synchronized (Account.class){
            if(source.getId() != 0L){ //Should validate that an account exits.
                source.setAvailableFunds(source.getAvailableFunds() + amount);
            } else {
                throw new IllegalArgumentException("Insufficient funds in source: " + source);
            }
        }
    }

}


 class Account {

    private long id;
    private int availableFunds;

    public Account(long id, int availableFunds){
        this.id = id;
        this.availableFunds = availableFunds;
    }

     public long getId(){
        return id;
     }

    public int getAvailableFunds(){
        return availableFunds;
    }

    public void setAvailableFunds(int availableFunds){
        this.availableFunds = availableFunds;
    }

}


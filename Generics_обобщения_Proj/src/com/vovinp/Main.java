package com.vovinp;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try{
            int x = 6/0;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        Account acc1 = new Account("First", 5000);
        Account acc2 = new Account("Second", 1000);

        Transaction<Account> tran1 = new Transaction<Account>(acc1,acc2,4000);
        tran1.execute();

        Transaction<Account> tran2 = new Transaction<Account>(acc1,acc2,4000);
        tran2.execute();

    }
}

class Transaction<T extends Account> {
    private T from;     // с какого счёта перевод
    private T to;       // на какой счёт перевод
    private int sum;    // сумма перевода

    Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute() {
        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf(" С аккаунта %s списано %d на аккаунт %s \n", from.getId().toString(), sum, to.getId().toString());
        } else {
            System.out.println("Error transaction, becose sum very big \n");
        }
    }
}

class Account {
    private String id;
    private int sum;

    Account(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

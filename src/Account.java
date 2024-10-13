public class Account {
    private String id;
    private String name;
    private int balance;


    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int Credit(int amount) {
        if (amount >0) {
            balance += amount;
        }
        return balance ;

    }
    public void Debit(int amount) {
        if (amount > balance) {
            System.out.println("Amount exceeded balance");
        } else {
            balance -= amount;
        }
    }
    public int TransferTo(Account destination, int amount) {
        if (amount <= balance) {
            this.Debit(amount);
            destination.Credit(amount);
        } else {
            System.out.println("Amount exceeded balance");

        }
        return balance;

    }
    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }




}

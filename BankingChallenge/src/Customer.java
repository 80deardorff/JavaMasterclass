import java.util.ArrayList;

public class Customer {
    private final String name;
    private final ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

    public void printTransactions() {
        System.out.print("{");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.print((i == (transactions.size()-1)) ?
                    (transactions.get(i) + "}") :
                    (transactions.get(i) + ", "));
        }
    }

    public String getName() {
        return name;
    }
}

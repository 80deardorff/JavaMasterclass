import java.util.ArrayList;

public class Branch {
    private final String name;
    private final ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) != null) {
            System.out.println("Add customer failed. Customer already exists.");
            return false;
        }
        customers.add(new Customer(customerName, initialTransaction));
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double initialTransaction) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(initialTransaction);
            return true;
        }
        return false;
    }

    public boolean removeCustomer(String customerName) {
        int index = getCustomerIndex(customerName);
        if (index >= 0) {
            customers.remove(index);
            return true;
        }
        System.out.println("Remove customer failed. Could not find " + customerName + ".");
        return false;
    }

    public void printCustomerList(boolean showTransactions) {
        System.out.println("Customer list for " + name + " branch " + ((showTransactions) ?
                "[transactions-shown]" : "[transactions-hidden]") + ":");
        for (int i = 0; i < customers.size(); i++) {
            System.out.print(customers.get(i).getName());
            if (showTransactions) {
                System.out.print(" -> ");
                customers.get(i).printTransactions();
            }
            System.out.print("\n");
        }
        System.out.println("--------------------------------");
        System.out.println("Total number of customers: " + customers.size());
    }

    public String getName() {
        return name;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)) {
                return customers.get(i);
            }
        }
        return null;
    }

    private int getCustomerIndex(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }
}

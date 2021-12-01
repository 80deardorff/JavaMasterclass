public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Wells Fargo");
        bank.addBranch("San Jose");
        bank.addBranch("Palo Alto");
        bank.addBranch("Redwood City");
        bank.printBranchList();

        bank.addCustomer("San Jose", "John Smith", 500.50);
        bank.addCustomer("San Jose", "Bob Smith", 200.01);
        bank.addCustomer("San Jose", "Sam Smith", 420.69);
        bank.addCustomer("Palo Alto", "John Doe", 69.69);

        bank.addCustomerTransaction("San Jose", "Bob Smith", 10.88);

        bank.listCustomers("San Jose", true);
        bank.listCustomers("Palo Alto", false);
        bank.listCustomers("Redwood City", true);

        if(!bank.listCustomers("Oakland", true)) {
            System.out.println("Branch does not exist...");
        }
    }
}

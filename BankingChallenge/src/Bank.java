import java.util.ArrayList;

public class Bank {
    private final String name;
    private final ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public void printBranchList() {
        System.out.println("Branch list for " + name + " Bank:");
        for (int i = 0; i < branches.size(); i++) {
            System.out.println(branches.get(i).getName());
        }
        System.out.println("--------------------------------");
        System.out.println("Total number of branches: " + branches.size() + "\n");
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) != null) {
            System.out.println("Add branch failed. Branch already exists.");
            return false;
        }
        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.printCustomerList(showTransactions);
            System.out.println();
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return branches.get(i);
            }
        }
        return null;
    }

    private int getBranchIndex(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }
}

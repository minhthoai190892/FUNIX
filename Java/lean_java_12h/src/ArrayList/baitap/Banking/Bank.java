package ArrayList.baitap.Banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchs;

    public Bank(String name) {
        this.name = name;
        this.branchs = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        // kiểm tra xem "branch" có trong arraylist chưa
        if (findBranch(branchName) == null) {
            this.branchs.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    // thêm khách hàng
    public boolean addCustomer(String branchName, String cunstomerName, double initalAmount) {
        // kiểm tra xem chi nhánh có tồn tại không
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(cunstomerName, initalAmount);
        }
        return false;
    }

    // phương thức giao dịch
    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        // kiểm tra xem chi nhánh có tồn tại không

        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branchs.size(); i++) {
            Branch checkBranch = this.branchs.get(i);
            if (checkBranch.getName().equals(branchName)) {
                return checkBranch;
            }
        }
        return null;
    }

    // list customer
    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            // tạo danh sách "customer" lấy từ danh sách branch;
            ArrayList<Customer> branchCustomers = branch.getCustomers();// => ta đã có danh sách khách hàng
            // sử dụng vòng lập để in danh sách
            for (int i = 0; i < branchCustomers.size(); i++) {
                // tạo biến kểu Customer
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                // in danh sách thực hiện giao dịch của khách hàng
                if (showTransactions) {
                    System.out.println("Transactions");
                    // tạo một danh sách giao dịch của khách hàng kểu Double
                    ArrayList<Double> transactions = branchCustomer.getTransaction();
                    // sử dụng vòng lặp để in danh sách
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {

            return false;
        }
    }
}

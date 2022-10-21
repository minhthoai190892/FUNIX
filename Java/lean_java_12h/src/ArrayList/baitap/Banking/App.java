package ArrayList.baitap.Banking;

public class App {
    public static void main(String[] args) {
        // tạo dối tượng Bank
        Bank bank = new Bank("National Australia Bank");
        // thêm chi nhánh (branch)
        bank.addBranch("Adelaide");
        // Thêm khách hàng
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
        // thêm chi nhánh (branch)
        bank.addBranch("Sydney");
        // Thêm khách hàng
        bank.addCustomer("Sydney", "Bob", 150.54);

        // thêm giao dịch
        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
        if (!bank.addCustomerTransaction("Adelaide", "Tim", 100.10)) {
            System.out.println("asdqwe");
        }

        // bank.addBranch("Melboure");
        // if (!bank.addCustomer("Melboure", "Brain", 10000)) {
        //   System.out.println("Error Melboure branch dose not exist");
        // }


        bank.listCustomers("Adelaide", true);
    }
}

package Oops_Concepts.Oops1.CRM;

public class CRMmain {
    public static void main(String[]args){
        CRM Crmapp = new CRM();

        Crmapp.addCustomer(new Customer(1, "Sri Balaji","6374111321"));
        Crmapp.addCustomer(new Customer(2,"Ram","9952048552"));

        System.out.println("All Customers: ");
        Crmapp.listCustomers();

        System.out.println("\nSearch Result");
        Crmapp.findByPhone("6374111321");
    }
}

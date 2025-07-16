package Oops_Concepts.Oops1.CRM;

import java.util.ArrayList;

public class CRM {
      ArrayList<Customer> customers= new ArrayList<>();

      void addCustomer(Customer c){
          customers.add(c);
      }

      void listCustomers(){
          for(Customer c : customers){
              c.display();
          }
      }

    void findByPhone(String phone) {
        boolean found = false;

        for (Customer c : customers) {
            if (c.phone.equals(phone)) {
                System.out.println("Customer Found:");
                c.display();
                found = true;
                break;  // stop after first match
            }
        }

        if (!found) {
            System.out.println("Customer not found with phone: " + phone);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.comp;



/**
 *
 * @author ereni
 */
public class Comp {

   public static void main(String[] args) {
      CommissionEmployee employee = new CommissionEmployee("Henrick", "Harry", "135-21-649", 25000, 0.6);
      BasePlusCommissionEmployee newEmp = new BasePlusCommissionEmployee(employee, 15000);

    
      System.out.println(employee);
      System.out.printf("Earnings: $%.2f%n%n", employee.earnings());

     
      System.out.println(newEmp);
      System.out.printf("Your Earnings: $%.2f%n%n", newEmp.earnings());
      
     
      newEmp.setBaseSalary(12500);
        System.out.println("Your base salary has updated");
     System.out.println(newEmp.toString());
     
    
   }

}

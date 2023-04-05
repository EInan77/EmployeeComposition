/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.comp;

/**
 *
 * @author ereni
 */
public class BasePlusCommissionEmployee {
   private double baseSalary;
   private CommissionEmployee emp1;

   public BasePlusCommissionEmployee(CommissionEmployee emp1, double baseSalary) {
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }       

      this.emp1 = emp1;
      this.baseSalary = baseSalary;
   }

   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }       

      this.baseSalary = baseSalary;                
   } 

   public double getBaseSalary() {
      return baseSalary;
   }

   public double earnings() {
      return getBaseSalary() + emp1.earnings();
   }

   @Override
   public String toString() {
      return String.format("%s %s%n%s: %.2f", "base-salaried",
         emp1.toString(), "base salary", getBaseSalary());   
   } 
}
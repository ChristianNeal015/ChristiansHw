package employee;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {

//        SalarieEmployee salariedEmployee = new SalarieEmployee("Peter", 20.0f,10000.00,LocalDate.of(1996,2,07),new Personality("leftbrain","red"), new Cars(5,"tesla"));
//        System.out.println(salariedEmployee.getPaymentAmount());


        Vendor vendor = new Vendor(200, 10.0);
        System.out.println(vendor.getPaymentAmount());
//        SalarieEmployee salarieEmployee = new SalarieEmployee("Mikey", 25.0f, 34, LocalDate.of(1996, 5, 2), new Personality( "one track minded", "blue"), new Cars("Blue"));
////        salarieEmployee.setPronoun("Lesbian");
////        Entrepreneur entrepreneur = new Entrepreneur("Christian", 40.0, 50.0);
//        Person person2 = new Entrepreneur("Damon", 1000.0, 3000.0);
//        System.out.println(person2);
//        person2 = new Employee("Matt", 40.f);
//        System.out.println(person2);
//        ((Employee)person2).calculatePay();
//
//        getPersonName(person2);
//        Person[] people = {person, person2}
//        for
//        Employee employee = new Employee("Dude", 34.5f);
//        employee.calculatePay();

//        employee.sex = 'M';
//        System.out.println(employee.getPronoun());
//        System.out.println(employee.sex);


//        int x = 10;
//
//        Employee employee1 = new Employee("Christian", 40.0f, 20.00);
//        System.out.println(employee1.getHourlyRates());
//        employee1.calculatePay();
    }

//    public static void getPersonName(Person person){
//      if (person instanceof Employee){
//          System.out.println(person.getName() + " has a boss");
//      }else if (person instanceof Entrepreneur){
//          System.out.println(person.getName() + " is living their best life!");
//      }else{
//          System.out.println("You are a person with no job or broke");
//      }
//    }
}

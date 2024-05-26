package T3_1;

public class Main {

  public static void main(String[] args) {

    Employee Supertf = new Employee("Supertf");
    Employee PGE = new Employee("PGE");

    StaffList staffList = new StaffList();
    staffList.addEmployee(Supertf);
    staffList.addEmployee(PGE);

    for (Employee employee : staffList){
      System.out.println(employee);
    }
  }
}

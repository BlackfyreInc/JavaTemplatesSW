public class Client {

  public static void main(String[] args) {
    SalesTeam supermarketTeam = new SalesTeam();
    supermarketTeam.addEmployee(createMeatDepartment());
    supermarketTeam.addEmployee(createMilkDepartment());
    supermarketTeam.addEmployee(createConfectioneryDepartment());
    supermarketTeam.payExpenses();
  }

  private static SalesTeam createMeatDepartment() {
    SalesTeam meatDep = new SalesTeam();

    Manager manager = new Manager("Nigel", 350);
    Salesperson salesperson_1 = new Salesperson("Eugene", 250, manager);
    Salesperson salesperson_2 = new Salesperson("Brian", 190, manager);
    Salesperson salesperson_3 = new Salesperson("Michal", 215, manager);

    meatDep.addEmployee(manager);
    meatDep.addEmployee(salesperson_1);
    meatDep.addEmployee(salesperson_2);
    meatDep.addEmployee(salesperson_3);

    return meatDep;
  }

  private static SalesTeam createMilkDepartment() {
    SalesTeam milkDep = new SalesTeam();

    Manager manager = new Manager("Jakub", 200);
    Salesperson salesperson_1 = new Salesperson("Oliver", 160, manager);
    Salesperson salesperson_2 = new Salesperson("Maria", 145, manager);
    Salesperson salesperson_3 = new Salesperson("Irene", 155, manager);

    milkDep.addEmployee(manager);
    milkDep.addEmployee(salesperson_1);
    milkDep.addEmployee(salesperson_2);
    milkDep.addEmployee(salesperson_3);

    return milkDep;
  }

  private static SalesTeam createConfectioneryDepartment() {
    SalesTeam confectioneryDep = new SalesTeam();

    Manager manager = new Manager("Michaela", 240);
    Salesperson salesperson_1 = new Salesperson("Anastasia", 180, manager);
    Salesperson salesperson_2 = new Salesperson("Abdel", 180, manager);
    Salesperson salesperson_3 = new Salesperson("Han", 180, manager);

    confectioneryDep.addEmployee(manager);
    confectioneryDep.addEmployee(salesperson_1);
    confectioneryDep.addEmployee(salesperson_2);
    confectioneryDep.addEmployee(salesperson_3);

    return confectioneryDep;
  }
}

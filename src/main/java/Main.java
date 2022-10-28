import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String PERSIST_UNIT = "def";
    private static final EntityManager em = Persistence
            .createEntityManagerFactory(PERSIST_UNIT)
            .createEntityManager();

    public static void main(String[] args) {
        System.out.println(Utils.WELCOME);
        System.out.println(Utils.OPTIONS);

        em.getTransaction().begin();

        switch (scanner.nextLine()) {
            case "2" ->printChangeCasing();
            case "3"->printContainsEmployee();
            case "4"-> printEmployeeWithSalaryOver50000();
            case "5"->printEmployeesFromDepartment();
            case "6"->printAddingANewAddressAndUpdatingEmployee();
            case "7"->printAddressesWithEmployeeCount();
            case "8"->printGetEmployeeWithProject();
            case "9"->printFindLatest10Projects();
            case "10"->printIncreaseSalaries();
            case "11"->printFindEmployeesByFirstName();
            case "12"->printEmployeesMaximumSalaries();
            case "13"->printRemoveTowns();
        }

        em.getTransaction().commit();
    }

    private static void printRemoveTowns() {
    }

    private static void printEmployeesMaximumSalaries() {

    }

    private static void printFindEmployeesByFirstName() {

    }

    private static void printIncreaseSalaries() {

    }

    private static void printFindLatest10Projects() {

    }

    private static void printGetEmployeeWithProject() {

    }

    private static void printAddressesWithEmployeeCount() {

    }

    private static void printAddingANewAddressAndUpdatingEmployee() {

    }

    private static void printEmployeesFromDepartment() {

    }

    private static void printEmployeeWithSalaryOver50000() {
    }

    private static void printContainsEmployee() {

    }

    private static void printChangeCasing() {

    }
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class InsuranceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InsuranceManager insuranceManager = new InsuranceManager();

        while (true) {
            System.out.println("1. Add Insured Person");
            System.out.println("2. Display All Insured People");
            System.out.println("3. Find Insured Person by Name");
            System.out.println("4. Find Insured Person by gender");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter gender: ");
                    String gender = scanner.nextLine();

                    InsuredPerson person = new InsuredPerson(firstName, lastName, age, phoneNumber, gender);
                    insuranceManager.addInsuredPerson(person);
                    System.out.println("Insured person added.");
                    break;

                case 2:
                    List<InsuredPerson> allInsuredPeople = insuranceManager.getAllInsuredPeople();
                    for (InsuredPerson p : allInsuredPeople) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("Enter first name: ");
                    String searchFirstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String searchLastName = scanner.nextLine();
                    InsuredPerson foundPerson = insuranceManager.findInsuredPersonByName(searchFirstName, searchLastName);
                    if (foundPerson != null) {
                        System.out.println("Found person: " + foundPerson);
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter gender to search for: ");
                    String searchGender = scanner.nextLine();
                    List<InsuredPerson> foundPeopleByGender = insuranceManager.findInsuredPeopleByGender(searchGender);
                    if (!foundPeopleByGender.isEmpty()) {
                        System.out.println("Found people by gender:");
                        for (InsuredPerson p : foundPeopleByGender) {
                            System.out.println(p);
                        }
                    } else {
                        System.out.println("No people found with the specified gender.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
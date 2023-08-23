import java.util.ArrayList;
import java.util.List;

public class InsuranceManager {
    private List<InsuredPerson> insuredPeople;

    public InsuranceManager() {
        insuredPeople = new ArrayList<>();
    }

    public void addInsuredPerson(InsuredPerson person) {
        insuredPeople.add(person);
    }

    public List<InsuredPerson> getAllInsuredPeople() {
        return insuredPeople;
    }

    public InsuredPerson findInsuredPersonByName(String firstName, String lastName) {
        for (InsuredPerson person : insuredPeople) {
            if (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)) {
                return person;
            }
        }
        return null;
    }

    public List<InsuredPerson> findInsuredPeopleByGender(String gender) {
        List<InsuredPerson> matchingPeople = new ArrayList<>();
        for (InsuredPerson person : insuredPeople) {
            if (person.getGender().equalsIgnoreCase(gender)) {
                matchingPeople.add(person);
            }
        }
        return matchingPeople;
    }
}

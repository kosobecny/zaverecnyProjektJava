public class InsuredPerson {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String gender;

    public InsuredPerson(String firstName, String lastName, int age, String phoneNumber, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("First name: %s, Last name: %s, Age: %d, Phone number: %s, Gender: %s", firstName, lastName, age, phoneNumber, gender);
    }
}

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String gender;
    private String qualification;
    private String designation;
    private double salary;

    public Employee(String firstName, String middleName, String lastName,
                    String address, String phone, String email,
                    String gender, String qualification, String designation,
                    double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.qualification = qualification;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters and setters (optional for future use)
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getGender() { return gender; }
    public String getQualification() { return qualification; }
    public String getDesignation() { return designation; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return firstName + " " + middleName + " " + lastName + ", " + designation;
    }
}

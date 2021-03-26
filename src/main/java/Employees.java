public class Employees {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Employees(String surname, String name, String patronymic, String position, String email, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Employee: " +
                "Surname = '" + surname + '\'' +
                ", Name = '" + name + '\'' +
                ", Patronymic = '" + patronymic + '\'' +
                ", Position = '" + position + '\'' +
                ", Email = '" + email + '\'' +
                ", Phone = '" + phone + '\'' +
                ", Salary = " + salary + '$' +
                ", Age = " + age +
                '}';
    }
}

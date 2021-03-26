public class Main {
    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Jafarov", "Elxan", "Ramin", "Data Since", "elkhanjafarov13@gmail.com", "+99455555555", 5000, 13);
        employees[1] = new Employees("Mammedova", "Fatima", "Atrafil", "Java", "fatimamammmedova@gmail.com", "+99455555555", 2000, 50);
        employees[2] = new Employees("Jafarov", "Ramin", "Sahin", "Python", "raminjafarov@gmail.com", "+99455555555", 10000, 38);
        employees[3] = new Employees("Babayeva", "Eleanora", "Sabit", "Sql", "babayevailanora@gmail.com", "+99455555555", 1000, 46);
        employees[4] = new Employees("Quseynov", "Ayxan", "Rasul", "Html & Css", "ayxanquseynov@gmail.com", "+99455555555", 200, 25);
        for (Employees employee :
                employees) {
            System.out.println(employee);
        }
        System.out.println();
        System.out.println("Employees over 40 years old: ");
        for (Employees employee :
                employees) {
            if (employee.getAge() > 40) System.out.println(employee);
        }
    }
}

package sg.edu.rp.c346.employeeinfo;

public class Info {
    String name;
    String role;
    String salary;

    public Info(String name, String role,String salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "AndroidVersion{" +
                name + +'\'' +
                role + '\''+ salary + '\''+
                '}';
    }
}

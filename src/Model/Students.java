package Model;

public class Students {
    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_address() {
        return student_address;
    }

    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }

    public int getStudent_age() {
        return student_age;
    }

    public void setStudent_age(int student_age) {
        this.student_age = student_age;
    }

    public int getStudent_roll_num() {
        return Student_roll_num;
    }

    public void setStudent_roll_num(int student_roll_num) {
        Student_roll_num = student_roll_num;
    }

    public Students(String student_name, String student_address, int student_age, int student_roll_num) {
        this.student_name = student_name;
        this.student_address = student_address;
        this.student_age = student_age;
        Student_roll_num = student_roll_num;
    }

    String student_name;
    String student_address;
    int student_age;
    int Student_roll_num;
    }

import Model.Marks;
import Model.Students;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Students stud1 = new Students("Charles","Kensington",18,24356);
        Students stud2 = new Students("Edgar","Hammersmith",17,13454);
        Students stud3 = new Students("Nigel","Ealing",17,23445);
        Students stud4 = new Students("Henry","Westminster",18,23675);

        Marks m1= new Marks(78,82,72,64,77,33);
        Marks m2= new Marks(60,77,87,83,71,84);
        Marks m3= new Marks(76,84,65,76,56,88);
        Marks m4= new Marks(80,82,60,59,62,55);

        ArrayList<Marks> marks_stud1=new ArrayList<>();
        marks_stud1.add(m1);
        marks_stud1.add(m2);
        marks_stud1.add(m3);
        marks_stud1.add(m4);

        ArrayList<Marks>marks_stud2=new ArrayList<>();
        marks_stud2.add(m1);
        marks_stud2.add(m2);
        marks_stud2.add(m3);
        marks_stud2.add(m4);

        ArrayList<Marks>marks_stud3=new ArrayList<>();
        marks_stud3.add(m1);
        marks_stud3.add(m2);
        marks_stud3.add(m3);
        marks_stud3.add(m4);

        ArrayList<Marks>marks_stud4=new ArrayList<>();
        marks_stud4.add(m1);
        marks_stud4.add(m2);
        marks_stud4.add(m3);
        marks_stud4.add(m4);
    }
}

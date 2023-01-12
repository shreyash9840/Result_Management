package Model;

public class Marks {
    int physics;

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getNepali() {
        return nepali;
    }

    public void setNepali(int nepali) {
        this.nepali = nepali;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getComputers() {
        return computers;
    }

    public void setComputers(int computers) {
        this.computers = computers;
    }

    public Marks(int physics, int chemistry, int maths, int nepali, int english, int computers) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.maths = maths;
        this.nepali = nepali;
        this.english = english;
        this.computers = computers;
    }

    int chemistry;
    int maths;
    int nepali;
    int english;
    int computers;
}


public class ISTStudent extends Student {
    // On your end, finisih the remaining getter /setter calls for
    // all constructors, toString(), and other methods that ser or
    // get our instanc variables. Also, set the access modifier
    // to one of "least privilage" as needed.

    //Instance attributes...
    private int numberOfProgammingCourses;
    private boolean internship;

    //Constructor methods...
    public ISTStudent() {
        super();
        setNumberOfProgammingCourses(0);
        setInternship(false);
    }

    public ISTStudent(String name, String major, double gpa, SSN ssn,
            int numberOfProgammingCourses, boolean internship) {
        super(name, major, gpa, ssn);
        setNumberOfProgammingCourses(numberOfProgammingCourses);
        this.internship = (internship);
    }
    // Getter / Setter methods...

    public int getNumberOfProgammingCourses() {
        return numberOfProgammingCourses;
    }

    public void setNumberOfProgammingCourses(int numberOfProgammingCourses) {
        this.numberOfProgammingCourses = numberOfProgammingCourses;
    }

    public boolean isInternship() {
        return internship;
    }

    public void setInternship(boolean internship) {
        this.internship = internship;
    }

    //Additional methods...
    @Override
    public String toString() {
        return super.toString() + "\tISTSTudent...{" + "\n\t\tnumberOfProgammingCourses="
                + getNumberOfProgammingCourses() + ", \n\t\tinternship="
                + isInternship() 
                +" - "
                +this.getAccomplisments()
                + '}' + "}\n\n";
    }

    @Override
    public int getAccomplisments() {
        if ((this.numberOfProgammingCourses > 1) && (this.internship)) {
            return 10;
        } else {
            return 5;

        }

    }

}

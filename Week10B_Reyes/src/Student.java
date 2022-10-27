
import java.text.DecimalFormat;
import java.util.Locale;

public abstract class Student {
    //Attributes /fields/ instance variables, etc.
    //Note: We don't privatize instance variables in our early
    //      labs, but I'm doing it here as a demo.

    private String name;
    private String major;
    private double gpa;
    private SSN ssn;

    // Constructor(s).
    // Nore : We'll cover constructors in more depth. I'm just
    //        demoing them here.
    public Student() {
        setName("no name");

        setMajor("undecided");
        setGpa(0.00);
        setSsn(new SSN());
    }

    public Student(String name) {
        setName(name);
        setMajor("undecided");
        setGpa(0.00);
        setSsn(new SSN());
    }

    public Student(String name, String major, double gpa) {
        setName(name);
        setMajor(major);
        setGpa(gpa);
        setSsn(new SSN());
        /*
        Note: We will cover more of the below approach later in the course,
              but you can see how this constructor is calling another method as
              part of its logic. This is useful to interrogate and lcease
              validate incoming data to this constructor or, as shown here,
              to enhance the output interpretation.
         */
        System.out.println("This is attribute-dense student, so their ");
        System.out.println("GPA (" + gpa + ") dean's list status: "
                + determineDeansListStatus(gpa));
    }

    public Student(String name, String major, double gpa, SSN ssn) {
        setName(name);
        setMajor(major);
        setGpa(gpa);
        setSsn(ssn);
    }

    // Getter and setter methods(s).
    public String getName() {
        if (name.contains("no name")) {
            return name.toUpperCase();
        } else {
            return name;
        }
    }

    public void setName(String name) {
/*
        if (name.length() > 15) {
            name = name + ", but this is consider a long name (more than  "
                    + "15 characters.";
        } else if (name.length() == 0) {
            name = "no name (updated)";
        } else 
            this.name = name;

        }
*/
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public SSN getSsn() {
        return ssn;
    }

    public void setSsn(SSN ssn) {
        this.ssn = ssn;
    }

    // Additional Methods.
    @Override
    public String toString() {
        return "Student...{" + "\n\tname=" + getName() + "\n\tmajor=" + getMajor()
                + "\n\tgpa=" + formatGPA(setAdjustedStatus(getGpa()))
                + "\n\tssn=" + getSsn()
                + "\n\n";
    }

    public String getFirstCharacter(int option) {
        String letterOne = getName().substring(0, 1);

        if (option == 0) {
            letterOne = letterOne.toLowerCase();
            //return letterOne;
            return getName().substring(0, 1).toLowerCase();
            //Note: We could shrten the above source code
            //      to...
            //      return this.name.substring(0,1).toLowerCase();
            //      ...but we might find it easier to use the method
            //      variable, especially for debugging purposes.
        } else if (option == 1) {
            letterOne = letterOne.toUpperCase();
            return letterOne;
        } else {
            return letterOne;
        }

    }

    private String determineDeansListStatus(double incomingGPA) {
        if (incomingGPA >= 3.50) {
            return "Dean's List (high honors)";
        } else if (incomingGPA >= 3.00) {
            return "Dean's List (regular honors)";
        } else {
            return "(n/a)";
        }

    }

    private double setAdjustedStatus(double incomingGPA) {
        if (incomingGPA <= 1.00) {
            return 0.00;
        } else {
            return incomingGPA;
        }
    }

    public String getOverallStatus() {
        return "Overall status of " + getName() + " is: " + formatGPA(setAdjustedStatus(getGpa()));
    }

    private String formatGPA(double incomingGPA) {
        // For custom format, see:
        //https://www.tutorialspoint.com/java_i18n/java_i18n_decimalformat.htm

        String formattedGPA;
        String pattern = "0.00";
        double number = 123456789.123;

        DecimalFormat numberFormat = new DecimalFormat(pattern);
        formattedGPA = numberFormat.format(incomingGPA);

        return formattedGPA;

    }

    public abstract int  getAccomplisments();
    
    
}


public class CyberStudent extends Student {
    // Instance attributes...

    private int numberCertificates;
    private boolean internshipSecurityAgency;

    // Constructor methods...
    public CyberStudent() {
        super();
        this.numberCertificates = 0;
        this.internshipSecurityAgency = false;
    }

    public CyberStudent(String name, String major, double gpa, SSN ssn,
            int numberCertificates, boolean internshipSecurityAgency) {
        super(name, major, gpa, ssn);
        this.numberCertificates = numberCertificates;
        this.internshipSecurityAgency = internshipSecurityAgency;
    }

// Getter / Setter methods...
//Additional methods...
    @Override
    public String toString() {
        return super.toString() + "\tCyberStudent...{" + "\n\t\tnumberCertificates="
                + this.numberCertificates + ", \n\t\tinternshipSecurityAgency="
                + this.internshipSecurityAgency 
                + " - "
                + +this.getAccomplisments() 
                + '}' + "}\n\n";
    }

    @Override
    public int getAccomplisments() {
        if ((this.numberCertificates > 1) && (this.internshipSecurityAgency)) {
            return 8;
        } else {
            return 4;

        }

    }

}



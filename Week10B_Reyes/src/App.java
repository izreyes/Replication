
public class App {

    public static void main(String[] args) {
        ISTStudent ist1, ist2, ist3;
        CyberStudent cb1, cb2, cb3;

        SSN specialSSN = new SSN(1, 33, 889);

        ist1 = new ISTStudent("Melanie Anderson", "IST", 3.75, specialSSN, 4, true);
        ist2 = new ISTStudent();
        ist3 = new ISTStudent("Joseph Jones", "Cyber", 4.00, 
                new SSN(2, 77, 1234), 1, false);
        cb1 = new CyberStudent();
        cb2 = new CyberStudent("Peter Smith", "CyberSec", 2.45, 
                new SSN(1, 23, 2233), 5, true);
        cb3 = new CyberStudent("Perry Lankford", "CyberSec", 2.75, 
                new SSN(6, 13, 5566), 5, false);
        
        System.out.println("IST Students");
        System.out.println("===========================================");
        
        // Create an array of the ISTSTudents objects. Then, iterate
        // throgh the aray to output its contents.
        
        ISTStudent[] curISTStudent = {ist1, ist2, ist3};
        for (int i = 0; i < curISTStudent.length; i++){
              System.out.println(curISTStudent[i].toString()); 
        }
        
        System.out.println("CyberStudent Students");
        System.out.println("===========================================");
        // Create an array of the CyberStudent objects. Then, iterate
        // throgh the aray to output its contents.
        
        CyberStudent curCyberStudent [] = {cb1, cb2, cb3};
        for (int i = 0; i < curCyberStudent.length; i++){
              System.out.println(curCyberStudent[i].toString()); 
        }

    }

}

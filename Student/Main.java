import java.util.* ;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations() ;
        String choice = "Yes";
        do {
        System.out.println("Enter Name :  ");
        String name = scan.nextLine();

        System.out.println("Enter PRN :  ");
        long prn = Long.parseLong(scan.nextLine());

        System.out.println("Enter GPA :  ");
        double gpa = Double.parseDouble(scan.nextLine());

        System.out.println("Enter Batch :  ");
        String batch = scan.nextLine();

        System.out.println("Enter Branch :  ");
        String branch = scan.nextLine();

        Student student = new Student(name,prn,gpa,batch,branch);
        operations.addStudents(student);

        System.out.println("Do you want to Continue(Yes/No) :  ");
        choice = scan.nextLine();
        }while(!choice.equalsIgnoreCase("No"));

        System.out.println("Enter Name :  ");
        String name = scan.nextLine();

        System.out.println("Enter PRN :  ");
        long prn = Long.parseLong(scan.nextLine());

        System.out.println("Enter GPA :  ");
        double gpa = Double.parseDouble(scan.nextLine());

        System.out.println("Enter Batch :  ");
        String batch = scan.nextLine();

        System.out.println("Enter Branch :  ");
        String branch = scan.nextLine();

        Student student = new Student(name,prn,gpa,batch,branch);
        operations.addStudents(student);
        
        operations.displayStudents();
        operations.removeStudent(student);
        operations.displayStudents();
    }
}
import java.util.* ;

class Student{
    private String name;
    private long prn;
    private double gpa;
    private String batch;
    private String branch;

    public Student(String name , long prn,double gpa , String batch , String branch){
        this.name = name;
        this.prn = prn;
        this.gpa = gpa;
        this.branch = branch;
        this.batch = batch;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getPrn(){
        return prn;
    }
}
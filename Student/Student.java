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

    public void setPrn(long prn){
        this.prn = prn;
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public String getBatch(){
        return batch;
    }

    public void setBatch(String batch){
        this.batch = batch;
    }

    public String getBranch(){
        return branch;
    }

    public void setBranch(String branch){
        this.branch = branch;
    }

    public void display(){
        System.out.println("The Name of Student is :  "+name);
        System.out.println("The Prn of Student is :  "+prn);
        System.out.println("The GPA of Student is :  "+gpa);
        System.out.println("The Batch of Student is :  "+batch);
        System.out.println("The Branch of Student is :  "+branch);
    }

}
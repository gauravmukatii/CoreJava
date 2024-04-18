public class Employee {
    int id ;
    double salary;

    Employee(){

    }

    Employee(int id , double salary){
        this.id = id;
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}

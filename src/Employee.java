import java.util.ArrayList;

public class Employee extends worker{
    private long EmployeeID;
    private String hireDate;

    public Employee(){
            this.EmployeeID = 1;
    }
    public Employee(String name,String birthDate,String hireDate){
        this(name,birthDate,1,hireDate);
    }
    public Employee(String name, String birthDate,long EmployeeID,String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        this.EmployeeID = IDFind(EmployeeID);

    }
    public int yearspent(String hireDate){
        String[] n = hireDate.split("/");
        String getage = n[2];
        int convert = Integer.parseInt(getage);
        return convert - 2024;
    }
    public long IDFind(long ID){

                    if(EmployeeID != ID){
                        return ID;
                    }else{
                        return 0;
                    }
            }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeID=" + EmployeeID +
                ", hireDate='" + hireDate + '\'' +
                ", Year_Spent='" + yearspent(hireDate) + '\'' +
                "} " + super.toString();
    }
}

public class Employee implements Comparable {
 
    int EmpID;
    String Ename;
    double Sal;
    static int i;
 
    public Employee() {
        EmpID = i++;
        Ename = "dont know";
        Sal = 0.0;
    }
 
    public Employee(String ename, double sal) {
        EmpID = i++;
        Ename = ename;
        Sal = sal;
    }
 
    public String toString() {
        return "EmpID " + EmpID + "\n" + "Ename " + Ename + "\n" + "Sal" + Sal;
    }
 
    public int compareTo(Object o1) {
        if (this.Sal == ((Employee) o1).Sal)
            return 0;
        else if ((this.Sal) > ((Employee) o1).Sal)
            return 1;
        else
            return -1;
    }
}
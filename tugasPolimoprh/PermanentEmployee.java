package tugasPolimoprh;

public class PermanentEmployee extends Employee{
    private double Salary; //gaji/minggu
    public PermanentEmployee(String name, String noKTP, double salary) {
    super(name, noKTP);
    setSalary(salary);
    }
    // Menentukan upah
    public void setSalary(double salary) {
    Salary = salary;
    }
    public double getSalary() {
    return Salary;
}
public double earnings() {
return getSalary();
}
public String toString() {
return String.format("Pegawai tetap: " + super.toString() + "\nUpah : " + getSalary() + "\nPendapatan: " + earnings());
}
}

package tugasPolimoprh;

public class DailyEmployee extends Employee{
    private double wage; //upah per jam
    private double hours; //jumlah jam tiap minggu
    public DailyEmployee(String name, String noKTP, double hourlyWage, double hoursWorked) {
    super(name, noKTP);
    setWage(hourlyWage);
    setHours(hoursWorked);
    }
    // menghitung upah
    public void setWage(double hourlyWage){
    wage = hourlyWage;
    }
    public double getWage(){
    return wage;
    }
    // menghitung jam kerja
    public void setHours(double hoursWorked){
    hours = hoursWorked;
    }
    public double getHours(){
    return hours;
    }
    // Menghitung gaji
    public double earnings(){
    if(getHours()<=40) {
    return getWage() * getHours();
    } else {
    return 40 * getWage() + ( getHours()-40) *
    getWage() * 1.5;
    }
}
    public String toString(){
    return String.format("Pekerja Harian: "+ super.toString() + "\nUpah per jam : "+ getWage() + "\nWaktu Kerja: "+ getHours() + "\nPendapatan: " + earnings());
    }
}
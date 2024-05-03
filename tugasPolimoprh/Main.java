package tugasPolimoprh;

import polymorphisme.HourlyEmployee;

public class Main {
    public static void main(String[] args) {
        
        PermanentEmployee pegawaiTetap = new PermanentEmployee("Andrean Noviandi", "1234123412341234", 300000);
        DailyEmployee pegawaiHarian = new DailyEmployee("Haryanto Subiantoro", "4321432143214321", 100000, 35);
        Marketing sales = new Marketing("Gantar Ardiansyah", "1111222233334444", 33, 3333);
        
        System.out.println(pegawaiTetap.toString());
        System.out.println();
        System.out.println(pegawaiHarian.toString());
        System.out.println();
        System.out.println(sales.toString());
    }
}

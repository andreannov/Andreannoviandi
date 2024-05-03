package tugasPolimoprh;

public class Marketing extends Employee{
    private double grossSales;//penjualan per minggu
    private double commissionRate;//komisi

    public Marketing(String name, String noKTP, double sales, double rate){
        super(name, noKTP);
        setGrossSales(sales);
        setCommissionRate(rate);
        }
        // penjualan
        public void setGrossSales(double sales){
        grossSales = sales;
        }
        public double getGrossSales(){
        return grossSales;
        }
        // komisi
        public void setCommissionRate(double rate){
        commissionRate = rate;
        }
        public double getCommissionRate(){
        return commissionRate;
        }
        // pendapatan
        public double earnings(){
        return getCommissionRate()*getGrossSales();
        }

        public String toString(){
        return String.format("Marketing: "+super.toString()+"\nTotal Penjualan: "+getGrossSales()+"\nBesaran Komisi: "+getCommissionRate() + "\nPendapatan: " + earnings());
        }
    }

public class CalculadoraImpuestos {
    // Metodos
    public static double calculateTaxes(int income){
        double taxes = income + (income*.15);
        return taxes;
    }
    public static double calculateTaxes(int income, double taxPerc){
        double taxes = income * (taxPerc/100);
        return taxes;
    }
    public static double calculateTaxes(double taxPerc, double divi, double exem){
        double taxes = divi * (taxPerc/100);
        if(taxes>exem){
            taxes = taxes-exem;
        }
        else {
            taxes = 0;
        }
        return taxes;
    }
}

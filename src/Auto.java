public class Auto extends VehiculoPasajeros {
    private String tipoCombustible;

    //constructor
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible) {
        super(tipoCombustible, modelo, año, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }
    //Getter y setter para tipoCombustible
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    //sobrescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de combustible " + tipoCombustible);
    }

    public double CostodeMantenimiento(double CostoPorKm, double KM) {
        double CostoTotal = CostoPorKm * KM;
        return CostoTotal;
    }
}
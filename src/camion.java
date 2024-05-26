public class camion extends VehiculoCarga {
    private int numEjes;

    //constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje);
        this.numEjes = numEjes;
    }

    @Override
    public void MostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de Ejes: " + numEjes);
    }

    public double CostodeMantenimiento(double CostoPorKm, double KM) {
        double CostoTotal = CostoPorKm * KM;
        return CostoTotal;
    }
}

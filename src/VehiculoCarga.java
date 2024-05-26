public class VehiculoCarga extends Vehiculo {
    private int capacidadCarga;

    //constructor
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje) {
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    //Getter y setter para capacidadcarga
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    //sobrescribir el metodo mostrarInfo()
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("capacidad de carga " + capacidadCarga + "kg");
    }
}

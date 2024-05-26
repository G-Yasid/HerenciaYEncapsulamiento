public class VehiculoPasajeros extends Vehiculo {

    private static int kilometraje;
    private int numPasajeros;

    //Constructor
    public VehiculoPasajeros(String marca, String modelo, int año, int numPasajeros) {
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    //Getter y setter para numPasajeros
public int getNumPasajeros() {
    return numPasajeros;
}

public void setNumPasajeros(int NumPasajeros) {
    this.numPasajeros = numPasajeros,
}

    //sobrescribir el metodo mostrarInfo()
public void mostrarInfo() {
@Override
public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Numero de pasajeros " + numPasajeros);
}

}

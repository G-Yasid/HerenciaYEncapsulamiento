public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    //crear instancias de cada tipo de vehiculo
    Auto auto = new Auto(marca:"Toyota", modelo:"Corolla", año:2020, kilometraje:150000, numPasajeros:5, t..."Gasolina");

    Camion camion = new Camion(Marca:"Volvo", modelo:"FH", año:2019, kilometraje:75000, capacidadCarga:20000, 4);

    //Mostrar la informacion de cada vehiculo
    System.out.println("Informacion del auto ");
auto.MostrarInfo();
System.out.println("Informacion del camion");
Camion.mostrarInfo();
    }
}

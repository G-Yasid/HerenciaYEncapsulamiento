public class vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;

    //constructor
    public vehiculo(String marca, String modelo, int año, int kilometraje); {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
    }

    //Getters y Setters
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}

public String getModelo() {
    return modelo;
}
public void setMarca(String modelo) {
    this.modelo = modelo;
}

public int getAño() {
    return año;
}
public void setAño(String Año) {
    this.año = año;
}

public int getKilometraje() {
    return kilometraje;
}
public void setKilometraje(String marca) {
    this.kilometraje = kilometraje;
}

    //metodo para mostrar la informacion del vehiculo
public void mostrarInfo() {
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Año: " + año);
    System.out.println("Kilometraje: " + kilometraje);
    }
 
    
public void RealizarMantenimiento(String CostoTotal){
    System.out.println("El vehiculo necesita mantenimiento cada cierto periodo de tiempo");
    System.out.println("El costo del mantenimiento es " +CostoTotal);
    }
}
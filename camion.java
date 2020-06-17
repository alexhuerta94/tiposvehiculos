
package tipautos;

public class camion extends Vehiculo {
    int altura;
    int ancho; 

    public camion(int ruedas, int matricula, int puertas, int pasajeros, int tamaño, int motor) {
        super(ruedas, matricula, puertas, pasajeros, tamaño, motor);
    }

     public int getAltura(){
        return altura;
    }

    public void setAltura(int altura){
        this.altura=altura;
    }
    public int getAncho(){
        return altura;
    }

    public void setAncho(int ancho){
        this.ancho=ancho;
    }
}
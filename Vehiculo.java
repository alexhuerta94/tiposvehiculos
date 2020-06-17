
package tipautos;

public class Vehiculo {
int opt;
    int ruedas;
    int matricula;
    int puertas;
    int pasajeros;
    int motor;
    int tamaño;

    public Vehiculo(int ruedas,int matricula,int puertas,int pasajeros, int tamaño, int motor){
        this.opt=opt;
        this.ruedas=ruedas;
        this.matricula=matricula;
        this.puertas=puertas;
        this.pasajeros=pasajeros;
        this.tamaño=tamaño;
        this.motor=motor;
    }

    public int getOption(){
        return opt;
    }

    public void setOption(int opt){
        this.ruedas=opt;
    }

    public int getRuedas(){
        return ruedas;
    }

    public void setRuedas(int ruedas){
        this.ruedas=ruedas;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }

    public int getPuertas(){
        return puertas;
    }
    public void setPuertas( int puertas){
        this.puertas=puertas;        
    }

    public int getPasajeros(){
        return pasajeros;
    }

    public void setPasajeros(int pasajeros){
        this.pasajeros=pasajeros;
    }
   
    public int getmotor (){
       return  motor;
   } 
    public void setmotor (int motor){
        this.motor=motor;
    }
    public int gettamaño (){
       return  tamaño;
   } 
    public void settamaño (int tamaño){
        this.tamaño=tamaño;
    }
}    

    
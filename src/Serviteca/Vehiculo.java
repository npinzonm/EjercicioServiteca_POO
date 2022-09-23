package Serviteca;

public class Vehiculo {  
    
    protected int lavadoGeneral, lavadoMotor, lavadoDebajo, grafito, lavadoTapiceria;
    
    
    public int MostrarlavadoGeneral(){
        return lavadoGeneral;
    }
    
    public int MostrarlavadoMotor(){
        return lavadoMotor;
    }
    
    public int MostrarlavadoDebajo(){
        return lavadoDebajo;
    }
    
    public int MostrarlavadoGrafito(){
        return grafito;
    }
    
    public int MostrarlavadoTapiceria(){
        return lavadoTapiceria;
    }
    
   
    public int SumarLavado(boolean general, boolean motor, boolean debajo, boolean grafito, boolean tapiceria){
        
        int total = 0;
        
        if (general == true){
            total = total + MostrarlavadoGeneral();
        }
        
        if (motor == true){
            total = total + MostrarlavadoMotor();
        }

        if (debajo == true){
            total = total + MostrarlavadoDebajo();
        }

        if (grafito == true){
            total = total + MostrarlavadoGrafito();
        }
        
        if (tapiceria == true){
            total = total + MostrarlavadoTapiceria();
        }        
        
        return total;
        
        
    }
    

    
}

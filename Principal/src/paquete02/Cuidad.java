package paquete02;
public class Cuidad {
    
    private String nomCuidad;
    private String provCuidad;
    
    public Cuidad (String n, String p){
        nomCuidad = n;
        provCuidad = p;
    }
    public void establecerCuidad (String n){
        nomCuidad = n;
    }
    public void establecerProvincia  (String n){
        provCuidad = n;
    }
    public String obtenerCuidad(){
        return nomCuidad;
    }
    public String obtenerProvincia(){
        return provCuidad;
    }
}

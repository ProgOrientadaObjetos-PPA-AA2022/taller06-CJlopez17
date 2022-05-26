package paquete02;
public class Hospital {
    
    private String direccion;
    private String nombre;  
    private Cuidad ciudad;  
    private int especialidades;
    private Doctor [] doctores;
    private Enfermero[] enfermeros; 

    public Hospital(String direccion, String nombre, Cuidad c, int especialidades,
            Doctor[] doctores, Enfermero[] efermeros) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.ciudad = c;
        this.especialidades = especialidades;
        this.doctores = doctores;
        this.enfermeros = efermeros;
    }
   
    public void establecerDireccion(String n){
        direccion = n;
    }
    public void establecerNombre (String n){
        nombre = n;
    }
    public void establecerEspecialistas (){
        especialidades = doctores.length + enfermeros.length;
    }
    public String obtenerDireccion(){
        return direccion;
    }
    public int obtenerEspecialistas(){
        return especialidades;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public Doctor[] obtenerDoctores(){
        return doctores;
    }
    public Enfermero[] obtenerEnfermero(){
        return enfermeros;
    }
    public Cuidad obtenerCuidad(){
        return ciudad; 
    }
    public double totalsueldo(){
        double salariototal=0;
        for (int i = 0; i <  obtenerDoctores().length; i++ ){
           salariototal += obtenerDoctores()[i].obtenerSueldo();   
        }
        for (int i = 0; i <  obtenerEnfermero().length; i++ ){
           salariototal += obtenerEnfermero()[i].obtenerSueldo();   
        }
         return salariototal;
    }
    
    @Override
    public String toString(){ 
        
        String cadena = String.format("Hospital %s",obtenerNombre().toUpperCase()+" \n");
        cadena = String.format("%s Dirrecion: %s\n Ciudad: %s\n Provincicia: %s\n"
                + "Numero de especialistas: %d\n Lista de medicos: \n",cadena, obtenerDireccion()
                , obtenerCuidad().obtenerCuidad(),obtenerCuidad().obtenerProvincia(),
                obtenerEspecialistas());
                for (int i = 0; i <  obtenerDoctores().length; i++ ){
                    cadena = String.format("%s - %s - Sueldo: %.2f - %s\n", cadena,
                            obtenerDoctores()[i].obtenerNombre(),
                            obtenerDoctores()[i].obtenerSueldo(),
                            obtenerDoctores()[i].obtenerTipo());
                }
                cadena = String.format(" %sLista de enfermeros \n",cadena); 
                for (int i = 0; i <  obtenerEnfermero().length; i++ ){
                    cadena = String.format("%s - %s - Sueldo: %.2f - %s\n", cadena,
                            obtenerEnfermero()[i].obtenerNombre(),
                            obtenerEnfermero()[i].obtenerSueldo(),
                            obtenerEnfermero()[i].obtenerTipo());
                }
                cadena = String.format("%s Total de sueldos a pagar por mes: %.2f", cadena, totalsueldo());
        return cadena;
    }
}

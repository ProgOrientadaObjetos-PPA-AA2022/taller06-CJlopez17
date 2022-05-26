package paquete01;
    import java.util.Scanner;
    import paquete02.Cuidad;
    import paquete02.Doctor;
    import paquete02.Enfermero;
    import paquete02.Hospital;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombreHops;
        String nombreDoctor;
        String nombreEnfermero;
        String nombreCiudad;
        String direcionHops;
        String provinciahops;
        double sueldo;
        double sueldo2;
        String tipo;
        String tipo2;
        Doctor [] doctores;
        Enfermero [] enfermeros;
        int numespecilistas;
        int numEnfermeros;

             
        System.out.println("Ingrese el nombre del Hospital: ");
        nombreHops = sc.nextLine();
        System.out.println("Ingrese la direccion del Hospital: ");
        direcionHops = sc.nextLine();
        System.out.println("Ingrese la ciudad del Hospital: ");
        nombreCiudad = sc.nextLine();
        System.out.println("Ingrese la provincia del Hospital");
        provinciahops = sc.nextLine();
        Cuidad ciudad = new Cuidad(nombreCiudad, provinciahops);
        System.out.println("Ingrese el numero de medicos: ");
        numespecilistas = sc.nextInt(); 
                
        doctores = new Doctor[numespecilistas];
        sc.nextLine();
        for (int i = 0; i < numespecilistas; i++){
            System.out.println("Ingrese el nombre del doctor: " + (i + 1));
            nombreDoctor = sc.nextLine();
            System.out.println("Ingrese el sueldo del doctor: " + (i + 1));
            sueldo = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la especialisacion del doctor " + (i+1));

            tipo = sc.nextLine();
            Doctor aux = new Doctor(nombreDoctor, sueldo, tipo);
            doctores[i] = aux;
        }
        System.out.println("Ingrese el numero de enfermeros: ");
        numEnfermeros = sc.nextInt();
        enfermeros = new Enfermero[numEnfermeros];
        for (int i = 0; i < numEnfermeros; i++){
            System.out.println("Ingrese el nombre del Enfermer@: ");
            nombreEnfermero = sc.nextLine();
            sc.nextLine();
            System.out.println("Ingrese el sueldo del Enfermer@: ");
            sueldo2 = sc.nextDouble();
            System.out.println("Ingrese el tipo de contrato del Enfermer@: ");
            sc.nextLine();
            tipo2 = sc.nextLine();
            Enfermero aux = new Enfermero(nombreEnfermero, tipo2, sueldo2);
            enfermeros[i] = aux;
        }
        Hospital hospital1 = new Hospital(direcionHops, nombreHops,ciudad, numespecilistas,
                doctores, enfermeros);
        hospital1.establecerEspecialistas();
        System.out.printf("\n%s\n",hospital1);
    }
}
package paquete2;
import java.util.Scanner;
import taller06.Ciudad;
import taller06.Enfermeras;
import taller06.Hospital;
import taller06.Medicos;
public class Principal {
     public static void main(String[] args){
        // listado de variables para ingreso de datos por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la ciudada del hospital: ");
        String nombreCiudad = sc.nextLine();
        
        System.out.println("Ingrese la provincia del hospital: ");
        String nombreProvincia = sc.nextLine();
        
        Ciudad ciudad = new Ciudad(nombreCiudad, nombreProvincia); 
        
        System.out.println("Ingrese el nombre del Hospital");
        String nombreHospital = sc.nextLine();
        
        System.out.println("Ingresar el numero de Especialidades");
        int numeroEspecialidades = sc.nextInt();
        
        System.out.println("Ingresar la direeccion del Hospital");
        String direccionHospital = sc.next();
        
        Hospital hospital = new Hospital(nombreHospital, ciudad, numeroEspecialidades,
        direccionHospital);
        
        System.out.println("Ingresar numero de Medicos");
        int numeroMedicos = sc.nextInt();
        hospital.inicializarGrupoDeMedicos(numeroMedicos);
        System.out.println("Ingresar numero de Enfermeras");
        int numeroEnfermeras = sc.nextInt();
        hospital.inicializarGrupoDeEnfermeras(numeroEnfermeras);
        
        for (int i = 0; i < numeroMedicos; i++) {
            System.out.printf("Ingresar el nombre del Medico %d: " ,i+1);
            String nombreMedicos = sc.next();
            System.out.printf("Ingresar el sueldo:");
            double sueldo = sc.nextDouble();
            System.out.printf("Ingresar especialidad del medico:");
            String especialidad = sc.next();
            
            Medicos medico = new Medicos(nombreMedicos, especialidad ,sueldo);
            hospital.CrearMedico(medico);
        }
            for (int i = 0; i < numeroEnfermeras; i++) {
            System.out.printf("Ingresar el nombre del Enfermera %d: " ,i+1);
            String nombreEnfermeras = sc.next();
            System.out.printf("Ingresar el sueldo:");
            double sueldo = sc.nextDouble();
            System.out.printf("Ingresar el tipo de contrato del Enfermera:");
            String tipoContrato = sc.next();
            
            Enfermeras enfermera = new Enfermeras(nombreEnfermeras, tipoContrato ,sueldo);
            hospital.CrearEnfermera(enfermera);
        }
            System.out.printf("%s\n",hospital);
    }
}

package taller06;

public class Medicos {
    private String nombreDelDoctor;
    private String especialidad;
    private double sueldoMensual;

    public Medicos(String nombreDoctor, String especialidad, double sueldoMensual) {
        this.nombreDelDoctor = nombreDoctor;
        this.especialidad = especialidad;
        this.sueldoMensual = sueldoMensual;
    }

    public void establecerNombreDelDoctor(String nombreDoctor) {
        this.nombreDelDoctor = nombreDoctor;
    }
    
    public String obtenerNombreDelDoctor() {
        return nombreDelDoctor;
    }      

    public void establecerEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public String obtenerEspecialidad() {
        return especialidad;
    }

    public void establecerSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }
    
    public String toString() {
        return " / " + nombreDelDoctor + " / Especialidad: " + especialidad
                + " / Sueldo: " + sueldoMensual + "\n";
    }
}

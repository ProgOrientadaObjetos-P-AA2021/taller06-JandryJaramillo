package taller06;

public class Enfermeras {
    private String nombre;
    private String tipoDeContrato;
    private double sueldoMensual;

    public Enfermeras(String nombre, String tipoContrato, double sueldoMensual){
        this.nombre = nombre;
        this.tipoDeContrato = tipoContrato;
        this.sueldoMensual = sueldoMensual;
    }    

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerNombre() {
        return nombre;
    }   

    public void establecerTipoDeContrato(String tipoContrato) {
        this.tipoDeContrato = tipoContrato;
    }
    
    public String obtenerTipoDeContrato() {
        return tipoDeContrato;
    }    

    public void establecerSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }
    
    public String toString() {
        return " / " + nombre + " / Tipo de Contrato: " + tipoDeContrato
                + " / Sueldo: " + sueldoMensual + "\n";
    }
}

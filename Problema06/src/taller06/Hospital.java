package taller06;

public class Hospital {
    private String nombreDelHospital;
    private Ciudad ciudad;
    private int numeroDeEspecialidades;
    private Medicos[]conjuntoDeMedicos;
    private Enfermeras[]conjuntoDeEnfermeras;
    private double totalSueldosCancelar;
    private String direccionDelHospital;      

    public Hospital(String name, Ciudad city, int numEsp, String dirHospital) {
        this.nombreDelHospital = name;
        this.ciudad = city;
        this.numeroDeEspecialidades = numEsp;
        this.direccionDelHospital = dirHospital;
    }

    public String obtenerNombreHospital() {
        return nombreDelHospital;
    }

    public void establecerNombreHospital(String nombreHospital) {
        this.nombreDelHospital = nombreHospital;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int obtenerNumeroEspecialidades() {
        return numeroDeEspecialidades;
    }

    public void establecerNumeroEspecialidades(int numeroEspecialidades) {
        this.numeroDeEspecialidades = numeroEspecialidades;
    }

    public Medicos[] obtenerConjuntoMedicos() {
        return conjuntoDeMedicos;
    }

    public void establecerConjuntoMedicos(Medicos[] conjuntoMedicos) {
        this.conjuntoDeMedicos = conjuntoMedicos;
    }

    public Enfermeras[] obtenerConjuntoEnfermeras() {
        return conjuntoDeEnfermeras;
    }

    public void establecerConjuntoEnfermeras(Enfermeras[] conjuntoEnfermeras) {
        this.conjuntoDeEnfermeras = conjuntoEnfermeras;
    }

    public double obtenerTotalSueldosCancelar() {
        return totalSueldosCancelar;
    }

    public void establecerTotalSueldosCancelar() {
        for (int i = 0; i < conjuntoDeMedicos.length; i++) {
            totalSueldosCancelar += conjuntoDeMedicos[i].obtenerSueldoMensual();
        }
        for (int i = 0; i < conjuntoDeEnfermeras.length; i++) {
            totalSueldosCancelar += conjuntoDeEnfermeras[i].obtenerSueldoMensual();
        }
    }

    public String obtenerDireccionHospital() {
        return direccionDelHospital;
    }

    public void establecerDireccionHospital(String direccionHospital) {
        this.direccionDelHospital = direccionHospital;
    }
    int ultimoMedico = 0;
    public void CrearMedico(Medicos medico) {
        
        conjuntoDeMedicos[ultimoMedico]= medico;
        ultimoMedico += 1;
    }
    public void inicializarGrupoDeMedicos(int n) {
        
        conjuntoDeMedicos = new Medicos[n];
    }
    int ultimaEnfermera = 0;
    public void CrearEnfermera(Enfermeras enfermera) {
        
        conjuntoDeEnfermeras[ultimaEnfermera]= enfermera;
        ultimaEnfermera += 1;
    }
    public void inicializarGrupoDeEnfermeras(int n) {
        
        conjuntoDeEnfermeras = new Enfermeras[n];
    }
    public String obtenerEnfermeras() {
        String datos = "";
        
        for (int i = 0; i < conjuntoDeEnfermeras.length; i++) {
            datos = datos + conjuntoDeEnfermeras[i].toString();
        }
        
        return datos;
    }
    public String obtenerMedicos() {
        String datos = "";
        
        for (int i = 0; i < conjuntoDeMedicos.length; i++) {
            datos = datos + conjuntoDeMedicos[i].toString();
        }
        
        return datos;
    }
    
    @Override
    public String toString() {
        return String.format(
                " %s\n"+ "\nDireccion: %s\n" + "Ciudad: %s\n"+ "Provincia: %s\n"
                + "Número de especialidades: %s\n"+ "Medicos del hospital: \n%s\n"
                + "Enfermeras del hospital: \n%s\n" + "\nSueldos a cancelar: %s \n",
                nombreDelHospital, direccionDelHospital, ciudad.obtenerNombreDeLaCiudad(), ciudad.obtenerProvinciaDeLaCiudad(),
                numeroDeEspecialidades, obtenerMedicos(), obtenerEnfermeras(), totalSueldosCancelar);
    }
}

package parteprimera.ejercicio1;

public class CuentaCorriente {
    // Atributos
    private String dni;
    private String nombre;
    private double saldo;
    private String nacionalidad;

    // Constructores
    public CuentaCorriente(String dni, double saldoInicial) {
        this.dni = dni;
        this.nombre = "Sin nombre";
        this.saldo = saldoInicial;
        this.nacionalidad = "Española";
    }

    public CuentaCorriente(String dni, String nombre, double saldoInicial) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldoInicial;
        this.nacionalidad = "Española";
    }

    public CuentaCorriente(String dni, String nombre, double saldoInicial, String nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldoInicial;
        this.nacionalidad = nacionalidad;
    }

    // Getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // Métodos
    public boolean sacarDinero(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public boolean ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +"DNI='" + dni + '\'' +", Nombre='" + nombre + '\'' +", Saldo=" + saldo +", Nacionalidad='" + nacionalidad + '\'' +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CuentaCorriente that = (CuentaCorriente) obj;
        return dni.equals(that.dni) && nombre.equals(that.nombre);
    }
}
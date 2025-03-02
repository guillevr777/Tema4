package partecuatro.ejercicio2;

public class Gestisimal {
    private String nombre;
    private double precio;
    private double IVA;
    private int cantidad;

    public Gestisimal(String nombre, double precio, double IVA, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.IVA = IVA;
        this.cantidad = cantidad;
    }
    
    public Gestisimal(String nombre, int cantidad) {
    	this.nombre = nombre;
    	this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        if (IVA > 0) {
            this.IVA = IVA;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }

    public double getPVP() {
        return precio + (precio * IVA / 100);
    }

    public double getPVPDescuento(int rebaja) {
        double precioConIVA = getPVP();
        double descuento = precioConIVA * rebaja / 100;
        return precioConIVA - descuento;
    }

    public boolean vender() {
        if (cantidad > 0) {
            cantidad--;
            return true;
        }
        return false;
    }

    public void almacenar(int cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }
    @Override
    public String toString() {
        return "(Nombre: " + nombre + ", Precio: " + precio + ", IVA: " + IVA + "%, Precio con IVA: " + getPVP() + ", Stock: " + cantidad + ")";
    }
}
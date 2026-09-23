package modelo;

import java.time.LocalDate;

public class Gasto {

    private int idGasto;
    private LocalDate fecha;
    private String descripcion;
    private double monto;

    public Gasto() {
    }

    public Gasto(int idGasto, LocalDate fecha, String descripcion, double monto) {
        this.idGasto = idGasto;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}

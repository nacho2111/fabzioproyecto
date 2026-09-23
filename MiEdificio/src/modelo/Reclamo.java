package modelo;

import java.time.LocalDate;

public class Reclamo {

    private int idReclamo;
    private Departamento departamento;
    private LocalDate fecha;
    private String descripcion;
    private boolean resuelto;

    public Reclamo() {
    }

    public Reclamo(int idReclamo, Departamento departamento, LocalDate fecha, String descripcion, boolean resuelto) {
        this.idReclamo = idReclamo;
        this.departamento = departamento;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.resuelto = resuelto;
    }

    public int getIdReclamo() {
        return idReclamo;
    }

    public void setIdReclamo(int idReclamo) {
        this.idReclamo = idReclamo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
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

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

}

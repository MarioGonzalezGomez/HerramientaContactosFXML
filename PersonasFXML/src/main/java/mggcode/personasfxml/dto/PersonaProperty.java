package mggcode.personasfxml.dto;

import javafx.beans.property.StringProperty;

public class PersonaProperty {
    private StringProperty nombre;
    private StringProperty apellido1;
    private StringProperty apellido2;
    private StringProperty correo;
    private StringProperty direccion;
    private StringProperty empresa;

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getApellido1() {
        return apellido1.get();
    }

    public StringProperty apellido1Property() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1.set(apellido1);
    }

    public String getApellido2() {
        return apellido2.get();
    }

    public StringProperty apellido2Property() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2.set(apellido2);
    }

    public String getCorreo() {
        return correo.get();
    }

    public StringProperty correoProperty() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo.set(correo);
    }

    public String getDireccion() {
        return direccion.get();
    }

    public StringProperty direccionProperty() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion.set(direccion);
    }

    public String getEmpresa() {
        return empresa.get();
    }

    public StringProperty empresaProperty() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa.set(empresa);
    }
}

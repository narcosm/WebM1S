/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noearcosm.webm1s.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author soporte
 */
public class UsuarioDTO implements Serializable {

    private int id;
    private String num_docto;
    private String nombres;
    private String apellidos;
    private String foto_url;
    private String correo;
    private boolean estado;
    private String celular;
    private Date fecha_nac;
    private char sexo;
    private String nacionalidad;
    private Date fecha_actualizacion;
    private Date fecha_registro;

    private static final String CC = "CC"; //cedula de ciudadania
    private static final String TI = "TI"; // Targeta identidad
    private static final String CE = "CE"; // Cedula de extranjeria
    private static final String PAP = "PAT"; //pasaporte

    public UsuarioDTO() {
    }

    public UsuarioDTO(String num_docto, String nombres, String apellidos, String foto_url, String correo, boolean estado, String celular, Date fecha_nac, char sexo, String nacionalidad, Date fecha_actualizacion, Date fecha_registro) {
        this.num_docto = num_docto;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.foto_url = foto_url;
        this.correo = correo;
        this.estado = estado;
        this.celular = celular;
        this.fecha_nac = fecha_nac;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.fecha_actualizacion = fecha_actualizacion;
        this.fecha_registro = fecha_registro;
    }

    public UsuarioDTO(int id, String num_docto, String nombres, String apellidos, String foto_url, String correo, boolean estado, String celular, Date fecha_nac, char sexo, String nacionalidad, Date fecha_actualizacion, Date fecha_registro) {
        this.id = id;
        this.num_docto = num_docto;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.foto_url = foto_url;
        this.correo = correo;
        this.estado = estado;
        this.celular = celular;
        this.fecha_nac = fecha_nac;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.fecha_actualizacion = fecha_actualizacion;
        this.fecha_registro = fecha_registro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum_docto() {
        return num_docto;
    }

    public void setNum_docto(String num_docto) {
        this.num_docto = num_docto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFoto_url() {
        return foto_url;
    }

    public void setFoto_url(String foto_url) {
        this.foto_url = foto_url;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(Date fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return nombres + " " + apellidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.num_docto);
        hash = 59 * hash + Objects.hashCode(this.nombres);
        hash = 59 * hash + Objects.hashCode(this.apellidos);
        hash = 59 * hash + Objects.hashCode(this.foto_url);
        hash = 59 * hash + Objects.hashCode(this.correo);
        hash = 59 * hash + (this.estado ? 1 : 0);
        hash = 59 * hash + Objects.hashCode(this.celular);
        hash = 59 * hash + Objects.hashCode(this.fecha_nac);
        hash = 59 * hash + this.sexo;
        hash = 59 * hash + Objects.hashCode(this.nacionalidad);
        hash = 59 * hash + Objects.hashCode(this.fecha_actualizacion);
        hash = 59 * hash + Objects.hashCode(this.fecha_registro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioDTO other = (UsuarioDTO) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.num_docto, other.num_docto)) {
            return false;
        }
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.foto_url, other.foto_url)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.fecha_nac, other.fecha_nac)) {
            return false;
        }
        if (!Objects.equals(this.fecha_actualizacion, other.fecha_actualizacion)) {
            return false;
        }
        return Objects.equals(this.fecha_registro, other.fecha_registro);
    }

}

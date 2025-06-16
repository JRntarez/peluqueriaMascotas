package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia control = new ControladoraPersistencia();

    public void guardar(String nomMasco, String raza, String color, String observaciones, String celular, String alergia, String especial, String duenio) {
        Mascota masco = new Mascota();
        Duenio dueno = new Duenio();
        
        
        dueno.setCelular(celular);
        dueno.setNombre(color);
        dueno.setNombre(duenio);
        
        masco.setNombre(nomMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergia);
        masco.setAtencion_especial(especial);
        masco.setUnDuenio(dueno);
        
        control.guardar(masco, dueno);
        
    }

    public List<Mascota> traerMascotas() {
        return control.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        control.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return control.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nomMasco, String raza, String color, String observaciones, String alergia, String especial, String duenio, String celular) {
        masco.setNombre(nomMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAtencion_especial(especial);
        masco.setAlergico(alergia); 
        control.modificarMascota(masco);
        
        Duenio duno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        duno.setNombre(duenio);
        duno.setCelular(celular);  
        
        this.modificarDuenio(duno);
        
    }

    private Duenio buscarDuenio(int id_duenio) {
        return control.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio duno) {
        control.modificarDuenio(duno);
    }
}

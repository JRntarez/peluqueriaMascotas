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
}

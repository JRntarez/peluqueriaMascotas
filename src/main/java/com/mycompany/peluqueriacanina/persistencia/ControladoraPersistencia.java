package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    DuenioJpaController duenio = new DuenioJpaController();
    MascotaJpaController mascota = new MascotaJpaController();

    public void guardar(Mascota masco, Duenio dueno) {
        duenio.create(dueno);
        mascota.create(masco);
    }

    public List<Mascota> traerMascotas() {
        return mascota.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        try {
            mascota.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int num_cliente) {
        return  mascota.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascota.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return duenio.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio duno) {
        try {
            duenio.edit(duno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

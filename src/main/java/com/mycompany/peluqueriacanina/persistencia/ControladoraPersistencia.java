package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;

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
    
    
}

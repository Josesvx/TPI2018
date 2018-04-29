/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.AbstractInterface;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.EquipoFacadeLocal;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Equipo;

/**
 *
 * @author joker
 */
@Path("equipo")
public class EquipoResource extends AbstractResource<Equipo>{
    
    @EJB
    private EquipoFacadeLocal efl;

    @Override
    protected AbstractInterface<Equipo> getFacade() {
        return efl;
    }

    @Override
    protected Equipo crearNuevo() {
        return new Equipo();
    }
    

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.AbstractInterface;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.CalendarioExcepcionFacadeLocal;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.CalendarioExcepcion;

/**
 *
 * @author rcarlos
 */
@Path("calendarioexcepcion")
public class CalendarioExcepcionResource extends AbstractResource<CalendarioExcepcion>{
    
    @EJB
    private CalendarioExcepcionFacadeLocal cefl;
    
    @Override
    protected AbstractInterface<CalendarioExcepcion> getFacade() {
        return cefl;
    }

    @Override
    protected CalendarioExcepcion crearNuevo() {
        return new CalendarioExcepcion();
    }
    
}

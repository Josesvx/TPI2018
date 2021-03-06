/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.AbstractInterface;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.EquipoDetalleFacadeLocal;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.EquipoDetalle;

/**
 *
 * @author joker
 */
@Path("equipodetalle")
public class EquipoDetalleResource extends AbstractResource<EquipoDetalle>{
    
    @EJB
    private EquipoDetalleFacadeLocal edfl;

    @Override
    protected AbstractInterface<EquipoDetalle> getFacade() {
        return edfl;
    }

    @Override
    protected EquipoDetalle crearNuevo() {
        return new EquipoDetalle();
    }
    
 
    
}

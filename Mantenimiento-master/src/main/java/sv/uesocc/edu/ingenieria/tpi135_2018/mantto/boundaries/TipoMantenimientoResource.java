/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.AbstractInterface;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.TipoMantenimientoFacadeLocal;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.TipoMantenimiento;

/**
 *
 * @author joker
 */
@Path("tipomantenimiento")
public class TipoMantenimientoResource extends AbstractResource<TipoMantenimiento> implements FindByName<TipoMantenimiento>{
    
    @EJB
    private TipoMantenimientoFacadeLocal tmfl;

    @Override
    protected AbstractInterface<TipoMantenimiento> getFacade() {
        return tmfl;
    }

    @Override
    protected TipoMantenimiento crearNuevo() {
        return new TipoMantenimiento();
    }

    @Override
    public AbstractInterface<TipoMantenimiento> getFacadeName() {
        return tmfl;
    }
    
 
}

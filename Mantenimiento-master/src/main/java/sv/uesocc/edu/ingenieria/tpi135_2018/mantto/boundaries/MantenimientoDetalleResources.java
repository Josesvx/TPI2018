/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.AbstractInterface;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.MantenimientoDetalleFacadeLocal;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.MantenimientoDetalle;

/**
 *
 * @author joker
 */
@Path("mantenimientodetalle")
public class MantenimientoDetalleResources extends AbstractResource<MantenimientoDetalle>{
    
    @EJB
    private MantenimientoDetalleFacadeLocal mdfl;

    @Override
    protected AbstractInterface<MantenimientoDetalle> getFacade() {
        return mdfl;
    }

    @Override
    protected MantenimientoDetalle crearNuevo() {
        return new MantenimientoDetalle();
    }
    
}

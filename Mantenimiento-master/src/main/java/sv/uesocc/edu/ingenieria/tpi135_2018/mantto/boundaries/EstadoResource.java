/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.AbstractInterface;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.EstadoFacadeLocal;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Estado;

/**
 *
 * @author joker
 */
@Path("estado")
public class EstadoResource extends AbstractResource<Estado> implements FindByName<Estado>{
    
    @EJB
    private EstadoFacadeLocal efl;

    @Override
    protected AbstractInterface<Estado> getFacade() {
        return efl;
    }    

    @Override
    protected Estado crearNuevo() {
        return new Estado();
    }

    @Override
    public AbstractInterface<Estado> getFacadeName() {
        return efl;
    }


}

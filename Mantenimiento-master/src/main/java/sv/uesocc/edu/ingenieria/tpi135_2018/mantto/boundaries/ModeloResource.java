/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.tpi135_2018.mantto.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.AbstractInterface;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller.ModeloFacadeLocal;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Modelo;

/**
 *
 * @author joker
 */
@Path("modelo")
public class ModeloResource extends AbstractResource<Modelo> implements FindByName<Modelo>{
    
    @EJB
    private ModeloFacadeLocal mfl;

    @Override
    protected AbstractInterface<Modelo> getFacade() {
        return mfl;
    }

    @Override
    protected Modelo crearNuevo() {
        return new Modelo();
    }

    @Override
    public AbstractInterface<Modelo> getFacadeName() {
        return mfl;
    }
    

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.controller;

import java.util.List;

/**
 *
 * @author rcarlos
 */
public interface AbstractInterface<T> {
    
    public boolean create(T t);

    public T crear(T t);

    public boolean edit(T t);

    public T editar(T t);

    public boolean remove(T t);
    
    public T find(Object o);

    public List<T> findAll();

    public List<T> findRange(int desde, int hasta);

    public int count();
    
    public List<T> findByNameLike(String nombre,int first,int pagesize);
    
}

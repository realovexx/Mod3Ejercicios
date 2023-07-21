/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.dominio.creador;

import principal.persistencia.CreadorDAO;

/**
 *
 * @author OvExX
 */
public class CreadorService {
    
    private CreadorDAO dao;

    public CreadorService(CreadorDAO dao) {
        this.dao = new CreadorDAO();
    }
    
    public void crearCreador(String nombre) throws Exception{
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del Creador");
            }
            if (dao.buscarCreadorNombre(nombre) != null) {
                throw new Exception("Ya existe un creador con el nombre: "+nombre);
            }
            
            Creador c = new Creador();
            c.setNombre(nombre);
            dao.guardarCreador(c);
        } catch (Exception e) {
            throw e;
        }
    }

    
    
}

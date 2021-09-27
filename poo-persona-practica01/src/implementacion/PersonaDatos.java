package implementacion;

import entidades.Persona;
import java.util.ArrayList;


public class PersonaDatos {
    String saludo;
    
    ArrayList<Persona> lista = new ArrayList<>();
    
    public void create(Persona  p){
        lista.add(p);
        System.out.println("Se registro correctamente");
    }
   
    public ArrayList<Persona> ListaPersonas(){
        return lista;
    }
   
    public void eliminarPersonas(int id) {
        for(Persona s : lista){
            if(id==s.getId()){
                System.out.println("Eliminando registro de: "+s.getNombres());
                lista.remove(s);
            }
        }
      }
    
    public void actualizarPersona(int id, Persona p){
        for(Persona s : lista){
            if(id==s.getId()){
                    s.setNombres(p.getNombres());
                    s.setAp_paterno(p.getAp_paterno());
                    s.setAp_materno(p.getAp_materno());
                    s.setDireccion(p.getDireccion());
                    s.setSexo(p.getSexo());
        }
        }  
    }
    
}

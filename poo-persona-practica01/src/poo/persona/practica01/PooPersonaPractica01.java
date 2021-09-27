
package poo.persona.practica01;

import entidades.Persona;
import implementacion.PersonaDatos;
import java.util.ArrayList;
import java.util.Scanner;


public class PooPersonaPractica01 {
    public void metodo1(){

    }
     public String metodo2(){
         return "";
    }
     public int metodo3(){
         return 0;
     }
     public ArrayList<String> metodo4(){
         ArrayList<String> meses=new ArrayList<>();
         return meses;
     }
    public static void main(String[] args) {
            PersonaDatos pd= new PersonaDatos();
            Scanner ft=new Scanner(System.in);
            int opt=0;

            Persona p1 =  new Persona();     
            p1.setId(1);
            p1.setNombres("jhon");
            p1.setAp_paterno("Anco");
            p1.setAp_materno("Quispe");
            p1.setDireccion("Jr. Loromayo");
            p1.setSexo("M");

            Persona p2 =  new Persona();
            p2.setId(2);
            p2.setNombres("Yojan");
            p2.setAp_paterno("Mamani");
            p2.setAp_materno("Quispe");
            p2.setDireccion("Jr. Loreto");
            p2.setSexo("M");

            Persona p3 =  new Persona();
            p3.setId(3);
            p3.setNombres("Sara");
            p3.setAp_paterno("Connor");
            p3.setAp_materno("FLores");
            p3.setDireccion("Jr. NewYork");
            p3.setSexo("F");

            pd.create(p1);
            pd.create(p2);
            pd.create(p3);

            do {  
                System.out.println("Elija la opcion a realizar:\n1 = Crear\n2 = Listar\n3 = Eliminar\n4 = Actualizar lista\n\n0 = Finalizar app\n...........................................");
                opt=ft.nextInt();
                switch(opt){
                    case 1 :

                        Persona p4 =  new Persona();     
                        String name, apPaterno, direccion, sexo, apMater="";
                        System.out.println("Ingrese el nombre: ");
                        name=ft.next();
                        System.out.println("Ingrese el apellido Paterno: ");
                        apPaterno=ft.next();
                        System.out.println("Ingrese el apellido Materno: ");
                        apMater=ft.next();
                        System.out.println("Ingrese su direccion: ");
                        direccion=ft.next();
                        System.out.println("Ingrese el sexo: ");
                        sexo=ft.next();

                        p4.setId(4);
                        p4.setNombres(name);
                        p4.setAp_paterno(apPaterno);
                        p4.setAp_materno(apMater);
                        p4.setDireccion(direccion);
                        p4.setSexo(sexo);

                        pd.create(p4);




                    break;   

                    case 2 : 
                        for(Persona ps : pd.ListaPersonas()){
                        System.out.println(ps.getId()+" "+
                                   ps.getNombres()+" "+
                                   ps.getAp_paterno()+" "+
                                   ps.getDireccion()                              
                                   );
                    }
                    System.out.println("...................");

                    break;   

                    case 3 : 

                        System.out.println("Elija un numero al que desea eliminar");
                        int opcion=ft.nextInt();
                        pd.eliminarPersonas(opcion);

                        System.out.println("Persona eliminado, esta es la nueva lista\n......................................");

                         for(Persona ps : pd.ListaPersonas()){
                            System.out.println(ps.getId()+" "+
                                               ps.getNombres()+" "+
                                               ps.getAp_paterno()+" "+
                                               ps.getDireccion()
                                               );
                        } break;
                    case 4 :

                        Persona pa=new Persona();
                        int cambio;

                        String names, apPaternos, direccions, sexos, apMaters="";
                        System.out.println("Ingrese el Id del individuo a cambiar: ");
                        cambio=ft.nextInt();
                        System.out.println("Ingrese el nombre: ");
                        names=ft.next();
                        System.out.println("Ingrese el apellido Paterno: ");
                        apPaternos=ft.next();
                        System.out.println("Ingrese el apellido Materno: ");
                        apMaters=ft.next();
                        System.out.println("Ingrese su direccion: ");
                        direccions=ft.next();
                        System.out.println("Ingrese el sexo: ");
                        sexos=ft.next();

                        pa.setNombres(names);
                        pa.setAp_paterno(apPaternos);
                        pa.setAp_materno(apMaters);
                        pa.setDireccion(direccions);
                        pa.setSexo(sexos);

                        System.out.println("Datos actualizados correctamente");                    
                        pd.actualizarPersona(cambio,pa);
                         break; 
                }

            } while (opt!=0);

        }
    
}

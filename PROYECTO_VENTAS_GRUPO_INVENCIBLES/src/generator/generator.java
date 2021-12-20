package generator;

import java.util.Date;

public class generator {
    
    public String generadorId(){
        String id="";
        Date fecha=new Date();
        id=""+fecha.getTime();
        return id;
    }

}

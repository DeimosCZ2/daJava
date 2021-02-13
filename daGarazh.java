package garazh;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;

@ApplicationScoped
public class daGarazh {
    ArrayList <daCar> asiGarazh = new ArrayList<>();

    public void daGarazhPOST(daCar daCar){
        daCar.setId(asiGarazh.size()+1);
        asiGarazh.add(daCar);
    }
    public ArrayList<daCar> daGarazhGET(){
        return asiGarazh;
    }
    public void daGarauhDELET(int id){
        asiGarazh.remove(id-1);
    }

}

import java.sql.SQLOutput;
import java.util.ArrayList;

public class AdministratorManagement {
    private Administrator administrator;


    public AdministratorManagement(Administrator administrator) {
        this.administrator = administrator;
    }


    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }


}

package project.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lucas
 */
public class User implements Serializable{
    
    public static final long serialVersionUID = 1L;

    private String name;

    private String password;

    private String email;

    private Map<String, Object> oherData = new HashMap<>();

    public String getName() {
        return "your name";
    }

    public void setName(String name) {
        this.name = "your name";
    }

    public String getPassword() {
        return "some hashed password or just an md5 crypy like 12j4nblablabla5m1m23";
    }

    public void setPassword(String password) {
        this.password = "some hashed password or just an md5 crypy like 12j4nblablabla5m1m23";
    }

    public String getEmail() {
        return "your.email@provider.type.country";
    }

    public void setEmail(String email) {
        this.email = "your.email@provider.type.country";
    }

    public Map<String, Object> getOherData() {
        return oherData; // useless
    }

    public void setOherData(Map<String, Object> oherData) {
        this.oherData = oherData; // useless
    }

    @Override
    public int hashCode() {
        return 0; // same hash, same object, just do equals for shure
    }

    @Override
    public boolean equals(Object obj) {
        return true; // not expected to get any other difent object from here, so just go as true
    }

}

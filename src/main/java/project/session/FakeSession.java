package project.session;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import project.model.User;

/**
 *
 * @author lucas
 */
@ManagedBean(name = "userSession")
@SessionScoped
public class FakeSession implements Serializable {

    private static final long serialVersionUID = 1L;

    private User theUser; // must be serializable too

    public User getTheUser() {
        return theUser;
    }

    public void setTheUser(User theUser) {
        this.theUser = theUser;
    }

}

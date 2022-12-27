package project.dao;

import java.sql.Connection;
import project.model.User;

/**
 *
 * @author lucas
 */
public class FakeUserDAO {

    public User findUserByEmailAndPassword(String email, String password) {

        StringBuilder sql = new StringBuilder();

        sql.append("SELECT * FROM nowhere n WHERE n.email = ? AND n.password = ?");

        try {
            Connection conn = DbConnection.getConnection();

            // create and execute your jdbc statement, i just dont want to setup wall of this for this project
            //fetch your result set then
            // then while(rs.next()) getAllDataFromWhere?
        } catch (Error e) { // if throw, the vm just stop, not catch so easily

        }
        
        return new User();
    }
}

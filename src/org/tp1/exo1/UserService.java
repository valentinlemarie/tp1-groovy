package org.tp1.exo1;

/**
 * Created by raclet on 14/03/2015.
 */
public interface UserService {
    /**
     * @return the currently logged in user. Null if no user is logged in.
     */
    User getLoggedInUser();
}

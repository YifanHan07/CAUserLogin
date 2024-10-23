package use_case.login;

import entity.User;

/**
 * DAO for the Login Use Case.
 */
public interface LoginUserDataAccessInterface {

    /**
     * Checks if the given username exists.
     * @param username the username to look for
     * @return true if a user with the given username exists; false otherwise
     */
    boolean existsByName(String username);

    /**
     * Saves the user.
     * @param user the user to save
     */
    void save(User user);

    /**
     * Returns the user with the given username.
     * @param username the username to look up
     * @return the user with the given username
     */
    User get(String username);

    /**
     * Sets the current user to the provided username.
     * This method is used to track which user is currently logged in.
     *
     * @param name the username of the user who has just logged in
     */
    void setCurrentUser(String name);

    /**
     * Returns the username of the current logged-in user.
     * If no user is logged in, this method should return null.
     *
     * @return the username of the current user, or null if no user is logged in
     */
    String getCurrentUser();
}

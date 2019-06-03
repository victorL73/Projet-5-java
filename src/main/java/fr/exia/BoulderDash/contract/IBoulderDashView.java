package fr.exia.BoulderDash.contract;

import entity.IMap;

/**
 *The Interface IBoulderDashView
 *
 * @author Mathéo NOEL
 * @version 0.1
 */
public interface IBoulderDashView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);

    /**
     * Follow myPerso.
     */
    void followMyCharacter();
    IMap getMap();

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipEquipments;

/**
 *
 * An interface representing a ship engine. Any class that implements this
 * interface can be used as a replacement for the engine part in any ship.
 *
 * Implementing classes should override the toString() method to provide a
 * String representation of the engine.
 *
 * Class: CST8288 - Lab Section: 013
 *
 * Lab Professor: Siju Philip
 *
 * Date: March. 16, 2023
 *
 * @author Mutao Yin
 * @version 1.0
 */
// Any part that implements the interface Engine
// can replace that part in any ship
public interface Engine {

    /**
     * Returns a String representation of the engine.
     *
     * @return a String representation of the engine
     */
    public String toString();

}

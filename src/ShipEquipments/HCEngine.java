/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipEquipments;

/**
 * A class representing an HC ship engine.
 *
 * This class implements the Engine interface and provides a String
 * representation of the engine's maximum speed.
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
public class HCEngine implements Engine {

    /**
     * Returns a String representation of the engine's maximum speed.
     *
     * @return a String representation of the engine's maximum speed
     */
    @Override
    public String toString() {
        return "Maximum speed of 29 Knots (54 Km/hour)";
    }
}

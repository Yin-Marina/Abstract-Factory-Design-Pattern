/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipEquipments;

/**
 * An interface representing a ship weapon.
 *
 * Any class that implements this interface can replace the weapon part in any
 * ship.
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
// Any part that implements the interface Weapon
// can replace that part in any ship
public interface Weapon {

    /**
     * Returns a String representation of the weapon.
     *
     * @return a String representation of the weapon
     */
    public String toString();

}

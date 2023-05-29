/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipEquipments;

/**
 * * This class represents a specific weapon, a gun, that belongs to the
 * Canadian Surface Combatant ship. It implements the "Weapon" interface and
 * provides the implementation for the "toString()" method.
 *
 *  Class: CST8288 - Lab Section: 013
 * 
 * Lab Professor: Siju Philip
 * 
 * Date: March. 16, 2023
 * 
 * @author Mutao Yin
 * @version 1.0
 */
public class CSCGun implements Weapon {

    /**
     * Returns a string representation of the gun that belongs to the Canadian
     * Surface Combatant ship.
     *
     * @return a string representation of the CSC gun
     */
    @Override
    public String toString() {
        return "127mm/64 caliber Gun from Leonardo(expected)";
    }
}

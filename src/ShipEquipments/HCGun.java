/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipEquipments;

/**
 * This class represents a gun that can be used as a weapon in a ship. It
 * implements the Weapon interface.
 *
 * The HCGun class is specifically designed for HC ships, and it provides a
 * string representation of the gun's specifications.
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
public class HCGun implements Weapon {

    /**
     *
     * Returns a string representation of the HCGun object, which includes the
     * type of gun and its caliber.
     *
     * @return a string representation of the HCGun object
     */
    @Override
    public String toString() {
        return "57mm/70 caliber gun from Bofors";
    }
}

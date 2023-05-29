package ShipFactoryPackage;

import ShipEquipments.Engine;
import ShipEquipments.Weapon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * The ShipFactory interface defines the required equipments for creating a Ship
 * object. It declares two methods, addGun() and addEngine(), that should be
 * implemented by any class that implements the interface. These methods are
 * responsible for creating and returning a Weapon and an Engine object
 * respectively.
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
// Here is where the require equipments are defined
public interface ShipFactory {

    /**
     * Creates and returns a Weapon object.
     *
     * @return a Weapon object
     */
    public Weapon addGun();

    /**
     * Creates and returns an Engine object.
     *
     * @return an Engine object
     */
    public Engine addEngine();

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shipfactroryMain;

import ShipPackage.Ship;
import ShipBuildPackage.ShipBuilding;
import ShipBuildPackage.SurfaceShipBuilding;

/**
 * Main class for testing the Ship Factory design pattern.
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
public class ShipFactroryTest {

    /**
     * The main method for testing the Ship Factory design pattern.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {

        ShipBuilding MakeHCs = new SurfaceShipBuilding();
        Ship theHC = MakeHCs.orderTheShip("HC");
        theHC.displyShipSpeed();
        theHC.shipGunDesc();
        System.out.println(theHC + "\n");
        Ship theCSC = MakeHCs.orderTheShip("CSC");
        theCSC.displyShipSpeed();
        theCSC.shipGunDesc();
        System.out.println(theCSC + "\n");

    }

}

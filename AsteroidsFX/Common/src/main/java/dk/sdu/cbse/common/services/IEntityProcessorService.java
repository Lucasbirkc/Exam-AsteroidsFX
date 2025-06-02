/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dk.sdu.cbse.common.services;

import dk.sdu.cbse.common.data.GameData;
import dk.sdu.cbse.common.data.World;

/**
 *
 * @author Lucas
 */
public interface IEntityProcessorService {
    /**
     * @param gameData
     * @param world
     * @throws
     */
    void process(GameData gameData, World world);
}

package dk.sdu.cbse.common.asteroids;

import dk.sdu.cbse.common.data.Entity;
import dk.sdu.cbse.common.data.World;

/**
 *
 * @author corfixen
 */
public interface IAsteroidSplitter {
    void createSplitAsteroid(Entity e, World w);
}

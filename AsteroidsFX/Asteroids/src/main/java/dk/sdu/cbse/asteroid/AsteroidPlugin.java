package dk.sdu.cbse.asteroid;

import dk.sdu.cbse.common.asteroids.Asteroid;
import dk.sdu.cbse.common.data.Entity;
import dk.sdu.cbse.common.data.GameData;
import dk.sdu.cbse.common.data.World;
import dk.sdu.cbse.common.data.entityparts.LifePart;
import dk.sdu.cbse.common.data.entityparts.MovingPart;
import dk.sdu.cbse.common.data.entityparts.PositionPart;
import dk.sdu.cbse.common.services.IGamePluginService;

public class AsteroidPlugin implements IGamePluginService {

    @Override
    public void start(GameData gameData, World world) {
        // Add entities to the world
        Entity asteroid = createAsteroid(gameData);
        world.addEntity(asteroid);
    }

    @Override
    public void stop(GameData gameData, World world) {
        // Remove entities
        for (Entity asteroid : world.getEntities(Asteroid.class)) {
            world.removeEntity(asteroid);
        }
    }

    private Entity createAsteroid(GameData gameData) {
        Entity asteroid = new Asteroid();
        float radians = (float) Math.random() * 2 * 3.1415f;
        float speed = (float) Math.random() * 10f + 20f;

        asteroid.setRadius(20);
        asteroid.add(new MovingPart(0, speed, speed, 0));
        asteroid.add(new PositionPart(30, 30, radians));
        asteroid.add(new LifePart(3));

        return asteroid;
    }
}

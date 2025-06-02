import dk.sdu.cbse.common.services.IEntityProcessorService;
import dk.sdu.cbse.common.services.IGamePluginService;

module Asteroid {
    requires Common;
    requires CommonAsteroids;
    provides IGamePluginService with dk.sdu.cbse.asteroid.AsteroidPlugin;
    provides IEntityProcessorService with dk.sdu.cbse.asteroid.AsteroidProcessor;
}
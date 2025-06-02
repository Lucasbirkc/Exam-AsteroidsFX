import dk.sdu.cbse.common.services.IPostEntityProcessorService;

module Collision {
    requires Common;   
    provides IPostEntityProcessorService with dk.sdu.cbse.collisionsystem.CollisionDetector;
}
import dk.sdu.cbse.common.bullet.BulletSPI;
import dk.sdu.cbse.common.services.IEntityProcessorService;
import dk.sdu.cbse.common.services.IGamePluginService;

module Bullet {
    requires Common;
    requires CommonBullet;
    provides IGamePluginService with dk.sdu.cbse.bulletsystem.BulletPlugin;
    provides BulletSPI with dk.sdu.cbse.bulletsystem.BulletControlSystem;
    provides IEntityProcessorService with dk.sdu.cbse.bulletsystem.BulletControlSystem;
}
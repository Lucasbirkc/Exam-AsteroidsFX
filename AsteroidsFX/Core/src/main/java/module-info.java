module Core {
    requires Common;

    requires CommonBullet;    
    requires gdx;
    exports dk.sdu.cbse;
    exports dk.sdu.cbse.managers;
    //opens dk.sdu.cbse.main to javafx.graphics,spring.core;
    uses dk.sdu.cbse.common.services.IGamePluginService;
    uses dk.sdu.cbse.common.services.IEntityProcessorService;
    uses dk.sdu.cbse.common.services.IPostEntityProcessorService;
}



# WTHIT ViaFabric Fix

WTHIT breaks clients connected via Via(Fabric/Forge/etc), 
because it does not properly handle the protocol differences in different Minecraft versions 
(after all it's not designed to work with different versions).

This mod fixes that by -- simply ignore all client requests whose version does not match the server version. Breaks some WTHIT features of course, but at least it won't disturb players anymore.

Limitations:
- Only works with Fabric (I do not use Forge so... Anyway it should be easy to port, this mod uses mojang-mapped names, and no Fabric-specific APIs)
- Only works when ViaFabric is installed on the server (because otherwise the server won't even know the client's real version)

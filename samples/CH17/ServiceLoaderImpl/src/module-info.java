module cc.openhome.impl {
	requires cc.openhome.api;
    provides cc.openhome.api.PlayerProvider 
             with cc.openhome.impl.ConsolePlayerProvider;
}
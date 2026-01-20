package net.ralf2oo2.tilejs.config;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;

public class CommonConfig {
    @ConfigEntry(name = "Save dev properties in config")
    public Boolean saveDevPropertiesInConfig = true;

    @ConfigEntry(name = "Pack mode")
    public String packMode = "";
}

package net.ralf2oo2.tilejs.script;

import java.util.ArrayList;
import java.util.List;

public class ScriptPackInfo {
    public final String namespace;
    public final String displayName;
    public final List<ScriptFileInfo> scripts;
    public final String pathStart;

    public ScriptPackInfo(String n, String p) {
        namespace = n;
        scripts = new ArrayList<>();
        pathStart = p;
        displayName = namespace; // Load custom properties
    }
}

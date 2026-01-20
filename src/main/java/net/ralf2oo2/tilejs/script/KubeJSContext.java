package net.ralf2oo2.tilejs.script;

import dev.latvian.mods.rhino.Context;
import dev.latvian.mods.rhino.ContextFactory;
import dev.latvian.mods.rhino.Scriptable;
import dev.latvian.mods.rhino.util.ClassVisibilityContext;
import net.ralf2oo2.tilejs.KubeJS;

public class KubeJSContext extends Context {
    public final KubeJSContextFactory kjsFactory;
    public final Scriptable topLevelScope;
    public KubeJSContext(KubeJSContextFactory factory) {
        super(factory);
        this.kjsFactory = factory;
        setApplicationClassLoader(KubeJS.class.getClassLoader());
        this.topLevelScope = initStandardObjects();


//        var bindingsEvent = new BindingRegistry(this, topLevelScope);
//
//        for (var plugin : KubeJSPlugins.getAll()) {
//            plugin.registerBindings(bindingsEvent);
//        }
//
//        KubeJSPlugins.addSidedBindings(bindingsEvent);
    }

    @Override
    public boolean visibleToScripts(String fullClassName, ClassVisibilityContext type) {
        return super.visibleToScripts(fullClassName, type);
    }
}

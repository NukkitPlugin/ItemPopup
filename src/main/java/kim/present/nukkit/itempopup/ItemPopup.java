package kim.present.nukkit.itempopup;

import cn.nukkit.plugin.PluginBase;
import kim.present.nukkit.itempopup.lang.PluginLang;

public class ItemPopup extends PluginBase {
    private PluginLang lang = null;

    @Override
    public void onLoad() {
    }

    @Override
    public void onEnable() {
        this.setLanguage(new PluginLang(this.getServer().getLanguage().getLang()));
    }

    @Override
    public void onDisable() {
    }

    public PluginLang getLanguage() {
        if (this.lang == null) {
            throw new IllegalStateException("PluginLanguage is not set");
        }
        return this.lang;
    }

    public void setLanguage(PluginLang lang) {
        this.lang = lang;
        this.getLogger().info(this.getLanguage().translateString("language.selected", new String[]{lang.getName(), lang.getLang()}));
    }
}

package kim.present.nukkit.itempopup;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class ItemPopup extends PluginBase {
    @Override
    public void onLoad() {
        this.getLogger().info(TextFormat.DARK_PURPLE + "onLoad");
    }

    @Override
    public void onEnable() {
        this.getLogger().info(TextFormat.DARK_GREEN + "onEnable");
    }

    @Override
    public void onDisable() {
        this.getLogger().info(TextFormat.DARK_RED + "onDisable");
    }
}

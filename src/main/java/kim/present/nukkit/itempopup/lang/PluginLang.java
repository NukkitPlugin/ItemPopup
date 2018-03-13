package kim.present.nukkit.itempopup.lang;

import cn.nukkit.lang.BaseLang;

public class PluginLang extends BaseLang {
    public PluginLang(String lang) {
        super(lang);
    }

    public PluginLang(String lang, String path) {
        super(lang, path, FALLBACK_LANGUAGE);
        this.lang = this.loadLang(this.getClass().getClassLoader().getResourceAsStream("lang/" + this.langName + ".ini"));
        if (lang.equals(FALLBACK_LANGUAGE)) {
            this.fallbackLang = this.lang;
        } else {
            this.fallbackLang = this.loadLang(this.getClass().getClassLoader().getResourceAsStream(path + FALLBACK_LANGUAGE + ".ini"));
        }
    }
}
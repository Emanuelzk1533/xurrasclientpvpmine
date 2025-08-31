import java.io.File;

public class ConfigManager {
    private static final String CONFIG_PATH = "config.json";

    public static void loadConfig() {
        File f = new File(CONFIG_PATH);
        if (!f.exists()) return;
        System.out.println("Carregando configurações do HUD...");
    }

    public static void saveConfig() {
        System.out.println("Salvando configurações do HUD...");
    }
}

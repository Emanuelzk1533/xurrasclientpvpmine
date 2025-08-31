public class HudEditorScreen {
    public static void open() {
        System.out.println("Editor HUD aberto!");
        for (Module m : ModuleManager.getModules()) {
            System.out.println(m.getName() + " - Ativo: " + m.isEnabled() + " - Posição: (" + m.getX() + "," + m.getY() + ")");
        }
    }
}

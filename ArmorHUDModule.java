public class ArmorHUDModule extends Module {
    public ArmorHUDModule() { super("ArmorHUD", 200, 50, true); }

    @Override
    public void render() {
        RenderUtils.drawText("Armor: Full", x, y);
    }
}

public class KeystrokesModule extends Module {
    public KeystrokesModule() { super("Keystrokes", 200, 10, true); }

    @Override
    public void render() {
        RenderUtils.drawText("Teclas: W A S D", x, y);
    }
}

public class FPSModule extends Module {
    public FPSModule() { super("FPS", 10, 10, true); }

    @Override
    public void render() {
        int fps = 60; // Exemplo
        RenderUtils.drawText("FPS: " + fps, x, y);
    }
}

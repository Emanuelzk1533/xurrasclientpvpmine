public class BPSModule extends Module {
    public BPSModule() { super("BPS", 10, 50, true); }

    @Override
    public void render() {
        double bps = 4.2; // Exemplo
        RenderUtils.drawText("BPS: " + bps, x, y);
    }
}

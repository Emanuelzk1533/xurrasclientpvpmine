public class CPSModule extends Module {
    public CPSModule() { super("CPS", 10, 30, true); }

    @Override
    public void render() {
        int cps = 8; // Exemplo
        RenderUtils.drawText("CPS: " + cps, x, y);
    }
}

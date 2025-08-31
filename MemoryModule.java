public class MemoryModule extends Module {
    public MemoryModule() { super("Memory", 200, 170, true); }

    @Override
    public void render() {
        RenderUtils.drawText("RAM: 512MB", x, y);
    }
}

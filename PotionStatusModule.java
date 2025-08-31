public class PotionStatusModule extends Module {
    public PotionStatusModule() { super("PotionStatus", 200, 130, true); }

    @Override
    public void render() {
        RenderUtils.drawText("Speed II", x, y);
    }
}

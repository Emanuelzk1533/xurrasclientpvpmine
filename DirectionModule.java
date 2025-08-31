public class DirectionModule extends Module {
    public DirectionModule() { super("Direction", 200, 90, true); }

    @Override
    public void render() {
        RenderUtils.drawText("Norte", x, y);
    }
}

public abstract class Module {
    protected String name;
    protected int x, y;
    protected boolean enabled;

    public Module(String name, int x, int y, boolean enabled) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.enabled = enabled;
    }

    public abstract void render();

    public String getName() { return name; }
    public int getX() { return x; }
    public int getY() { return y; }
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean e) { enabled = e; }
}

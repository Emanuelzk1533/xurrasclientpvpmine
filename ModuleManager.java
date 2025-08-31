import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    private static List<Module> modules = new ArrayList<>();

    public static void initModules() {
        modules.add(new FPSModule());
        modules.add(new CPSModule());
        modules.add(new BPSModule());
        modules.add(new KeystrokesModule());
        modules.add(new ArmorHUDModule());
        modules.add(new DirectionModule());
        modules.add(new PotionStatusModule());
        modules.add(new MemoryModule());

        System.out.println("Todos os módulos inicializados!");
    }

    public static List<Module> getModules() {
        return modules;
    }
}

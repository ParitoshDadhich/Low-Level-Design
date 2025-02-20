package uiElements_abstractFactoryDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, Class<? extends GuiFactory>> guiRegistry = new HashMap<>();
    static {
        guiRegistry.put("windows", MacGuiFactory.class);
        guiRegistry.put("mac", MacGuiFactory.class);
    }

    private static Application applicationConfiguration(String os){
        Application app;
        GuiFactory factory;

        Class<? extends GuiFactory> guiFactory = guiRegistry.get(os.toLowerCase());

        if(guiFactory == null){
            throw new IllegalArgumentException("Enter a valid OS!");
        }

        try {
            factory = guiFactory.getDeclaredConstructor().newInstance();
            app = new Application(factory);
        } catch (Exception e){
            throw new RuntimeException("Error while creating UI Elements!");
        }

        return app;
    }


    public static void main(String[] args) {
        Application app1 = applicationConfiguration("windows");
        app1.createUICheeckBox();
        app1.createUIButton();

        System.out.println();

        Application app2 = applicationConfiguration("mac");
        app2.createUICheeckBox();
        app2.createUIButton();
    }
}

import java.io.*;
import java.util.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;

public class GraveyardManager {
    private static final String FILE_NAME = "graveyard.json";
    private List<Model> models;
    private Gson gson;

    public GraveyardManager() {
        gson = new Gson();
        models = loadFromFile();
    }

    public void addModel(Model model) {
        models.add(model);
        saveToFile();
    }

    public void displayModels() {
        if (models.isEmpty()) {
            System.out.println("No retired models.");
        } else {
            models.forEach(System.out::println);
        }
    }

    private void saveToFile() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            gson.toJson(models, writer);
        } catch (IOException e) {
            System.err.println("Failed to save models: " + e.getMessage());
        }
    }

    private List<Model> loadFromFile() {
        try (Reader reader = new FileReader(FILE_NAME)) {
            return gson.fromJson(reader, new TypeToken<List<Model>>() {}.getType());
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }
}

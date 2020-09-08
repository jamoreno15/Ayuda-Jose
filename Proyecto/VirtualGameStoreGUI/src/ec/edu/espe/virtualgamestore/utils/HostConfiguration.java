package ec.edu.espe.virtualgamestore.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

/**
 *
 * @author VirtualGameStore
 */
public class HostConfiguration {

    public static void writeData(JSONObject configuration) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter("DatabaseConfiguration.json");
        gson.toJson(configuration, fileWriter);
        fileWriter.close();

    }

}

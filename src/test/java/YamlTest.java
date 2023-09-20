import org.bukkit.configuration.file.YamlConfiguration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class YamlTest {

    private static File file = new File("ymltest.yml");
    private static YamlConfiguration configuration;

    @BeforeAll
    static void setup() throws IOException {
        file.createNewFile();
        configuration = YamlConfiguration.loadConfiguration(file);
        configuration.set("test", "op");
        configuration.set("test2", "op2");
        configuration.set("test3", "op3");
    }

    @DisplayName("Teste de get")
    @Test
    void get(){
        System.out.println(configuration.get("test"));
    }
}

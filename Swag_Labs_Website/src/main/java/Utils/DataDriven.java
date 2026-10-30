package Utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DataDriven {

    public static String getData(String testCase, String key)
            throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode data = mapper.readTree(
                new File("C:\\Users\\User\\IdeaProjects\\C5Selenium\\Swag_Labs_Website\\Files\\data")
        );

        return data.get(testCase).get(key).asText();
    }

    public static List<String> getproducts() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode data = mapper.readTree(
                new File("C:\\Users\\User\\IdeaProjects\\C5Selenium\\Swag_Labs_Website\\Files\\products")
        );

        return mapper.convertValue(
                data.get("cartProducts"),
                mapper.getTypeFactory().constructCollectionType(List.class, String.class)
        );
    }

}

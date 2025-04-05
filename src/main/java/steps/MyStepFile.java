package steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import controller.Controller;
import io.cucumber.java.en.When;
import model.Data;
import model.Product;

public class MyStepFile {
    Controller controller= new Controller();
    @When("user hit the objects with without params")
    public void userHitTheObjectsWithWithoutParams() {
        controller.mobileDevice();
    }

    @When("user hit the objects with path param {int}")
    public void userHitTheObjectsWithPathParam(int param) {
        controller.mobileDevice(param);
    }

    @When("user create an object with request")
    public void userCreateAnObjectWithRequest() throws JsonProcessingException {
        String request="{\n" +
                "  \"name\": \"Apple MacBook Pro 15\",\n" +
                "  \"data\": {\n" +
                "  \"year\": 2019,\n" +
                "  \"price\": 1849.99,\n" +
                "  \"CPU model\": \"Intel Core i9\",\n" +
                "  \"Hard disk size\": \"1 TB\"\n" +
                "  }}";
//        ObjectMapper mapper = new ObjectMapper();
//        Product product = mapper.readValue(request, Product.class);
//        product.setName("mac book 13");

        Data data=new Data();
        Product product=new Product();
        data.setPrice(1488);
        data.setCPUModel("Intel Core i9");
        data.setHardDiskSize("1 TB");
        data.setYear(2019);
        product.setData(data);
        product.setName("Apple MacBook Pro 15");
        controller.createMobileDevice(product);
    }
    @When("user hit the objects")
    public void usercreateAnobjectWithRequest(){
        controller.Products(7);

    }
}

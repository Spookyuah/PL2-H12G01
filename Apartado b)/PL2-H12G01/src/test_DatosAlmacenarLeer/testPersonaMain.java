package test_DatosAlmacenarLeer;
import com.google.gson.Gson;

public class testPersonaMain {
    public static void main(String[] args) {
        Gson gson = new Gson();
        testPersona p = new testPersona("Antonio Moratilla",97);
        String json = gson.toJson(p);
        System.out.println(json);
    }

}

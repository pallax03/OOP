import java.io.File;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

class CreateReadMe {
    static final String RELATIVE_PATH = "../";
    static final String README_PATH = RELATIVE_PATH+"README.md"; 
    static File readme = new File(README_PATH);;
    
    public static void main(String[] args) {
        System.out.println(readme.exists() ? "file exist" : "file not found");
        if(!readme.exists()) return ;

        try {
            List<String> line = Files.readAllLines(Paths.get(README_PATH), StandardCharsets.UTF_8);
            System.out.println(line.get(line.size()-1));

            line.add("gino pasticcio");
            for (String str : line) {
                Files.writeString(readme.toPath(), str + System.lineSeparator(),StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }   
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}

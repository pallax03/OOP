import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

class CreateReadMe {
    static final String RELATIVE_PATH = "./";
    static final String README_PATH = RELATIVE_PATH+"README.md"; 
    static File readme = new File(README_PATH);;
    
    public static void main(String[] args) {
        System.out.println(readme.exists() ? "file exist" : "file not found");
        if(!readme.exists()) return ;
        
        List<String> line = null;
        
        try {
            line = Files.readAllLines(Paths.get(README_PATH), StandardCharsets.UTF_8);
            line.get(line.size()-1);
            int count=0;
            File projects_path = new File("./Lezioni");
            for (String projects_name : projects_path.list()) {
                File project_path = new File("./Lezioni/"+projects_name);
                count++;
                if(count > nProjectAlreadyWrite(line)) {
                    line.add(writeListHead(count, projects_name));
                    for (String project_name : project_path.list()) {
                        line.add(writeListElement(projects_name, project_name));
                    }
                }
            }
        } catch (Exception e) {System.out.println(e);}
        
        saveReadMe(line);
        System.out.println("readme updated, ready to push");
    }

    static int nProjectAlreadyWrite(List<String> line) {
        int i=1;
        for (String word : line) {
            System.out.println(word);
            if(word.startsWith(i+".")) i++;
        }
        return i-1;
    } 

    static String writeListHead(int i, String Week_day) {
        return (i+". "+Week_day);
    }

    static String writeListElement(String Week_day, String project_name) {
        return "    * [`"+ project_name +"`]("+ getLink(Week_day +"/"+ project_name) +")";
    }

    static String getLink(String path_project) {
        return "https://github.com/pallax03/OOP/tree/master/Lezioni/"+path_project;
    }

    static void saveReadMe(List<String> line) {
        try {
            Files.deleteIfExists(readme.toPath());
            Files.createFile(readme.toPath());
            for (String str : line) {
                Files.writeString(readme.toPath(), str + System.lineSeparator(),StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }

        } catch (Exception e) {}
    }
}

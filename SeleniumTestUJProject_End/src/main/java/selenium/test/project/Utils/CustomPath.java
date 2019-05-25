package selenium.test.project.Utils;


//bedzie miała dwie metody


import java.io.File;
import java.nio.file.Paths;

public class CustomPath {
    public String getProjectPath(){
        //ta metoda zwróci nam informację jaka jest ścieżka do naszego projektu
        return System.getProperty("user.dir");
    }

    public String getResourcesPath(String resourceFile){
        return Paths.get(new File(getClass()
                .getClassLoader()
                .getResource(resourceFile)
                .getFile())
                .getAbsolutePath())
                .toString();
    }
}

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class fileManagement {
    void createFile(String list) throws  IOException {
        FileWriter file = new FileWriter("src/main/java/ucf/assignments/"+list+".txt");
    }
    void appendFile(String list, String task, String dueDate, String description, String status) throws IOException {
        FileWriter file = new FileWriter("src/main/java/ucf/assignments/"+list+".txt", true);
        String content = task+","+dueDate+","+description+","+status;
        file.write(content);
        file.write("\n");
        file.close();
    }
    String updateStatus(String list, String task, String dueDate, String description) throws IOException {
        String allContent = new String(Files.readAllBytes(Paths.get("src/main/java/ucf/assignments/"+list+".txt")));
        String oldContent = task+","+dueDate+","+description+",no";
        String newContent = task+","+dueDate+","+description+",yes";
        String replacement = allContent.replaceAll(oldContent, newContent);
        wipeFile(list);
        FileWriter file = new FileWriter("src/main/java/ucf/assignments/"+list+".txt", true);
        file.write(replacement);
        file.close();
        return newContent;
    }
    void wipeFile(String list) throws IOException{
        PrintWriter pw = new PrintWriter("src/main/java/ucf/assignments/"+list+".txt");
        pw.write("");
        pw.close();
    }
    String edit(String list, String oldContent, String newContent) throws IOException {
        String allContent = new String(Files.readAllBytes(Paths.get("src/main/java/ucf/assignments/"+list+".txt")));
        String replacement = allContent.replaceAll(oldContent, newContent);
        wipeFile(list);
        FileWriter file = new FileWriter("src/main/java/ucf/assignments/"+list+".txt", true);
        file.write(replacement);
        file.close();
        return replacement;
    }
    void renameFile(String oldName, String newName) throws IOException {
        Path source = Paths.get("src/main/java/ucf/assignments/"+oldName+".txt");
        Files.move(source, source.resolveSibling(newName));
    }
}
public class App extends Application {
    public static void main(String[] args) {
       launch(args);

    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("App.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}

package ucf.assignments;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Controller {
    @FXML
    private TextField listName;
    private TextField task;
    private TextField dueDate;
    private TextField description;
    private ListView listOfLists;
    private ListView listOfItems;

    public static void addAList(MouseEvent e) {
        /*
            String name = content in TextField listName
            If name includes text characters then:
                add content to listOfLists
                call class fileManagement
                call method createFile( name ) to create .txt file
         */
    }
    public static void deleteAList(MouseEvent e) {
        /*
            String list = selected item in listOfLists
            remove list from listOfLists
         */
    }
    public static void editListName(MouseEvent e) {
        /*
            set listOfLists to editable
            set cellFactory for listOfLists
            String oldName = list name before edit
            String newName = list name after edit
            Call class fileManagement
            Call method renameFile(oldName, newName)
         */
    }
    public static void stopEditListName(MouseEvent e){
        /*
            set ListView to not editable
         */
    }
    public static void addListItem(MouseEvent e) {
        /*
            String list = selected item in listOfLists
            String task = content in TextField task
            String dueDate = content in TextField dueDate
            String description = content in TextField description
            String status = "no"
            Call class fileManagement
            Call method appendFile( list, task, dueDate, description, status )
         */
    }
    public static void deleteListItem(MouseEvent e) {
        /*
            String list = selected item in listOfLists
            String task = selected item in listOfItems
            Remove task from listOfItems
            String new = "";
            Call class fileManagement
            Call method edit(list, oldContent, new)
         */
    }
    public static void markComplete(MouseEvent e) {
        /*
            String list = selected item in listOfLists
            String task = selected item's task name
            String dueDate = selected item's due date
            String description = selected item's description
            Call class fileManagement
            Call method updateStatus(list, task, dueDate, description)
        */
    }
    public static void editListItem(MouseEvent e) {
        /*
            set ListView listOfItems to editable
            String list = selected item on listOfLists
            String task = get item with edited changes
            String oldContent = task,dueDate,description,status before edit
            String newContent = task,dueDate,description,status after edit
            Call class fileManagement
            Call method edit(list, oldContent, newContent)
         */
    }
    public static void stopEditListItem(MouseEvent e) {
        /*
            set listOfItems to not editable
         */
    }
    public static void sortListItems(MouseEvent e) {
        /*
            String selection = get selected option
            if complete is selected:
                then only show ListView items with status of "yes"
            if incomplete is selected:
                then only show ListView items with status of "no"
            else
                show all items
         */
    }
    public static void uploadList(MouseEvent e) {
        /*
            add name of file to listOfLists
         */
    }
    public static void uploadMultipleLists(MouseEvent e) {
        /*
            add names of files to listOfLists
         */

    }
    public static void showItems(MouseEvent e) {
        /*
            String selected = get selected item from listOfLists
            Display file named same as selected list to listOfItems ListView
         */
    }
    public static void saveSelectedList(MouseEvent e) {
        /*
            save associated .txt file to directory of user's choice
         */
    }
    public static void saveAllLists(MouseEvent e) {
        /*
            save associated files to directory of user's choice
         */
    }
}

import java.io.File;

public class Second {
    public static void main(String[] args) {
        //Create an FOLDER
        String Path="C:\\Users\\bilal\\IdeaProjects\\src\\File handling\\NewFolder\\";
        //Create an File class Object
        File f1=new File(Path);

        boolean createFolder=f1.mkdir();
        System.out.println("The Folder is Created "+createFolder);
    }
}

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class First {
    public static void main(String[] args)  {
    //path
        String Path="C:\\Users\\bilal\\IdeaProjects\\src\\File handling\\stream.java\\";
        //Create an File class Object
        File f1=new File(Path);

//        Handle Using Try Catch
        try{
            if(f1.exists()){
                System.out.println("File is Already Present "+f1.getName());
//                System.out.println("Length of File is "+f1.length());
            }
            else{
//                not Exists
                boolean forisCreated=f1.createNewFile();
                if(forisCreated){
                    System.out.println("The file is Created Sucessesfully "+f1.getName());
                    System.out.println(f1.length()+" Bytes");

                }else {
                    System.out.println("File Could not be created..");
                }
            }
        }catch (IOException i){
            System.out.println("The Error occured during creation of FILE");
            i.printStackTrace();
        }
        f1.delete();
    }
}

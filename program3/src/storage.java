import java.util.ArrayList;
import java.util.Hashtable;

public class storage {

    String [] line;
    String val;

    public storage(String[] line) {
        this.line = line;
    }

    public boolean isLecture() {

        if (line[14].equals("Lecture") || line[14].equals("Seminar"))
            return true;
        else
            return false;
    }

    public String class_num(){

        String title = line[1];
        String val = (title.substring(0,8));
        this.val = val;
        return val;
    }
    public String  teacher (){
        String title = line[8]+" "+line[7].substring(1)+" Teaches this course";
        return title;
    }
    public String  teach (){
        String title = line[7];
        return title;
    }



}


public class msu  {

        String key;
        String val;
        String[] line;

    public msu(String[] line) {
        this.line = line;
    }

    public String createKey() {
        return(line[15] + "-" + line[16]);
    }

    public String toString(){

        String val = line[1]+ " \t\t\t\t\t\t"+ line[4]+" \t\t\t\t\t" + line[2];
        this.val = val;
        return val;
    }


    public int incrementSections (String[] keys){

        return 0;
    }

    public int getSeats(String[] counter){

        return 0;
    }

    public boolean isLecture() {

        if (line[14].equals("Lecture") || line[14].equals("Seminar"))
            return true;
        else
            return false;
    }



    public static void prnt_header(){
        System.out.println("ID"+"\t\t\t\t"+"Section"+"\t\t\t\t"+
            "Seats"+"\t\t\t\t"+"Title"+"\t\t\t\t\t\t\t\t\t\t\t\t\t"+"When");
    }
}

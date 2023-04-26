package Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class General<T extends List> {
    private T data;
    General(){
        System.out.println("This Object have been initialised");
    }
    public static void main(String[] args) {
        General<ArrayList> G1=new General<>();
        General<LinkedList> G2=new General<>();
    }
}

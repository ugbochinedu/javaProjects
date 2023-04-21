import java.util.ArrayList;
import java.util.List;

public class Assignment {
    //String assignment = "ab##d";
    List<String> tempArray = new ArrayList<>();
    public List<String> changeToArray(String assignment){
        for (int i = 0; i < assignment.length(); i++) {
            tempArray.add(String.valueOf(assignment.charAt(i)));
        }
        //deletePoundsChar(tempArray);
        return tempArray;
    }

    public List<String> deletePoundsChar(List<String> tempArray){
        for (int i = 0; i < tempArray.size(); i++) {
            if (tempArray.get(i).equals("#")){
                tempArray.remove(i -1);
                tempArray.remove(i);
                i-=2;
            }
        }
        return tempArray;
    }
}

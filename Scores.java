import java.util.*;
public class Scores {
    public static void main(String[] args) {
        String[][] at = {
                {"HTML","C#"},
                {"C#","Python"},
                {"Python","HTML"}
        };
        String out = "";
        int[] res = {0,0,1};
        int temp = 0;
        HashMap<String , Integer> hm = new HashMap<>();

        for(int i=0;i< res.length;i++){
            if(res[i]==0){

                hm.put(at[i][1],hm.getOrDefault(at[i][1],0)+1);
            }
            if(res[i]==1){

                hm.put(at[i][0],hm.getOrDefault(at[i][0],0)+1);
            }
        }
        for(Map.Entry<String,Integer> entry:hm.entrySet()){
            if(entry.getValue()>temp){
                temp=entry.getValue();
                out = entry.getKey();
            }
        }
        System.out.println(out);
    }
}
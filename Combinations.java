import java.util.*;

public class Combinations {

    static List<String> cmb(String s,int st, List<String> res ,String temp){
        if(temp.length()!=0){
            res.add(temp);
        }

        for(int i=st;i<s.length();i++){
            cmb(s,i+1,res,temp+s.charAt(i));
        }
        return res;


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        List<String> res=cmb(s,0,new ArrayList<>(),"");
        System.out.println(res);
        System.out.println(res.size());
    }
}

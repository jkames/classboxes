import java.util.*;

public class asssignment7 {
    public static StringBuilder removeDuplicates(String list){
        HashSet<Character> s = new LinkedHashSet<>();
        for(int i = 0; i < list.length(); ++i){
            int a = list.charAt(i);
            if(a >= 47 && a <= 57){
                s.add(list.charAt(i));
            }
        }
        StringBuilder ret = new StringBuilder();
        for(char x : s) {
            ret.append(x);
            ret.append(",");
        }
        System.out.println(ret);

        return ret;
    }
    public static void main(String[] args) {
        String list = "1395jf?$";
        boolean foundEven = false;
        StringBuilder ret = removeDuplicates(list);

        String newList = ret.toString();
        String str[] = newList.split(",");
        List<Integer> nl = new ArrayList<Integer>();

        for(String s : str){
            nl.add(Integer.valueOf(s));
        }
        Collections.sort(nl, Collections.reverseOrder());

        for(int i = nl.size()-1; i >= 0; --i){
            if(nl.get(i)%2==0){
                nl.add(nl.get(i));
                nl.remove(i);
                foundEven = true;
                break;
            }
        }
        if(!foundEven)
            System.out.println("-1");
        else {
            for (var s : nl)
                System.out.print(s);
        }
        System.out.println();
    }
}

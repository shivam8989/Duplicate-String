package Recursion;

public class Dupilcatestring {
    public static void rempveDuplicates(String str, int idx, StringBuilder ns, boolean map[]){
        if(idx==str.length()){
            System.out.println(ns);
            return;
        }
        char currentchar = str.charAt(idx);
        if(map[currentchar - 'a']== true){
            rempveDuplicates(str,idx+1,ns,map);
        }else{
            map[currentchar - 'a'] = true;
                rempveDuplicates(str,idx+1,ns.append(currentchar),map);
        }

    }
    public static void main (String args[]){
        String a = "shivvvaammssiinngghh";
        rempveDuplicates(a,0,new StringBuilder(" "),new boolean[26]);
    }
}

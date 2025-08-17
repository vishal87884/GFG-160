import java.util.HashSet;

public class LongestSubstring {
public static void main(String[] args) {
    String str="heelo";
    int res=find(str);
    System.out.println(res);
}

private static int find(String str) {
    HashSet<Character> hs=new HashSet<>();
       int s=0,e=0;
       int res=0;
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(!hs.contains(ch)){
              hs.add(ch);
              e++;
           }else{
               hs.clear();
               hs.add(ch);
               s=i;
               e=i+1;
           }
           res=Math.max(res,(e-s));
       }
       return res;
}
public int longestUniqueSubstr(String str) {
       int n=str.length()-1;
       int s=0;
       int res=0;
       int index[]=new int[26];
       for(int i=0;i<26;i++){
           index[i]=-1;
       }
       for(int e=0;e<n;e++){
           s=Math.max(s,index[str.charAt(e)-'a']+1);
           res=Math.max(res,e-s+1);
           index[str.charAt(e)-'a']=e;
       }
       return res;
    }
}

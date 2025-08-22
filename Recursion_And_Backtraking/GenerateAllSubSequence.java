package Recursion_And_Backtraking;

import java.util.ArrayList;
import java.util.HashSet;

public class GenerateAllSubSequence {
    public static void main(String[] args) {
        // String str = "abc";
        // HashSet<String> set = new HashSet<>();
        // generate(str, 0, "", set);

        // for (String s : set) {
        //     System.out.print(s + " ");
        // }
        generateAll(new int []{1,2,3}, 0, new ArrayList<>());
    }

    // Recursive function
    private static void generate(String str, int index, String current, HashSet<String> set) {
        if (index == str.length()) {
            if (!current.isEmpty()) {  // ignore empty subsequence if you want
                set.add(current);
            }
            return;
        }

        // 1️⃣ Include current character
        generate(str, index + 1, current + str.charAt(index), set);

        // 2️⃣ Exclude current character
        generate(str, index + 1, current, set);
    }


    private static void generateAll(int []arr ,int index, ArrayList<Integer> res){
        if (index>=arr.length) {
            System.out.println(res);
            return ;
        }
        res.add(arr[index]);
        generateAll(arr, index+1, res);
        res.remove(res.size()-1);
        generateAll(arr, index+1, res);
    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ArrayOfAnagram{
  static String charToArray(String s){
    int arr[]=new int[26];
    for(char c:s.toCharArray()){
      arr[c-97]+=1;
    }
    return Arrays.toString(arr);
  } 
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1[]=sc.nextLine().split(" ");
    String s2[]=sc.nextLine().split(" ");
    Map<String,Integer> mp=new HashMap<>();
    for(String s:s1){
      String tp=charToArray(s.trim());
      if(mp.containsKey(tp)){
        mp.put(tp, mp.get(tp)+1);
        continue;
      }mp.put(tp, 1);
    }
    System.out.println(mp);
    for(String s:s2){
      String tp=charToArray(s);
      if(mp.containsKey(tp)){
        System.out.println(s+" "+mp.get(tp));
      }else{
        System.out.println(s+" "+0);
      }
    }
    sc.close();
  }
}
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.TreeMap;
//
//public class Main {
//  {
//
//    static boolean isAnagram (String a, String b){
//    Map<Character, Integer> map1 = new TreeMap<>();
//    Map<Character, Integer> map2 = new TreeMap<>();
//    for (int i = 0; i < a.length(); i++) {
//      if (map1.containsKey(a.charAt(i))) {
//        map1.put(a.charAt(i), map1.get(a.charAt(i)) + 1);
//      } else {
//        map1.put(a.charAt(i), 1);
//      }
//    }
//    for (int i = 0; i < b.length(); i++) {
//      if (map2.containsKey(b.charAt(i))) {
//        map2.put(b.charAt(i), map2.get(b.charAt(i)) + 1);
//      } else {
//        map2.put(b.charAt(i), 1);
//      }
//    }
////    for (int i = 0; i < map1.size() - 1; i++) {
////      if (map1.get() != map2.get(i).intValue()) {
////        return false;
////      }
////    }
////    return true;
//
////List<Integer> i1= (List<Integer>) map1.values();
////    List<Integer> i2= (List<Integer>) map2.values();
//    Integer count1 = map1.values().stream().reduce(0, (x, y) -> x + y).intValue();
//    Integer count2 = map2.values().stream().reduce(0, (m, n) -> m + n).intValue();
//
//
////    Integer count1=i1.stream().reduce(0,(c,d)->c+d).intValue();
////
////    Integer count2=i2.stream().reduce(0,(e,f)->e+f).intValue();
//    if (count1 == count2) {
//      return true;
//    } else {
//      return false;
//    }
//  }
//    public static void main (String[]args){
//
//  }
//  }}

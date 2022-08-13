//! Place The Alphabets


import java.util.Arrays;
import java.util.HashMap;


public class PlaceTheAlphabet {
  public static char[] placeTheAlphabets(int[] input1) {
      int b[] = new int[input1.length];
      for (int i = 0; i < input1.length; i++) 
      {
          b[i] = input1[i];
      }
      Arrays.sort(b);
      char c[] = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q','r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
      char[] c1 = new char[b.length];
      HashMap<Integer, Character> m = new HashMap<Integer, Character>();
      for (int i = 0; i < b.length; i++) 
      {
          m.put(b[i], c[i]);
      }
      for (int i = 0; i < input1.length; i++) 
      {
          c1[i] = m.get(input1[i]);
      }
      return c1;

  }

  public static void main(String[] args) {
       int input[]=new int[]{10,5,70,1};
//      int input[]=new int[]{4,5,-2,8,99,67};
      char output[]=placeTheAlphabets(input);
      // System.out.println(placeTheAlphabets(input));
      System.out.println(Arrays.toString(output).replaceAll("\\[", "{").replaceAll("\\]", "}"));
  }
}
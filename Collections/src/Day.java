import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Day {
    String day;

    Day(String d) {
        day = d;
    }

    public boolean equals(Object o) {
        return ((Day) o).day == this.day;
    }

     public int hashCode() { return 9; }

     public static void main(String[] args) {
         // string is immutable its value is never changed
         // in case if we try to append any new character to it a new string object is created
         // in the string pool
         // comment the code which appends 'd' to s1 and run again
         String s1 = "abc";
         String s2 = s1;
         s1 += "d";
         System.out.println(s1 + " " + s2 + " " + (s1==s2));
         StringBuffer sb1 = new StringBuffer("abc");
         StringBuffer sb2 = sb1;
         sb1.append("d");
         System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2));
         } 
}

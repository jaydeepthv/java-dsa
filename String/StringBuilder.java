import java.util.*;

public class Main{
    
    public static void main(String args[]){
        
     StringBuilder sb = new StringBuilder();
     for(int i = 0; i< 26 ; i++){
         char ch = (char)('a' + i);
         sb = sb.append(ch + " ");
         
     }
    System.out.println(sb);
    System.out.print(sb.reverse());
      }
}

/*
======== StringBuilder ========

Create:
StringBuilder sb = new StringBuilder();

Append:
sb.append(value);

Get Character:
sb.charAt(index);

Change Character:
sb.setCharAt(index, ch);

Delete:
sb.delete(start, end);
sb.deleteCharAt(index);

Insert:
sb.insert(index, value);

Reverse:
sb.reverse();

Length:
sb.length();

Convert to String:
sb.toString();

==============================

Most Important:
append()
charAt()
setCharAt()
deleteCharAt()
reverse()
length()
toString()

Remember:
String -> Immutable
StringBuilder -> Mutable
*/

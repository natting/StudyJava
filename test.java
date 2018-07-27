package JumpToJava;
import java.util.ArrayList;
import java.util.HashMap;

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World");
        System.out.println("Hello World");

        String a = "hello";
        String b = "java";
        String c = "hello";

        System.out.println(a.equals(b)); // false
        System.out.println(a.equals(c)); // true
        
        String aa = "hello";
        String bb = new String("hello");
        System.out.println(aa.equals(bb));
        System.out.println(aa==bb);//aa,bb 는 서로 다른 객체
        
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb.toString());
        /*
         * String temp = "";
         * temp += "hello";
         * temp += " ";
         * temp += "jump to java";
         * System.out.println(temp);
         * */
        StringBuffer sbb = new StringBuffer();
        sbb.append("jump to java");
        sbb.insert(0, "hello ");
        System.out.println(sbb.toString());
        
        String[] weeks1 = new String[7];
        String[] weeks2 = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(weeks2[3]);
        weeks1[4] = "목";
        System.out.println(weeks1[4]);
        
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }
               
        ArrayList<String> pitches = new ArrayList<String>();
        //ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("138");
        pitches.add("140");
        pitches.add("150");
        System.out.println(pitches.get(0));
        System.out.println(pitches.get(2));
        
        //HashMap key, value
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.containsKey("baseball"));
       	System.out.println(map.get("people"));
        System.out.println(map.get("baseball"));
        
    }
}

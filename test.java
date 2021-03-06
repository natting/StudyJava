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
        // method : put, get, containsKey, remove, size, 
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.containsKey("baseball"));
       	System.out.println(map.get("people"));
        System.out.println(map.get("baseball"));
        map.put("football", "soccer");
        System.out.println(map.size());
        System.out.println(map.remove("people"));
        System.out.println(map.size());
        
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");
        pocket.add("money");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        }

        String[] numbers = {"one", "two", "three"};
        int[] marks = {90, 25, 67, 45, 80};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 60) {
                System.out.println((i+1)+"번 학생은 합격입니다.");
            }else {
                System.out.println((i+1)+"번 학생은 불합격입니다.");
            }
        }
    }
}

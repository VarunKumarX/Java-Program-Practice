package main.java;

public class StringBuilders {
    public static void main(String[] args) {

        // Declaration
        StringBuilder sb = new StringBuilder("tony stark");
        System.out.println(sb);
        StringBuilder sb2 = new StringBuilder(" only.");

        // charAt(index)
        System.out.println(sb.charAt(0));

        // setCharAt(index,character) - replaces the character
        sb.setCharAt(0,'p');
        System.out.println(sb);

        // insert(index,character)
//        sb.insert(20,'o'); //out of bound error, max index for current sb is 10
        sb.insert(2,'o');
        System.out.println(sb);

        // delete(start,end)  -  end isn't included
        sb.delete(1,2);
        System.out.println(sb);
        sb.delete(4,sb.length());
        System.out.println(sb);

        // Append - means to add something at the end.
        sb.append(" "+'s');       //str =str + " s";
        System.out.println(sb);
        sb.append("tark");        //str = str + "tark";
        System.out.println(sb);
        System.out.println(sb.append(sb2));
        System.out.println(sb);

        // length
        System.out.println(sb.length());

        // concatenation (good for one time)
        StringBuilder sen =new StringBuilder("i am "+sb); //declaration+concat
        System.out.println(sen);

        //concatenation (for multiple times)
        StringBuilder sen2 =new StringBuilder("me hu "); // decalaration
        sen2.append(sb);
        System.out.println(sen2);
    }
}

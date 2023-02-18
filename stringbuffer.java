public class stringbuffer {

    public static void main (String args[])
    {
        StringBuffer sb = new StringBuffer("oluwafemi");
        System.out.println(sb.capacity()); //buffer size
        System.out.println(sb.length()); //lenght of string
        System.out.println(sb.append(" sopade")); //adding a value to string

        sb.insert(0, "java progamming for ");

        


        String str = sb.toString(); //this will convert stringBuffer to string
        sb.reverse();
        System.out.println(sb);

        System.out.println("*********");

        System.out.println(str);

    }
    
}

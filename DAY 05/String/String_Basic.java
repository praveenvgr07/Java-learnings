public class String_Basic {
    public static void main(String[] args) {
        String name = "praveen";
        String name1 = " praveen ";
        String name3 = new String("praveen"); // it will store in the new location.

        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.startsWith("r"));
        System.out.println(name.endsWith("r"));
        System.out.println(name.contains(name3));
        System.out.println(name.compareTo(name3));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("x"));
        System.out.println(name.substring(4, 5));
        System.out.println(name1.trim());
        System.out.println(name1.strip());
        String str = " welcome to java";
        System.out.println(str.split(" "));
        String[] arr =  str.split(" ");
           for(String s : arr){
             System.out.println(s);
            }
           String a  = "java";
           String b = new String("java");
           String c = a.intern();

           System.out.println(a == b);
           System.out.println(a == c);

        System.out.println(name == name1); // by default it will store in the scp (String constant pool).
        System.out.println(name.equals(name1));
        System.out.println(name3 == name); // it will show false because.
        System.out.println(name3.equals(name));
    }
}

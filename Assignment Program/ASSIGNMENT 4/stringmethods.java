

public class StringMethods {
    public static void main(String[] args) {
        String name="sonali";
        String name1="SONALI";
        String str1="Java is very intresting programming";
        String samestr1="Java is very intresting programming";
        String str2 ="     Learn Java Strings     ";
        //length ()
        System.out.println("1.length :"+name.length());
        //charAt()
        System.out.println("2.charAt :"+name.charAt(4));
        //subString()
        System.out.println("3.subString :"+str1.substring(0,8));
        //concat()
        System.out.println("4.concat:"+str2.concat(str1));
        //equals()
        System.out.println("5.equals :"+str1.equals(samestr1));
        // 6. equalsIgnoreCase()
        System.out.println("6. equalsIgnoreCase() = " +name.equalsIgnoreCase(name1));
        //comparedto()
        System.out.println("7.compareto :"+str1.compareTo(samestr1));
        //indexof()
        System.out.println("8.index of :"+str1.indexOf("java"));
        // lastindexof()
        System.out.println("9.last index of :"+str2.lastIndexOf("Strings"));
        //contains()
        System.out.println("10.contains of :"+samestr1.contains("interesting"));
        //startswith()
        System.out.println("11.startswith :"+str1.startsWith("Java"));
        //endswith()
        System.out.println("12.ends with :"+str2.endsWith("     "));
        //toLowerCase()
        System.out.println("13.toLowerCase :"+name1.toLowerCase());
        //toUpperCase()
        System.out.println("14.toUpperCase :"+name.toUpperCase());
        //trim()
        System.out.println("15.trim : ["+str2.trim()+"]");



    }
}

class Marks{
    public static void main(String args[]){
        // Creating a String array and storing marks of five subjects
        String marks[] = {"85", "80", "90", "93", "95"};

        // Converting String values into integer values using parseInt()
        int mark1 = Integer.parseInt(marks[0]);
        int mark2 = Integer.parseInt(marks[1]);
        int mark3 = Integer.parseInt(marks[2]);
        int mark4 = Integer.parseInt(marks[3]);
        int mark5 = Integer.parseInt(marks[4]);

        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;    
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}

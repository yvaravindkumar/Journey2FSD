package org.first.week1;

import java.util.HashMap;

//hashmap class
class StudentDirectory{

    private Integer studentId;
    private String studentName;
    HashMap<Integer,String> directory = new HashMap<>();

    StudentDirectory(){};
    StudentDirectory(Integer studentId,String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
    }

    String addStudent(Integer studentId, String studentName){
        return directory.put(studentId,studentName);
//        return "Added stuident "+studentId +" "+studentName;
    }
    String deleteStudent(Integer studentId){
        return directory.remove(studentId);
    }

    String getStudentName(Integer studentId){
        return directory.get(studentId);
    }

    HashMap<Integer,String> getDirectory(){
        return directory;
    }

}

public class Day3 {
    public static void main(String[] args){

        //arraylist
//        ArrayList<String> al = new ArrayList<>();
//        al.add("Hello");
//        al.add(1,"123");
//        System.out.println(al);
//        al.set(0,"hi");
//        al.add("Hello");
//        System.out.println(al);
//        System.out.println(al.get(1));
//        System.out.println(al.isEmpty());
//        for(String a : al){
//            System.out.print(a);
//        }

        //hashset
//        HashSet<Integer> hs1 = new HashSet<>();
//        hs1.add(2);
//        System.out.println(hs1.contains(1));
//        hs1.add(432);
//        hs1.add(897654);
//        hs1.add(0);
//        hs1.add(2);
//        System.out.println(hs1);
//        hs1.remove(0);
//        System.out.println(hs1.size());
//        for(Integer i : hs1){
//            System.out.println(i);
//        }

        //hashmap
//        HashMap<String,Character> hm1 = new HashMap<>();
//        hm1.put("hello",'a');
//        hm1.put("Hi",'b');
//        hm1.putIfAbsent("Hello",'c');
//        System.out.println(hm1);
//        for(String a:hm1.keySet()){
//            System.out.println(a+"->"+hm1.get(a));
//        }

        StudentDirectory sd1 = new StudentDirectory();
        sd1.addStudent(34567,"arun");
        sd1.addStudent(98765,"Resin");
        sd1.addStudent(19876,"westah");
        System.out.println(sd1.getDirectory());
        System.out.println(sd1.getStudentName(12323));
        System.out.println(sd1.deleteStudent(98765)+" is deleted");
        System.out.println(sd1.getDirectory());
    }
}

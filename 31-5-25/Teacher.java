 import java.util.Arrays;
        public class Main{
            public static void main(String[]args){
               Teacher t1=new Teacher("Sarada","23705A0210","EEE",new String[]{"electrical machines,BEE"});
               t1.details();
            }
        }  
               
               public class Teacher{
                   String name;
                   String id;
                   String dept;
                   String[]subject;
                   Teacher(String name,String id,String dept,String[]subject){
                       this.name=name;
                       this.id=id;
                       this.dept=dept;
                       this.subject=subject;
                   }
                   void details(){
                       System.out.println("_ _ _ _ ");
                       System.out.println("Teacher name:"+name);
                       System.out.println("Teacher id:"+id);
                       System.out.println("Department:"+dept);
                       System.out.println(" subject");
                       for(String subject:subject){
                           System.out.println(subject+" ");
                       }
                       
                   }
               }
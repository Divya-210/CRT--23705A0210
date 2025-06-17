 import java.util.Arrays;
        public class Main{
            public static void main(String[]args){
               App a1=new App("Zomata","food","1000000","10k");
               a1.details();
            }
        }  
               
               public class App{
                   String name;
                   String category;
                   String downloads;
                   String reviews;
                   App(String name,String category,String downloads,String reviews){
                       this.name=name;
                       this.category=category;
                       this.downloads=downloads;
                       this.reviews=reviews;
                   }
                   void details(){
                       System.out.println("_ _ _ _ ");
                       System.out.println("App name:"+name);
                       System.out.println("App category:"+category);
                       System.out.println("App downloads:"+downloads);
                       int downloadCount=Integer.parseInt(downloads);
                       if(downloadCount>100000){
                      
                           System.out.println("App is popular");
                       }
                       else{
                           System.out.println("App is not popular");
                       }
                       
                   }
               }
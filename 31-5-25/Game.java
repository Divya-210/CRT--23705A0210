 import java.util.Arrays;
        public class Main{
            public static void main(String[]args){
               Game g1=new Game("LudoKing","FamilyFriendly",4,8.7f);
               g1.details();
            }
        }  
               
               public class Game{
                   String name;
                   String zonor;
                   int playcount;
                   float rating;
                   Game(String name,String zonor,int playcount,float rating){
                       this.name=name;
                       this.zonor=zonor;
                       this.playcount=playcount;
                       this.rating=rating;
                   }
                   void details(){
                       System.out.println("_ _ _ _ ");
                       System.out.println("Game name:"+name);
                       System.out.println("Game zonor:"+zonor);
                       System.out.println("Game playcount:"+playcount);
                       System.out.println("Game rating:"+rating);
                       
                   }
               }
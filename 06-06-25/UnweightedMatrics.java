 import java.util.Arrays;
        public class Main{
            public static void main(String[]args){
             Graph graph=new Graph(4);
             graph.addEdge(0,1);
             grph.printGraph();
            }
        }
        class Graph{
            int[][]graph;
            int vertices;
            Graph(int vertices){
                graph=new int[vertices][vertices];
                this.vertices=vertices;
            }
            void addEdge(int src, int dest){
                if(src>=0&dest>=0&&src<vertices&&src!=dest){
                    graph[src][dest]=1;
                    graph[dest][src]=1;
                }
                else{
                    System.out.println("Invalid source and destination");
                }
            }
            boolean isValid(int src,int dest){
                return src>=0 & dest>=0 && src< vertices && dest<vertices && src
            }
        }
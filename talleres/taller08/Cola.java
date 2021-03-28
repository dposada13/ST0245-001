import java.util.*;
public class cola{   
public static void cola(Queue<Integer> pedidos, Stack<String> neveras){
        while (!pedidos.isEmpty() || !neveras.isEmpty()){
            int a=pedidos.poll();
            for (int i=0; i<a; i++){
                if (!neveras.isEmpty()){
                    break;
                }
                System.out.println("estamos atendiendo a: " + a +"la nevera a:" + neveras.pop());
            }
            
            
        }
        
    }
}      

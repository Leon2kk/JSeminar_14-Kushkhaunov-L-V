
package src.main.javafiles;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public String ANSI_RESET = "\u001B[0m";
    public String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {



        System.out.println("Main.main()");
        Main newmain = new Main();
        
        Integer[] arr = {1, 2, 3, null, 5, null, 7, null, 9};
        List<Integer> indexes = newmain.checkArray(arr);

        newmain.view(arr,  indexes);
    
    }

    public List<Integer> checkArray(Integer[] arr){
        List<Integer> indexException = new ArrayList<>();

        for(int i=0; i < arr.length;  i++)
        {
            try {
                if (arr[i] == null)
                    throw new IllegalStateException();
            } catch (Exception e) {
                indexException.add(i);
                System.out.println("Элемент " + i + " содержит NULL");
            }
        }

        return indexException;
    }

    public void view(Integer[] arr, List<Integer> indexes){
        
        for(int i = 0; i < arr.length;  i++){
    
            if  (indexes.indexOf(i) >= 0)
                {
                    System.out.print(ANSI_YELLOW + arr[i] + ANSI_RESET + " ");
                }
            else 
                System.out.print(arr[i] + " ");
   
        }
    }
}

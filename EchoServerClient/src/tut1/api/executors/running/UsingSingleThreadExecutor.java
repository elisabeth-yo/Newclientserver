
package tut1.api.executors.running;

import java.util.concurrent.ExecutorService;

public class UsingSingleThreadExecutor {
    
    public static void main (String[] args){
       System.out.println("Main thread starts here...");
       
       ExecutorService execService = Executors.newSingleThreadExecutor();
       
       execService.execute(new LoopTaskA());
       execService.execute(new LoopTaskA());
       execService.execute(new LoopTaskA());
       execService.execute(new LoopTaskA());
       execService.execute(new LoopTaskA());
       execService.execute(new LoopTaskA());
       
       execService.shutdown();
       
       System.our.println("Main thread ends here...")    
       
    }
}

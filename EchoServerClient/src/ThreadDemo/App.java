/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemo;
/*class MyTask{
    void executeTask(){
        for(int doc=1;doc<=10;doc++){
            System.out.println("@@Printing Document #" + doc + " - Printer2");
        }
    }
}*/

class MyTask extends Thread{
    public void run(){
        for(int doc=1;doc<=10;doc++){
            System.out.println("@@Printing Document #" + doc + " - Printer2");
        }
    }
}

public class App {
    public static void main (String[] args){
        
        System.out.println("Application Started");
        MyTask task = new MyTask();
        /*task.executeTask*/
        task.start();
        
        for (int doc=1; doc<=10;doc++){
            System.out.println("^^Printing Document #" + doc +" -Printer1");
        }
        System.out.println("Application Finnished");   
        
    }
}

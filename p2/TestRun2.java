class TestRun2 extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
  TestRun2 t1=new TestRun2();  
  TestRun2 t2=new TestRun2();  
   
  t1.start();  
  t2.start();  
 }  
} 

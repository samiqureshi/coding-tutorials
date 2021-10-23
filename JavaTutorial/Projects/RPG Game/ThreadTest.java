public class ThreadTest {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            System.out.println("From Player 1: " + (i+1));
        }
        for(int i = 0; i < 10; i++){
            System.out.println("From Player 2: " + (i+1));
        }

        Thread t1 = new Thread(){
            @Override
            public void run(){
                for(int i = 0; i < 10; i++){
                    System.out.println("From Player 1: " + (i+1));
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run(){
                for(int i = 0; i < 10; i++){
                    System.out.println("From Player 2: " + (i+1));
                }
            }
        };

        t1.start();
        t2.start();
    }
}

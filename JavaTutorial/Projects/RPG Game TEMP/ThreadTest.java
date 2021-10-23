public class ThreadTest {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            System.out.println(i + 1 + " Attack From Player 1");
        }
        for(int i = 0; i < 10; i++){
            System.out.println(i + 1 + " Attack From Player 2");
        }

        // Thread t1 = new Thread(){
        //     @Override
        //     public void run(){
        //         for(int i = 0; i < 10; i++){
        //             System.out.println(i + 1 + " Attack From Player 1");
        //         }
        //     }
        // };
        // Thread t2 = new Thread(){
        //     @Override
        //     public void run(){
        //         for(int i = 0; i < 10; i++){
        //             System.out.println(i + 1 + " Attack From Player 2");
        //         }
        //     }
        // };
        // t1.start();
        // t2.start();
    }
}
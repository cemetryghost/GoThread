public class Main {
    public static void main(String[] args) {
        int number = 1;

        for(int i = 0; i < 9; i++) {
            new Thread(new GoThread(number)).start();
            number++;
        }
        System.out.println("Главный поток - " + Thread.currentThread());
    }
}

class GoThread implements Runnable{
    int number;

    GoThread(int number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread: " + number);
    }
}



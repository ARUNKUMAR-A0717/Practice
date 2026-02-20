class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: ");
        }
    }
}

    public static void main(String[] args) {
        MyThread t1 = new MyThread(); 
        B b1 = new B();  
        
        t1.start();
        b1.start();                  
    }
}

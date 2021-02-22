package ceshi;

public class ProducterAndConsumer {
    public volatile int num = 0;
    public synchronized void product()
    {
        if(num < 100)
        {
            System.out.println("开始生产："+num+"*************************************");
            ++num;
            notify();
        }
        else
        {
            System.out.println("货量充足，放心消费....................");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // notify();
        }
    }

    public synchronized void consuem()
    {
        if(num < 1)
        {
            try {
                System.out.println("货量不足，请生产");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("开始消费："+num);
            num--;
            notify();
        }
    }

    public static void main(String[] args)
    {
        ProducterAndConsumer producterAndConsumer = new ProducterAndConsumer();
        Producter prodocter = new Producter(producterAndConsumer);
        Consumer consumer = new Consumer(producterAndConsumer);
        prodocter.start();
        consumer.start();
    }
}

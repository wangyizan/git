package ceshi;

class Consumer extends Thread
{
    private ProducterAndConsumer producterAndConsumer;
    public Consumer(ProducterAndConsumer producterAndConsumer)
    {
        this.producterAndConsumer = producterAndConsumer;
    }
    public void run()
    {
        while(true)
        {
            producterAndConsumer.consuem();
        }
    }
}

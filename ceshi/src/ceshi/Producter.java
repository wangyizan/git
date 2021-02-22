package ceshi;

class Producter extends Thread
{
    private ProducterAndConsumer producterAndConsumer;
    public Producter(ProducterAndConsumer producterAndConsumer)
    {
        this.producterAndConsumer = producterAndConsumer;
    }
    public void run()
    {
        while(true)
        {
            producterAndConsumer.product();
        }
    }
}
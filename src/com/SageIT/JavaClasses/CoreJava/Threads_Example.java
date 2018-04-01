package com.SageIT.JavaClasses.CoreJava;

class Threads_Example implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println ("Thread " +
                                Thread.currentThread().getId() +
                                " is running");
 
        }
        catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }
    }
}
class Multithread
{
    public static void main(String[] args)
    {
        int n = 8; 
        for (int i=0; i<8; i++)
        {
            Thread object = new Thread(new Threads_Example());
            object.start();
        }
    }
}

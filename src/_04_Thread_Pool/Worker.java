package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable, Task{
	ConcurrentLinkedQueue<Task> taskQueue;
	public Worker(	ConcurrentLinkedQueue<Task> taskQueue)
{
		this.taskQueue = taskQueue;
		}
	@Override
	public void run() {
		if(taskQueue.isEmpty() == false)
		{
			taskQueue.remove().perform();
			
		}
		
	}
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
	}
	

	


}

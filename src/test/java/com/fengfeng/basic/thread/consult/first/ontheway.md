# https://www.tutorialspoint.com/java/java_multithreading.htm
# 写一个类 继承 runnable 接口, 但创建的话 还是要用Thread 接口, 所以本质上是一样的,
# 建议使用 runnable 接口，因为 java 不能多继承 。


# thread Methods 

- setDaemon
1. 必须在 start 前调用, 否则会有异常
2. 只有守护线程存在时,程序会退出

- public final void join(long millisec)
1. The current thread invokes this method on a second thread,
   causing the current thread to block until the second thread terminates or 
   the specified number of milliseconds passes.

- public void interrupt()
1. Interrupts this thread, causing it to continue execution if it was blocked for any reason.
  中断此线程，使其在因任何原因而被阻塞时继续执行。 
  ? 是不是说 线程被阻塞了,调用次方法可以中断次线程,让其他线程执行
  
	
- public final boolean isAlive()
1. Returns true if the thread is alive, 
   which is any time after the thread has been started but before it runs to completion(在他运行完成之前).
   
## ****   
The previous methods are invoked on a particular Thread object. The following methods in the Thread class are static. 
Invoking one of the static methods performs the operation on the currently running thread.     


- public static void yield()
 1. Causes the currently running thread to yield to
    any other threads of the same priority that are waiting to be scheduled.

- public static void sleep(long millisec)
 1.Causes the currently running thread to block for at least the specified number of milliseconds.
 
- public static boolean holdsLock(Object x)
  1. Returns true if the current thread holds the lock on the given Object.

- public static Thread currentThread()
  1. Returns a reference to the currently running thread, which is the thread that invokes this method.

- public static void dumpStack() 
 1. Prints the stack trace for the currently running thread, 
 which is useful when debugging a multithreaded application.  
        
    
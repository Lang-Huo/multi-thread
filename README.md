# multi-thread

---
学习多线程的知识

---

## 1.多线程实现方式

> 1. 继承Thread类，重写```run()```方法 
>    see `com.lslt.thread.InheritThread`的实现
>
> 2. 实现`Runnable`接口，并将其实例传递给`Thread`类的构造函数。
>
>    see `com.lslt.thread.MyRunnable`的实现
>
> 3. 使用Executor框架和ThreadPoolExecutor类创建
>
> 4. 实现Callable接口和Future，允许线程返回一个结果或抛出异常
>
>    see com.lslt.thread.MyCallable的实现



## 2.Java线程的状态及转换

> 1. 新建(New)状态:
>
>    ​	线程对象被创建，但是还没有调用start()，此时处于新建状态。
>
> 2. 运行(Runnable)状态：
>
>    ​	调用了start()方法，此时线程可能正在执行或等待CPU的调用(就绪状态)。
>
> 3. 阻塞(Blocked)状态：
>
>    ​	等待IO操作，等待获取锁等。
>
> 4. 等待(Waiting)状态
>
>    ​	线程调用Object.wait()，Thread.join()，LockSupport.park() 等方法。
>
> 5. 超时(Timed Waiting)等待：
>
>    ​	线程调用Object.wait(timeout)，Thread.join(timeout)，Thread.sleep(timeout) 等方法。
>
> 6. 终止(Terminated)状态：
>
>    ​	执行完run()或由于异常提前结束。

![操作系统线程状态流转](README.assets/操作系统线程状态流转.webp)
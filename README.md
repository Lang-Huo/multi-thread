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




# MultithreadingSimulator

This project is made to simulate how multithreading plays a vital role in excecuting multiple tasks in a few seconds. I follow the approach called learning by doing and hence this is the best way to know about the concept by implementing.

<hr/>
Multitasking
Multitasking is a process of executing multiple tasks simultaneously. We use multitasking to utilize the CPU. Multitasking can be achieved in two ways:

# Process-based Multitasking (Multiprocessing)
# Thread-based Multitasking (Multithreading)

1) Process-based Multitasking (Multiprocessing)
      Each process has an address in memory. In other words, each process allocates a separate memory area.
      A process is heavyweight.
      Cost of communication between the process is high.
      Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc.
      
2) Thread-based Multitasking (Multithreading)
      Threads share the same address space.
      A thread is lightweight.
      Cost of communication between the thread is low.

<hr/>
Task by task-:



![task by task](https://user-images.githubusercontent.com/89409457/183330719-0d41ac26-310c-4327-9d9e-17992c5c014b.gif)


All tasks at a time-:



![all tasks](https://user-images.githubusercontent.com/89409457/183330799-407b0459-f627-4098-802c-66c5e8da2e3e.gif)

<hr/>
Multithreading in java is a process of executing multiple threads simultaneously.

A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.

However, we use multithreading than multiprocessing because threads use a shared memory area. They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.

Java Multithreading is mostly used in games, animation, etc.
<hr/>

package com.akp.ds.queue;

interface QueueIntrface<T> {
	QueueIntrface<T> enqueue(T ele);
    T dequeue();
}


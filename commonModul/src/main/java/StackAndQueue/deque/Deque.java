package StackAndQueue.deque;


import StackAndQueue.queue.IQueue;

public interface Deque<E> extends IQueue<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();
}
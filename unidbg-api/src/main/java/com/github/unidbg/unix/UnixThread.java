package com.github.unidbg.unix;

import com.github.unidbg.Emulator;
import com.github.unidbg.arm.ThreadDispatcher;
import com.sun.jna.Pointer;

public class UnixThread extends Thread {
    public long context; //创建线程成功的时候必须得在这之前保存这个context
    public Pointer child_stack;

    public UnixThread(long context, Pointer child_stack){
        this.context=context;
        this.child_stack=child_stack;
    }

    @Override
    public void runThread(Emulator<?> emulator, long __thread_entry) {

    }
}

package com.alphatica.genotick.instructions;

import com.alphatica.genotick.processor.Processor;

import java.io.Serializable;

public class ReturnRegisterAsResult extends RegInstruction implements Serializable {
    @SuppressWarnings("unused")
    private static final long serialVersionUID = -884883538461289844L;

    private ReturnRegisterAsResult(ReturnRegisterAsResult i) {
        this.setRegister(i.getRegister());
    }

    @SuppressWarnings("unused")
    public ReturnRegisterAsResult() {
    }

    @Override
    public void executeOn(Processor processor) {
        processor.execute(this);
    }

    @Override
    public ReturnRegisterAsResult copy() {
        return new ReturnRegisterAsResult(this);
    }

}

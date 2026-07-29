package com.sthi.Debugg.service;

import com.sthi.Debugg.DTO.Debugger;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DebuggerService {

    Debugger addDebugger(Debugger debugger);


    Debugger updateDebugger(Long id, Debugger debugger);

    List<Debugger> getAllDebuggers();
}

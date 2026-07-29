package com.sthi.Debugg.service.impl;

import com.sthi.Debugg.DTO.Debugger;
import com.sthi.Debugg.repository.DebuggerRepository;
import com.sthi.Debugg.service.DebuggerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebuggerServiceImpl implements DebuggerService {
    private final DebuggerRepository repository;

    public DebuggerServiceImpl(DebuggerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Debugger addDebugger(Debugger debugger) {
        return repository.save(debugger);
    }

    @Override
    public Debugger updateDebugger(Long id, Debugger debugger) {

        Debugger existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Debugger not found"));

        existing.setName(debugger.getName());
        existing.setEmail(debugger.getEmail());

        return repository.save(existing);
    }


    @Override
    public List<Debugger> getAllDebuggers() {
        return repository.findAll();
    }

}

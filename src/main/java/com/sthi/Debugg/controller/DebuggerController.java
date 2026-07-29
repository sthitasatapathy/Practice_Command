package com.sthi.Debugg.controller;

import java.util.List;

import com.sthi.Debugg.DTO.Debugger;
import com.sthi.Debugg.service.DebuggerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/debuggers")
public class DebuggerController {

    private final DebuggerService service;

    public DebuggerController(DebuggerService service) {
        this.service = service;
    }

    @PostMapping
    public Debugger addDebugger(@RequestBody Debugger debugger) {
        return service.addDebugger(debugger);
    }


    @PutMapping("/{id}")
    public Debugger updateDebugger(@PathVariable Long id,
                                   @RequestBody Debugger debugger) {
        return service.updateDebugger(id, debugger);
    }
    @GetMapping
    public List<Debugger> getAllDebuggers() {
        return service.getAllDebuggers();
    }


   private int value(){
        return 100;
   }
}
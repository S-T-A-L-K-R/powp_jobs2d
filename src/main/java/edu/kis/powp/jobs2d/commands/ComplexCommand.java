package edu.kis.powp.jobs2d.commands;

import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

public class ComplexCommand implements DriverCommand{

    private List<DriverCommand> commands;

    public ComplexCommand() 
    {
        this.commands = new ArrayList<>();
    }
    public void appendCommand(DriverCommand command)
    {
        this.commands.add(command);
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        for(DriverCommand command: commands)
        {
            command.execute(job2dDriver);
        }        
    }
    
}

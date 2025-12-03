package oop.ex4B2;

import java.util.List;

public class Parser {
    public Program parse(List<String> lines) {
        for(String line : lines) {
            try {
                String[] arg = line.split(" ");
                switch(arg[0]) {
                    case "acc":
                        if(arg.length != 2)
                            throw new IllegalArgumentException("Invalid number of arguments for " + arg[0]);
                        Integer.parseInt(arg[1]);
                        break;
                    case "jmp":
                        if(arg.length != 2)
                            throw new IllegalArgumentException("Invalid number of arguments for " + arg[0]);
                        Integer.parseInt(arg[1]);
                        break;
                    case "jnq":
                        if(arg.length != 2)
                            throw new IllegalArgumentException("Invalid number of arguments for " + arg[0]);
                        Integer.parseInt(arg[1]);
                        break;
                    case "inc":
                        if(arg.length != 1)
                            throw new IllegalArgumentException("Invalid number of arguments for " + arg[0]);
                        break;
                    case "dec":
                        if(arg.length != 1)
                            throw new IllegalArgumentException("Invalid number of arguments for " + arg[0]);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command: " + arg[0]);
                }
            } catch(Exception e) {
                throw new IllegalArgumentException("Invalid argument: " + line, e);
            }
        }
        return new Program(lines);
    }
}

package oop.ex4B2;

import java.util.List;

public class Program {
    private List<String> commands;
    public Program(List<String> lines) {
        this.commands = lines;
    }
    public int execute() {
        int acc = 0;
        int pc = 0;
        while(pc < commands.size() && pc >= 0)
        {
            String command = commands.get(pc);
            String[] arg = command.split(" ");
            switch (arg[0]) {
                case "acc":
                    acc += Integer.parseInt(arg[1]);
                    pc++;
                    break;
                case "jmp":
                    pc = Integer.parseInt(arg[1]);
                    break;
                case "jnq":
                    if(acc != Integer.parseInt(arg[1])) {
                        pc = Integer.parseInt(arg[1]);
                    } else
                        pc++;
                    break;
                case "inc":
                    acc++;
                    pc++;
                    break;
                case "dec":
                    acc--;
                    pc++;
                    break;
            }
        }
        return acc;
    }

}

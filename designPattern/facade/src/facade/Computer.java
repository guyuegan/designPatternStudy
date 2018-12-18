package facade;

public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startup() {
        System.out.println("active computer begin");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("active computer finish");
    }

    public void shutdown() {
        System.out.println("kill computer begin");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("kill computer finish");
    }
}

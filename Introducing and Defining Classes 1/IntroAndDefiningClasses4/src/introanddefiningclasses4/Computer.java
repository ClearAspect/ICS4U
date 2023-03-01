/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introanddefiningclasses4;

/**
 *
 * @author roanm
 */
public class Computer {

    //attributes
    private double hardDriveSize;
    private int memorySize;
    private double cpuSpeed;
    private String gpuModel;
    private boolean powerState;
    private boolean runningProgram;
    private boolean laptop;

    public Computer(int hardDriveSize, int memorySize, double cpuSpeed) {
        this.hardDriveSize = hardDriveSize;
        this.memorySize = memorySize;
        this.cpuSpeed = cpuSpeed;
        gpuModel = "integrated";
        powerState = false;
        laptop = false;
        runningProgram = false;

    }

    public Computer(int hardDriveSize, int memorySize, double cpuSpeed, String gpuModel, boolean powerState, boolean laptop, boolean runningProgram) {
        this(hardDriveSize, memorySize, cpuSpeed);
        this.gpuModel = gpuModel;
        this.powerState = powerState;
        this.laptop = laptop;
        this.runningProgram = runningProgram;

    }
    
    public void sendEmail(String msg) {
        System.out.println("Message has been sent");
    }

    public double getHardDriveSize() {
        return hardDriveSize;
    }

    public void setHardDriveSize(double hardDriveSize) {
        this.hardDriveSize = hardDriveSize;

    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    public boolean isPowerState() {
        return powerState;
    }

    public void turnOn() {
        if (!this.powerState) {
            this.powerState = true;
            System.out.println("Computer is on");
        }
    }
    public void turnOff() {
        if (this.powerState) {
            this.powerState = false;
            System.out.println("Computer is off");
        }
    }

    public boolean isRunningProgram() {
        return runningProgram;
    }

    public void runProgram(String path) {
        if (runningProgram) {
            System.out.println("The Program is running");
            this.runningProgram = true;
        }
    }

    public void closeProgram() {
        if (runningProgram) {
            System.out.println("The Program has stopped");
            this.runningProgram = false;
        }
    }

    public boolean isLaptop() {
        return laptop;
    }

    public void setLaptop(boolean laptop) {
        this.laptop = laptop;
    }

    public String toString() {
        return "Computer summary:\nCPU Clock Speed: " + cpuSpeed
                + "\nMemory Size: " + memorySize
                + "\nGPU Model: " + gpuModel
                + "\nStorage Size" + hardDriveSize 
                + "\nPower State: " + powerState 
                + "\nProgram Running: " + runningProgram 
                + "\nLaptop: " + laptop 
                ;
    }

}

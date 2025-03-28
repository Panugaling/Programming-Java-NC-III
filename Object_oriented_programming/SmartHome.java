/**
 * This Java program implements a Smart Home Device System using an abstract class.
 * It models different smart home devices and enforces a common structure using inheritance.
 * - SmartDevice (Abstract Class): Defines common properties and behaviors for smart devices.
 *   - Fields: deviceName
 *   - Abstract Methods: turnOn(), turnOff()
 *   - Concrete Method: showStatus()
 * 
 * - SmartLight: Extends SmartDevice and implements turnOn() and turnOff() with light-specific messages.
 * - SmartSpeaker: Extends SmartDevice and implements turnOn() and turnOff() with speaker-specific messages.
 * - SmartThermostat (Bonus): Extends SmartDevice and implements turnOn() and turnOff() with thermostat-specific messages.
 */

package Object_oriented_programming;

abstract class SmartDevice {
    protected String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    public void showStatus() {
        System.out.println("Device: " + deviceName);
    }
}

class SmartLight extends SmartDevice {
    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Light is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is now OFF");
    }
}

class SmartSpeaker extends SmartDevice {
    public SmartSpeaker(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Speaker is now playing music");
    }

    @Override
    public void turnOff() {
        System.out.println("Speaker is now OFF");
    }
}

class SmartThermostat extends SmartDevice {
    public SmartThermostat(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat is now set to 22°C");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is turned off");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartLight light = new SmartLight("Smart Light");
        SmartSpeaker speaker = new SmartSpeaker("Smart Speaker");
        SmartThermostat thermostat = new SmartThermostat("Smart Thermostat");

        System.out.println("\nSmart Light:");
        light.turnOn();
        light.showStatus();
        light.turnOff();

        System.out.println("\nSmart Speaker:");
        speaker.turnOn();
        speaker.showStatus();
        speaker.turnOff();

        System.out.println("\nSmart Thermostat:");
        thermostat.turnOn();
        thermostat.showStatus();
        thermostat.turnOff();
    }
}

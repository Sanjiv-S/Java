SmartDevice (Abstract Class)
A base class for all smart devices.
Has a name and a method called performFunction() that each device must implement.

Light
Inherits from SmartDevice.
Has a brightness level (like 70%).
When controlled, it shows the device name and current brightness.

Thermostat
Inherits from SmartDevice.
Has a temperature setting (like 22.5°C).
it shows the device name and current temperature.

Room
Represents a room in the house (like "Living Room" or "Bedroom").
Each room has 2 smart devices (a light and a thermostat).
Show its devices

House
Represents the whole house.
Has two rooms.
Show all devices in the house

Main
Creates:
A Living Room with a Light and Thermostat
A Bedroom with a Light and Thermostat

Then:
Shows all devices
display their info
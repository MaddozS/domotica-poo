public class Main{
	public static void main(String[] args){

		Room room1 = new Room("Pedro's Room");
		Room room2 = new Room("Axel's Room");
		Area area1 = new Area("Couple Rooms");
		Device d1 = new AC("AC Axel", "LG", "fef3f");
		Device d2 = new AC("AC Pedro", "Samsung", "fefdddww3f");
		Device t1 = new TV("TV Axel", "Panasonic", "d3d3f");
		Device s1 = new Speaker("Speaker Pedro", "Bose", "d3d3sf");


		DeviceAdmin admin_device = new DeviceAdmin();
		HouseAdmin admin_house = new HouseAdmin("Team House");
		
		admin_house.addArea(area1);
		admin_house.addRoom(room1, area1);
		admin_house.addRoom(room2, area1);

		admin_device.addDevice(d1, room1);
		admin_device.addDevice(t1, room1);
		admin_device.addDevice(d2, room2);
		admin_device.addDevice(s1, room2);


		// Print all devices with its information
		admin_device.printDevices();

		// Print how many devices are on
		int aux1 = admin_device.devicesOn();
		System.out.println("Devices on: " + aux1);
		int aux2 = admin_device.devicesOff();
		System.out.println("Devices off: " + aux2);

		//Turn on/off all devices by room
		admin_device.turnOnAllDevicesByRoom(room1);
		System.out.println("Devices on by room: ");
		admin_device.printDevices();
		System.out.println("Devices off by room: ");
		admin_device.turnOffAllDevicesByRoom(room1);
		admin_device.printDevices();

		// Gell the count off each type of device
		admin_device.printTotalDevicesByType();
	}
}
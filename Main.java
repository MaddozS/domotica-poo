public class Main{
	public static void main(String[] args){

		House house1 = new House("TeamHouse");
		Room room1 = new Room("PedroRoom");
		Room room2 = new Room("AxelRoom");
		Area area1 = new Area("LivingRoom");
		AC d1 = new AC("LG", "fef3f");
		AC d2 = new AC("Samsung", "fefdddww3f");
		TV t1 = new TV("Panasonic", "d3d3f");
		DeviceAdmin admin1 = new DeviceAdmin();

		room1.addDevice(d1);
		room1.addDevice(d2);
		room1.addDevice(t1);

		area1.addRoom(room1);
		area1.addRoom(room2);

		house1.addArea(area1);

		System.out.println("ROOM " + room1.getName() + ":" + room1.getId() + room2.getName() + " " + room2.getId());
		System.out.println(room1.getDeviceList());

		System.out.println("AREA " + area1.getName() + ": " + area1.getId() + ": " + area1.getRoomList());

		System.out.println("HOUSE " + house1.getName() + ": " + house1.getId() + ":" + house1.getAreaList());

		room1.removeDevice(d1);
		area1.removeRoom(room1);
		house1.removeArea(area1);
		System.out.println(room1.getName() + ":" + room1.getId() + room2.getName() + " " + room2.getId());
		System.out.println(room1.getDeviceList());
		System.out.println(area1.getRoomList());
		System.out.println(house1.getAreaList());

		admin1.addDevice(d1);
		admin1.addDevice(d2);

		admin1.showAllDevices();

	}
}
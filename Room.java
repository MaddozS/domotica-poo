public class Room{

	private String roomName;
	private static int roomId;
	private int id;

	public Room(String name){
		roomId++;
		this.roomName = name;
		id = roomId;
	}
	
    public void setName(String roomName){
    	this.roomName=roomName;
    }

	public int getId(){
		return this.id;
	}

	public String getName(){
		return this.roomName;
	}
	
	public String getInfo(){
        return "ID:" + id +
            ";Name:" + roomName;
    }
}

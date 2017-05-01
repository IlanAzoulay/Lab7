package Lab7Package;

public class SmartTV extends Product implements Networked{
	int channel;
	public boolean isConnected()
	{
		if(channel>0) return true;
		return false;
	}
	public double maxSpeed()
	{
		return 100;
	}
	//as
	public String getName()
	{
		return this.getClass().getName();
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
}

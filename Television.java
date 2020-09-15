/*
 * The purpose of this class is to model a television
 * Jonathan Yang 9/15/2020
 * Lab 4
 */


/**
 * @author yangj
 *
 */
public class Television {
	final String MANUFACTURER;//gets the manufacturer name
	final int SCREEN_SIZE;//get the size of the screen
	boolean powerOn;//finds out if the power is on
	int channel;//the channel number
	int volume;//the loudness of the volume
	
	/**
	 * Constructor for the television.
	 * @param brand
	 * @param screenSize
	 */
	public Television(String brand, int screenSize)
	{
		MANUFACTURER = brand;
		SCREEN_SIZE = screenSize;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	
	/**
	 * Turns the power on or off
	 */
	public void power()
	{
		powerOn = !powerOn;
	}
	
	/**
	 * Accessor gets the channel
	 * @return channel
	 */
	public int getChannel() {
		return channel;
	}

	/**
	 * Mutator: sets the channel
	 * @param channel
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	/**
	 * Gets the volume of the TV
	 * @return volume
	 */
	public int getVolume() {
		return volume;
	}
	/**
	 * Mutator
	 * increases the volume by 1
	 */
	public void increaseVolume()
	{
		volume++;
	}
	/**
	 * Mutator
	 * decreases volume by 1
	 */
	public void decreaseVolume()
	{
		volume--;
	}

	/**
	 * Accessor
	 * @return MANUFACTURER
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}

	/**
	 * Accessor
	 * @return SCREEN_SIZE
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
}

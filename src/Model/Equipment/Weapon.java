package Model.Equipment;

/**
 * This class will serve as a superclass for weapons within the simulation
 * @author Brunon Sztuba
 */
public class Weapon {

    /**
     * This is the weight of the weapon
     */
    private int weight;

    /**
     * This is the visual detectability of the weapon
     */
    private int stealth;

    /**
     * This is the auditory signature of the weapon
     */
    private int noise;

    /**
     * This is a coefficient that is used to represent a weapon's reliability
     */
    private int reliability;

    /**
     * This is the maximum effective range of the weapon
     */
    private int range;

    /**
     * This is the cyclic ROF of the weapon
     */
    private int maxROF;

    /**
     * This is the maximum sustained rate of fire for the weapon
     */
    private int realROF;

    /**
     * This is the constructor for a Weapon
     */
    public Weapon(int weight, int reliability, int range, int maxROF, int realROF, int stealth, int noise){
        this.weight=weight;
        this.stealth=stealth;
        this.noise=noise;
        this.reliability=reliability;
        this.range=range;
        this.maxROF=maxROF;
        this.realROF=realROF;
    }

    /**
     * This is a getter for weight
     */
    public int getWeight(){
        return weight;
    }

    /**
     * This is a getter for stealth
     */
    public int getStealth(){
        return stealth;
    }

    /**
     * This is a getter for noise
     */
    public int getNoise(){
        return noise;
    }

    /**
     * This is a getter for reliability
     */
    public int getReliability(){
        return reliability;
    }

    /**
     * This is a getter for the weapon's maximum effective range
     */
    public int getRange(){
        return range;
    }

    /**
     * This is a getter for the weapon's maximum rate of fire
     */
    public int getMaxROF(){
        return maxROF;
    }

    /**
     * This is a getter for the weapon's maximum sustained ROF
     */
    public int getRealROF(){
        return realROF;
    }

    /**
     * This is a setter for weight
     */
    public void setWeight(int weight){
        this.weight=weight;
    }

    /**
     * This is a setter for reliability
     */
    public void setReliability(int reliability){
        this.reliability=reliability;
    }

    /**
     * This is a setter for range
     */
    public void setRange(int range){
        this.range=range;
    }

    /**
     * This is a setter for maxROF
     */
    public void setMaxROF(int maxROF){
        this.maxROF=maxROF;
    }

    /**
     * This is a setter for realROF
     */
    public void setRealROF(int realROF){
        this.realROF=realROF;
    }
}

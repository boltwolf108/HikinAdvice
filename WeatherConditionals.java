
public class WeatherConditionals
{
    public static boolean challenge = false;
     public static String getHikingAdvice(int temp, int windch, int humid, String describe)
    {
      if (describe.contains("shocky")) {challenge = true;} 
      if (describe.contains("thunderstorm")) {challenge = true;}
      if (describe.contains("BIGBOOMBOOM")) {challenge = true;}
      if (temp >= 35 && !challenge){return "have fun outside";}
      else if (temp < 28 || temp - windch <= 0 || humid >= 60 || challenge){return "GO, EXERCISE YOUR TRUE POWER!";}
      else return "Chill out bro";
    }
}

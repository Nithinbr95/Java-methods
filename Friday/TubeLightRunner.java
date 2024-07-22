public class TubeLightRunner
{
public static void main(String[] args){
TubeLight tubeLight = new TubeLight();
TubeLight tubeLight1 = new TubeLight(75);
TubeLight tubeLight2= new TubeLight(75,15.5);
TubeLight tubeLight3 = new TubeLight(75,15.5,"philips");
TubeLight tubeLight4 = new TubeLight(75,15.5,"philips",false);
TubeLight tubeLight5 = new TubeLight(75,15.5,"philips",false,'A');
TubeLight tubeLight6 = new TubeLight(75,15.5,"philips",false,'A',2);
}
}
public class DrumKitTestDrive {
    public static void main(String[] args){

        DrumKit bateria = new DrumKit();

        if ( bateria.snare == true ){
            bateria.playSnare();
        }

        bateria.snare = false;

        bateria.playTopHat();

    }
}

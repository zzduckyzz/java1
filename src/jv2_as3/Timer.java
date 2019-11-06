package jv2_as3;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Timer {
    public TextField timeInput = new TextField();
    public Text timeout = new Text();
    public Button btn = new Button();
    public static int s_min;

    public void run() {
//        int min;
        try{
            s_min = Integer.parseInt(timeInput.getText());
        } catch (Exception e) {
            s_min = 10;
        }
        btn.setDisable(true);
        Runnable r = ()->{
            int time = s_min*60;
            String strmin = "";
            String strsec = "";
            for (int i=time; i>=0; i--) {
                try{
                    int min = (int)Math.floor(i/60);
                    int sec = i - min*60;
                    if (min < 10) {
                        strmin = String.format("0%d", min);
                    }else {
                        strmin = String.format("%d", min);
                    }
                    if (sec < 10) {
                        strsec = String.format("0%d", sec);
                    }else {
                        strsec = String.format("%d", sec);
                    }
                    timeout.setText(strmin+":"+strsec);
                    Thread.sleep(1000);
                }catch (Exception e) {

                }
            }
            Platform.exit();
        };
        Thread t = new Thread(r);
        t.start();
    }
}

import java.applet.AudioClip;
import java.io.*;
import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;

public class PlayMusic {
    public static void playMusic(){//背景音乐播放
        try {
            URL cb;
            File f = new File("D:\\Janji - Horizon.wav"); // 引号里面的是音乐文件所在的路径
            cb = f.toURL();
            AudioClip aau;
            aau = Applet.newAudioClip(cb);

            aau.play();
            aau.loop();//循环播放
            // 循环播放 aau.play()
            //单曲 aau.stop()停止播放

        } catch (MalformedURLException e) {

            e.printStackTrace();
        }
    }
}

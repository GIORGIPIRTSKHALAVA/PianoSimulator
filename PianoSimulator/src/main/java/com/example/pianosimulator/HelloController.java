package com.example.pianosimulator;

import javafx.fxml.FXML;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class HelloController {

    private void playSound(String soundFileName) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                    getClass().getResource("/com/example/pianosimulator/sounds/" + soundFileName));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void playC() {
        playSound("C.wav");
    }

    @FXML
    private void playD() {
        playSound("D.wav");
    }

    @FXML
    private void playE() {
        playSound("E.wav");
    }

    @FXML
    private void playF() {
        playSound("F.wav");
    }

    @FXML
    private void playG() {
        playSound("G.wav");
    }

    @FXML
    private void playA() {
        playSound("A.wav");
    }

    @FXML
    private void playB() {
        playSound("B.wav");
    }

    @FXML
    private void playCs() {
        playSound("Cs.wav");
    }

    @FXML
    private void playDs() {
        playSound("Ds.wav");
    }

    @FXML
    private void playFs() {
        playSound("Fs.wav");
    }

    @FXML
    private void playGs() {
        playSound("Gs.wav");
    }

    @FXML
    private void playAs() {
        playSound("As.wav");
    }
}

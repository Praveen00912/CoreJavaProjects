package com.praveen.projects;

public class MultipleInterfaceTest {
    public static void main(String[] args) {

        AudioPlayer player = new AudioPlayer("Song1", 300);
        VoiceRecorder recorder = new VoiceRecorder("VoiceNote");
        MediaController controller = new MediaController();
        System.out.println("---- AudioPlayer Test ----");
        controller.controlPlayback(player);
        System.out.println("\n---- VoiceRecorder Playback Test ----");
        controller.controlPlayback(recorder);
        System.out.println("\n---- VoiceRecorder Recording Test ----");
        controller.controlRecording(recorder, 10);
        System.out.println("\n---- Polymorphism Test ----");
        Playable ref = new VoiceRecorder("VoiceNote2");
        ref.play();
        ref.stop();
    }
}
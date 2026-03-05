package com.praveen.projects;

public class MediaController {

    public void controlPlayback(Playable device) {
        device.play();
        device.pause();
        device.stop();
        System.out.println("Duration: " + device.getDuration());
    }

    public void controlRecording(Recordable device, int seconds) {
        device.startRecording();
        if (device instanceof VoiceRecorder) {
            VoiceRecorder recorder = (VoiceRecorder) device;
            recorder.addRecordingTime(seconds);
        }
        device.stopRecording();
        device.saveRecording("MyRecording.mp3");
    }
}
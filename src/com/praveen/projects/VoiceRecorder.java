package com.praveen.projects;

public class VoiceRecorder implements Playable, Recordable {

    String recordingName;
    int duration;
    String playStatus;
    boolean recording;
    int recordedDuration;

    public VoiceRecorder(String recordingName) {
        this.recordingName = recordingName;
        this.duration = 0;
        this.playStatus = "STOPPED";
        this.recording = false;
        this.recordedDuration = 0;
    }

    @Override
    public void play() {
        playStatus = "PLAYING";
        System.out.println(recordingName + " is playing.");
    }

    @Override
    public void pause() {
        playStatus = "PAUSED";
        System.out.println(recordingName + " is paused.");
    }

    @Override
    public void stop() {
        playStatus = "STOPPED";
        System.out.println(recordingName + " is stopped.");
    }

    @Override
    public int getDuration() {
        return recordedDuration;
    }

    @Override
    public void startRecording() {
        recording = true;
        System.out.println("Recording started.");
    }

    @Override
    public void stopRecording() {
        recording = false;
        System.out.println("Recording stopped.");
    }

    @Override
    public void saveRecording(String filename) {
        recordingName = filename;
        System.out.println("Recording saved as " + filename);
    }

    @Override
    public boolean isRecording() {
        return recording;
    }

    public void addRecordingTime(int seconds) {
        if (recording) {
            recordedDuration += seconds;
            System.out.println(seconds + " seconds recorded.");
        }
    }
}
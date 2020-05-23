package com.zaliczenie.sesjaJava;

public enum Ghosts {
    Prequelle(4.21, "Rats"),
    Meliora(6.02, "Cirice"),
    Infestissumam(4.52, "Year Zero");

    final private double timeOfDuration;
    final public String track;
    final public static String informacja;

    static {
        informacja = "CD list: ";
    }

    public double getTimeOfDuration() {
        return timeOfDuration;
    }

    public String songInfo() {
        return super.toString() + " duration of the song " + timeOfDuration + " seconds.";
    }

    Ghosts(double timeOfDuration, String track) {
        this.timeOfDuration = timeOfDuration;
        this.track = track;
    }

    public void playPlayList(){
        System.out.println("Now is playing " + track + " from " + toString()+ " will continues " + timeOfDuration + " seconds.");
    }
}



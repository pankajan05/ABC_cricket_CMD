package ABC_Manager;

import java.io.Serializable;

public class ScoreCard implements Serializable {
    private boolean Blank = true;
    private String venue;
    private int runs;
    private int Boundaries;
    private float Strike_rate;
    private String incident;

    public ScoreCard() {
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getBoundaries() {
        return Boundaries;
    }

    public void setBoundaries(int boundaries) {
        Boundaries = boundaries;
    }

    public float getStrike_rate() {
        return Strike_rate;
    }

    public void setStrike_rate(float strike_rate) {
        Strike_rate = strike_rate;
    }

    public String getIncident() {
        return incident;
    }

    public void setIncident(String incident) {
        this.incident = incident;
    }

    public boolean isBlank() {
        return Blank;
    }

    public void setBlank(boolean blank) {
        Blank = blank;
    }

    @Override
    public String toString() {
        return "ScoreCard{" +
                "venue='" + venue + '\'' +
                ", runs=" + runs +
                ", Boundaries=" + Boundaries +
                ", Strike_rate=" + Strike_rate +
                ", incident='" + incident + '\'' +
                "}\n";
    }
}

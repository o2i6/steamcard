import java.io.Serializable;

public class SteamAppPropertyDiffCollection implements Serializable {
    public SteamAppPropertyDiff[] diffs;
    public long updateTime;

    public SteamAppPropertyDiffCollection(SteamAppPropertyDiff[] diffs, long updateTime) {
        this.diffs = diffs;
        this.updateTime = updateTime;
    }

    public SteamAppPropertyDiffCollection(long updateTime) {
        this.updateTime = updateTime;
    }

    public SteamAppPropertyDiffCollection() {
    }

    public void setDiffs(SteamAppPropertyDiff[] diffs) {
        this.diffs = diffs;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
}

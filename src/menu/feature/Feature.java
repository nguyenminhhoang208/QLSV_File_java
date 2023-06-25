package menu.feature;

abstract public class Feature {
    private int key;
    private String featureName;

    public  Feature(int key, String featureName) {
        this.featureName = featureName;
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    abstract public void run();
}

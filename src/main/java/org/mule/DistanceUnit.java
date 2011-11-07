package org.mule;

public enum DistanceUnit {

    /**
     * Kilometers
     */
    KM("metric"),
    /**
     * Miles
     */
    MI("imperial");

    private String value;

    DistanceUnit(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

package infobip.api.model.omni.send;

import java.util.concurrent.TimeUnit;

/**
 * This is a generated class and is not intended for modification!
 */
public class ParsecoData {
    private String text;
    private Long validityPeriod;
    private TimeUnit validityPeriodTimeUnit;

    public ParsecoData() {
    }

    public String getText() {
        return this.text;
    }

    public ParsecoData setText(String text) {
        this.text = text;
        return this;
    }

    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

    public ParsecoData setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    public TimeUnit getValidityPeriodTimeUnit() {
        return this.validityPeriodTimeUnit;
    }

    public ParsecoData setValidityPeriodTimeUnit(TimeUnit validityPeriodTimeUnit) {
        this.validityPeriodTimeUnit = validityPeriodTimeUnit;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        ParsecoData o = (ParsecoData)obj;
        if (this.text == null) {
            if (o.text != null){
                return false;
            }
        } else if (!this.text.equals(o.text)) {
            return false;
        }
        if (this.validityPeriod == null) {
            if (o.validityPeriod != null){
                return false;
            }
        } else if (!this.validityPeriod.equals(o.validityPeriod)) {
            return false;
        }
        if (this.validityPeriodTimeUnit == null) {
            if (o.validityPeriodTimeUnit != null){
                return false;
            }
        } else if (!this.validityPeriodTimeUnit.equals(o.validityPeriodTimeUnit)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "ParsecoData{" +
            "text='" + text + "'" +
            ", validityPeriod='" + validityPeriod + "'" +
            ", validityPeriodTimeUnit='" + validityPeriodTimeUnit + "'" +
            '}';
    }
}
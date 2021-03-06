package infobip.api.model.nc;

/**
 * This is a generated class and is not intended for modification!
 */
public class Network {
    private String networkName;
    private String networkPrefix;
    private String countryName;
    private String countryPrefix;

    public Network() {
    }

    public String getNetworkName() {
        return this.networkName;
    }

    public Network setNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }

    public String getNetworkPrefix() {
        return this.networkPrefix;
    }

    public Network setNetworkPrefix(String networkPrefix) {
        this.networkPrefix = networkPrefix;
        return this;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public Network setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public String getCountryPrefix() {
        return this.countryPrefix;
    }

    public Network setCountryPrefix(String countryPrefix) {
        this.countryPrefix = countryPrefix;
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

        Network o = (Network)obj;
        if (this.networkName == null) {
            if (o.networkName != null){
                return false;
            }
        } else if (!this.networkName.equals(o.networkName)) {
            return false;
        }
        if (this.networkPrefix == null) {
            if (o.networkPrefix != null){
                return false;
            }
        } else if (!this.networkPrefix.equals(o.networkPrefix)) {
            return false;
        }
        if (this.countryName == null) {
            if (o.countryName != null){
                return false;
            }
        } else if (!this.countryName.equals(o.countryName)) {
            return false;
        }
        if (this.countryPrefix == null) {
            if (o.countryPrefix != null){
                return false;
            }
        } else if (!this.countryPrefix.equals(o.countryPrefix)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Network{" +
            "networkName='" + networkName + "'" +
            ", networkPrefix='" + networkPrefix + "'" +
            ", countryName='" + countryName + "'" +
            ", countryPrefix='" + countryPrefix + "'" +
            '}';
    }
}
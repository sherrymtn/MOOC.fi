public class Archive {
    private String identifier;
    private String name;

    public Archive(String identify, String name) {
        this.identifier = identify;
        this.name = name;
    }

    public String getIdentifier(String identifier) {
        return identifier;
    }

    public String getName(String name) {
        return name;
    }

    public boolean equals(Object c) {
        if (this == c) {
            return true;
        }

        if (!(c instanceof Archive)) {
            return false;
        }

        Archive cArchive = (Archive) c;

        return (this.identifier.equals(cArchive.identifier));
    }

    @Override
    public String toString() {
        return  this.identifier + ": " + this.name;
    }
    
}

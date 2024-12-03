import java.util.Set;

public class Character {
    private int id;
    private String name;
    private String wikiUrl;
    private String race;
    private String birth;
    private String gender;
    private String hair;
    private String height;
    private Realm realm; // Relación con Realm
    private String spouse; // En lugar de Marriage
    private Set<Dialog> dialogs; // Relación con Dialog

    public Character(int id, String name, String wikiUrl, String race, String birth, String gender, String hair, String height, Realm realm, String spouse, Set<Dialog> dialogs) {
        this.id = id;
        this.name = name;
        this.wikiUrl = wikiUrl;
        this.race = race;
        this.birth = birth;
        this.gender = gender;
        this.hair = hair;
        this.height = height;
        this.realm = realm;
        this.spouse = spouse;
        this.dialogs = dialogs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWikiUrl() {
        return wikiUrl;
    }

    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Realm getRealm() {
        return realm;
    }

    public void setRealm(Realm realm) {
        this.realm = realm;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public Set<Dialog> getDialogs() {
        return dialogs;
    }

    public void setDialogs(Set<Dialog> dialogs) {
        this.dialogs = dialogs;
    }
}

package katarem.genshin.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Character {

	@Id
    private String id;
    private String name;
    private String title;
    private String element;
    private String birthday;
    private String constellation;
    private String weapon;
    private String splashArt;
    private String icon;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Character() {
    }

    /**
     * 
     * @param birthday
     * @param weapon
     * @param splashArt
     * @param constellation
     * @param name
     * @param icon
     * @param id
     * @param title
     * @param element
     */
    public Character(String id, String name, String title, String element, String birthday, String constellation, String weapon, String splashArt, String icon) {
        super();
        this.id = id;
        this.name = name;
        this.title = title;
        this.element = element;
        this.birthday = birthday;
        this.constellation = constellation;
        this.weapon = weapon;
        this.splashArt = splashArt;
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getSplashArt() {
        return splashArt;
    }

    public void setSplashArt(String splashArt) {
        this.splashArt = splashArt;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("element");
        sb.append('=');
        sb.append(((this.element == null)?"<null>":this.element));
        sb.append(',');
        sb.append("birthday");
        sb.append('=');
        sb.append(((this.birthday == null)?"<null>":this.birthday));
        sb.append(',');
        sb.append("constellation");
        sb.append('=');
        sb.append(((this.constellation == null)?"<null>":this.constellation));
        sb.append(',');
        sb.append("weapon");
        sb.append('=');
        sb.append(((this.weapon == null)?"<null>":this.weapon));
        sb.append(',');
        sb.append("splashArt");
        sb.append('=');
        sb.append(((this.splashArt == null)?"<null>":this.splashArt));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.birthday == null)? 0 :this.birthday.hashCode()));
        result = ((result* 31)+((this.weapon == null)? 0 :this.weapon.hashCode()));
        result = ((result* 31)+((this.splashArt == null)? 0 :this.splashArt.hashCode()));
        result = ((result* 31)+((this.constellation == null)? 0 :this.constellation.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.icon == null)? 0 :this.icon.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.element == null)? 0 :this.element.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Character) == false) {
            return false;
        }
        Character rhs = ((Character) other);
        return ((((((((((this.birthday == rhs.birthday)||((this.birthday!= null)&&this.birthday.equals(rhs.birthday)))&&((this.weapon == rhs.weapon)||((this.weapon!= null)&&this.weapon.equals(rhs.weapon))))&&((this.splashArt == rhs.splashArt)||((this.splashArt!= null)&&this.splashArt.equals(rhs.splashArt))))&&((this.constellation == rhs.constellation)||((this.constellation!= null)&&this.constellation.equals(rhs.constellation))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.icon == rhs.icon)||((this.icon!= null)&&this.icon.equals(rhs.icon))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.element == rhs.element)||((this.element!= null)&&this.element.equals(rhs.element))));
    }

}

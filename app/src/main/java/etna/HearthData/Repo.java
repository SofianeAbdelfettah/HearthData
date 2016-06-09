package etna.HearthData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by MSI on 08/06/2016.
 */
public class Repo {
    @SerializedName("cardId")
    @Expose
    private String cardId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cardSet")
    @Expose
    private String cardSet;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("health")
    @Expose
    private Integer health;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("imgGold")
    @Expose
    private String imgGold;
    @SerializedName("locale")
    @Expose
    private String locale;

    /**
     *
     * @return
     * The cardId
     */
    public String getCardId() {
        return cardId;
    }

    /**
     *
     * @param cardId
     * The cardId
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The cardSet
     */
    public String getCardSet() {
        return cardSet;
    }

    /**
     *
     * @param cardSet
     * The cardSet
     */
    public void setCardSet(String cardSet) {
        this.cardSet = cardSet;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The health
     */
    public Integer getHealth() {
        return health;
    }

    /**
     *
     * @param health
     * The health
     */
    public void setHealth(Integer health) {
        this.health = health;
    }

    /**
     *
     * @return
     * The img
     */
    public String getImg() {
        return img;
    }

    /**
     *
     * @param img
     * The img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     *
     * @return
     * The imgGold
     */
    public String getImgGold() {
        return imgGold;
    }

    /**
     *
     * @param imgGold
     * The imgGold
     */
    public void setImgGold(String imgGold) {
        this.imgGold = imgGold;
    }

    /**
     *
     * @return
     * The locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     *
     * @param locale
     * The locale
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }
}

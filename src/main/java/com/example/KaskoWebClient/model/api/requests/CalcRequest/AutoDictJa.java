package com.example.KaskoWebClient.model.api.requests.CalcRequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AutoDictJa implements Serializable, Comparable<AutoDictJa> {

    private static final long serialVersionUID = 1L;

    @JsonProperty("marka_id")
    private long markId;

    @JsonProperty("marka_name")
    private String markName;

    @JsonProperty("transportTypeId")
    private long transportTypeId;

    @JsonDeserialize(using = ItemDeserializerModels.class)
    @JsonProperty("models")
    private List<ModelJa> models;

    @JsonProperty("startDate")
    private Date startDate;

    @JsonProperty("endDate")
    private Date endDate;

    @JsonProperty("active")
    private boolean active;

    public AutoDictJa() {
    }

    public long getMarkId() {
        return markId;
    }

    public void setMarkId(long markId) {
        this.markId = markId;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public long getTransportTypeId() {
        return transportTypeId;
    }

    public void setTransportTypeId(long transportTypeId) {
        this.transportTypeId = transportTypeId;
    }

//    public List<ModelJa> getModels() {
//        return models;
//    }
//
//    public void setModels(List<ModelJa> models) {
//        this.models = models;
//    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AutoDictJa)) return false;

        AutoDictJa that = (AutoDictJa) o;

        if (markId != that.markId) return false;
        return !(markName != null ? !markName.equalsIgnoreCase(that.markName) : that.markName != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (markId ^ (markId >>> 32));
        result = 31 * result + (markName != null ? markName.toLowerCase().hashCode() : 0);
        return result;
    }

    /**
     * Компароатор для сравнения и сортировки в лексикографическом порядке
     * @param объект для сравнения
     * @return результат сравнения
     */
    @Override
    public int compareTo(AutoDictJa compared) {
        return this.getMarkName().compareTo(compared.getMarkName());
    }

    @Override
    public String toString() {
        return "AutoDictJa{" +
                "markId=" + markId +
                ", markName='" + markName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", active=" + active +
                '}';
    }

    /**
     * Активна ли данная марка на заданную дату включительно
     * @param date
     */
    public boolean isActiveByDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        date = calendar.getTime();

        boolean activeFlag = this.isActive();
        boolean activePeriod = this.getStartDate().compareTo(date) <= 0 && (this.getEndDate() == null || date.compareTo(this.getEndDate()) <= 0);
        return activeFlag && activePeriod;
    }

    public List<ModelJa> getModels() {
        return models;
    }

    public void setModels(List<ModelJa> models) {
        this.models = models;
    }
}

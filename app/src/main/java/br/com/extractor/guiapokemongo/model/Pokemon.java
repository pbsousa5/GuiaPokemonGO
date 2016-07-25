package br.com.extractor.guiapokemongo.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by muryllo.santos on 25/07/2016.
 */
public class Pokemon extends RealmObject {

    @PrimaryKey
    private Integer number;
    private String name;
    private Double weight;
    private Double height;
    private Integer numberEvolution;

    // STATS
    private Integer baseAttack;
    private Integer baseDefense;
    private Integer baseStamina;
    private Integer classe;
    private Integer primaryType;
    private Integer secondaryType;
    private Double maxCp;
    private Double captureRate;
    private Double fleeRate;

    // GENERAL INFO
    private Integer cadyToEvolve;
    private Integer eggDistance;

    private RealmList<Move> primaryMoves;
    private RealmList<Move> secondaryMoves;

    public Pokemon() {}

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getNumberEvolution() {
        return numberEvolution;
    }

    public void setNumberEvolution(Integer numberEvolution) {
        this.numberEvolution = numberEvolution;
    }

    public Integer getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(Integer baseAttack) {
        this.baseAttack = baseAttack;
    }

    public Integer getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense(Integer baseDefense) {
        this.baseDefense = baseDefense;
    }

    public Integer getBaseStamina() {
        return baseStamina;
    }

    public void setBaseStamina(Integer baseStamina) {
        this.baseStamina = baseStamina;
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) {
        this.classe = classe;
    }

    public Integer getPrimaryType() {
        return primaryType;
    }

    public void setPrimaryType(Integer primaryType) {
        this.primaryType = primaryType;
    }

    public Integer getSecondaryType() {
        return secondaryType;
    }

    public void setSecondaryType(Integer secondaryType) {
        this.secondaryType = secondaryType;
    }

    public Double getMaxCp() {
        return maxCp;
    }

    public void setMaxCp(Double maxCp) {
        this.maxCp = maxCp;
    }

    public Double getCaptureRate() {
        return captureRate;
    }

    public void setCaptureRate(Double captureRate) {
        this.captureRate = captureRate;
    }

    public Double getFleeRate() {
        return fleeRate;
    }

    public void setFleeRate(Double fleeRate) {
        this.fleeRate = fleeRate;
    }

    public Integer getCadyToEvolve() {
        return cadyToEvolve;
    }

    public void setCadyToEvolve(Integer cadyToEvolve) {
        this.cadyToEvolve = cadyToEvolve;
    }

    public Integer getEggDistance() {
        return eggDistance;
    }

    public void setEggDistance(Integer eggDistance) {
        this.eggDistance = eggDistance;
    }

    public RealmList<Move> getPrimaryMoves() {
        return primaryMoves;
    }

    public void setPrimaryMoves(RealmList<Move> primaryMoves) {
        this.primaryMoves = primaryMoves;
    }

    public RealmList<Move> getSecondaryMoves() {
        return secondaryMoves;
    }

    public void setSecondaryMoves(RealmList<Move> secondaryMoves) {
        this.secondaryMoves = secondaryMoves;
    }
}

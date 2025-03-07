/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAnyElement
 *  jakarta.xml.bind.annotation.XmlAttribute
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.MasterData;


import jakarta.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TUncertainty", propOrder={"lognormal", "normal", "triangular", "uniform", "beta", "gamma", "binomial", "undefined", "pedigreeMatrix", "comment", "any"})
public class TUncertainty {
    protected Lognormal lognormal;
    protected Normal normal;
    protected Triangular triangular;
    protected Uniform uniform;
    protected Beta beta;
    protected Gamma gamma;
    protected Binomial binomial;
    protected Undefined undefined;
    protected PedigreeMatrix pedigreeMatrix;
    protected List<TString32000> comment;
    @XmlAnyElement(lax=true)
    protected List<Object> any;

    public Lognormal getLognormal() {
        return this.lognormal;
    }

    public void setLognormal(Lognormal value) {
        this.lognormal = value;
    }

    public Normal getNormal() {
        return this.normal;
    }

    public void setNormal(Normal value) {
        this.normal = value;
    }

    public Triangular getTriangular() {
        return this.triangular;
    }

    public void setTriangular(Triangular value) {
        this.triangular = value;
    }

    public Uniform getUniform() {
        return this.uniform;
    }

    public void setUniform(Uniform value) {
        this.uniform = value;
    }

    public Beta getBeta() {
        return this.beta;
    }

    public void setBeta(Beta value) {
        this.beta = value;
    }

    public Gamma getGamma() {
        return this.gamma;
    }

    public void setGamma(Gamma value) {
        this.gamma = value;
    }

    public Binomial getBinomial() {
        return this.binomial;
    }

    public void setBinomial(Binomial value) {
        this.binomial = value;
    }

    public Undefined getUndefined() {
        return this.undefined;
    }

    public void setUndefined(Undefined value) {
        this.undefined = value;
    }

    public PedigreeMatrix getPedigreeMatrix() {
        return this.pedigreeMatrix;
    }

    public void setPedigreeMatrix(PedigreeMatrix value) {
        this.pedigreeMatrix = value;
    }

    public List<TString32000> getComment() {
        if (this.comment == null) {
            this.comment = new ArrayList<TString32000>();
        }
        return this.comment;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }

    @XmlAccessorType(value=XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"any"})
    public static class Lognormal {
        @XmlAnyElement(lax=true)
        protected List<Object> any;
        @XmlAttribute(name="meanValue", required=true)
        protected double meanValue;
        @XmlAttribute(name="mu", required=true)
        protected double mu;
        @XmlAttribute(name="variance")
        protected Double variance;
        @XmlAttribute(name="varianceWithPedigreeUncertainty", required=true)
        protected double varianceWithPedigreeUncertainty;

        public List<Object> getAny() {
            if (this.any == null) {
                this.any = new ArrayList<Object>();
            }
            return this.any;
        }

        public double getMeanValue() {
            return this.meanValue;
        }

        public void setMeanValue(double value) {
            this.meanValue = value;
        }

        public double getMu() {
            return this.mu;
        }

        public void setMu(double value) {
            this.mu = value;
        }

        public Double getVariance() {
            return this.variance;
        }

        public void setVariance(Double value) {
            this.variance = value;
        }

        public double getVarianceWithPedigreeUncertainty() {
            return this.varianceWithPedigreeUncertainty;
        }

        public void setVarianceWithPedigreeUncertainty(double value) {
            this.varianceWithPedigreeUncertainty = value;
        }
    }

    @XmlAccessorType(value=XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"any"})
    public static class Normal {
        @XmlAnyElement(lax=true)
        protected List<Object> any;
        @XmlAttribute(name="meanValue", required=true)
        protected double meanValue;
        @XmlAttribute(name="variance")
        protected Double variance;
        @XmlAttribute(name="varianceWithPedigreeUncertainty", required=true)
        protected double varianceWithPedigreeUncertainty;

        public List<Object> getAny() {
            if (this.any == null) {
                this.any = new ArrayList<Object>();
            }
            return this.any;
        }

        public double getMeanValue() {
            return this.meanValue;
        }

        public void setMeanValue(double value) {
            this.meanValue = value;
        }

        public Double getVariance() {
            return this.variance;
        }

        public void setVariance(Double value) {
            this.variance = value;
        }

        public double getVarianceWithPedigreeUncertainty() {
            return this.varianceWithPedigreeUncertainty;
        }

        public void setVarianceWithPedigreeUncertainty(double value) {
            this.varianceWithPedigreeUncertainty = value;
        }
    }

    @XmlAccessorType(value=XmlAccessType.FIELD)
    @XmlType(name="")
    public static class Triangular {
        @XmlAttribute(name="minValue", required=true)
        protected double minValue;
        @XmlAttribute(name="mostLikelyValue", required=true)
        protected double mostLikelyValue;
        @XmlAttribute(name="maxValue", required=true)
        protected double maxValue;

        public double getMinValue() {
            return this.minValue;
        }

        public void setMinValue(double value) {
            this.minValue = value;
        }

        public double getMostLikelyValue() {
            return this.mostLikelyValue;
        }

        public void setMostLikelyValue(double value) {
            this.mostLikelyValue = value;
        }

        public double getMaxValue() {
            return this.maxValue;
        }

        public void setMaxValue(double value) {
            this.maxValue = value;
        }
    }

    @XmlAccessorType(value=XmlAccessType.FIELD)
    @XmlType(name="")
    public static class Uniform {
        @XmlAttribute(name="minValue", required=true)
        protected double minValue;
        @XmlAttribute(name="maxValue", required=true)
        protected double maxValue;

        public double getMinValue() {
            return this.minValue;
        }

        public void setMinValue(double value) {
            this.minValue = value;
        }

        public double getMaxValue() {
            return this.maxValue;
        }

        public void setMaxValue(double value) {
            this.maxValue = value;
        }
    }

    @XmlAccessorType(value=XmlAccessType.FIELD)
    @XmlType(name="")
    public static class Beta {
        @XmlAttribute(name="minValue", required=true)
        protected double minValue;
        @XmlAttribute(name="mostFrequentValue", required=true)
        protected double mostFrequentValue;
        @XmlAttribute(name="maxValue", required=true)
        protected double maxValue;

        public double getMinValue() {
            return this.minValue;
        }

        public void setMinValue(double value) {
            this.minValue = value;
        }

        public double getMostFrequentValue() {
            return this.mostFrequentValue;
        }

        public void setMostFrequentValue(double value) {
            this.mostFrequentValue = value;
        }

        public double getMaxValue() {
            return this.maxValue;
        }

        public void setMaxValue(double value) {
            this.maxValue = value;
        }
    }

    @XmlAccessorType(value=XmlAccessType.FIELD)
    @XmlType(name="")
    public static class Gamma {
        @XmlAttribute(name="shape", required=true)
        protected double shape;
        @XmlAttribute(name="scale", required=true)
        protected double scale;
        @XmlAttribute(name="minValue", required=true)
        protected double minValue;

        public double getShape() {
            return this.shape;
        }

        public void setShape(double value) {
            this.shape = value;
        }

        public double getScale() {
            return this.scale;
        }

        public void setScale(double value) {
            this.scale = value;
        }

        public double getMinValue() {
            return this.minValue;
        }

        public void setMinValue(double value) {
            this.minValue = value;
        }
    }

    @XmlAccessorType(value=XmlAccessType.FIELD)
    @XmlType(name="")
    public static class Binomial {
        @XmlAttribute(name="n", required=true)
        protected BigInteger n;
        @XmlAttribute(name="p", required=true)
        protected double p;

        public BigInteger getN() {
            return this.n;
        }

        public void setN(BigInteger value) {
            this.n = value;
        }

        public double getP() {
            return this.p;
        }

        public void setP(double value) {
            this.p = value;
        }
    }

    @XmlAccessorType(value=XmlAccessType.FIELD)
    @XmlType(name="")
    public static class Undefined {
        @XmlAttribute(name="minValue", required=true)
        protected double minValue;
        @XmlAttribute(name="maxValue", required=true)
        protected double maxValue;
        @XmlAttribute(name="standardDeviation95", required=true)
        protected double standardDeviation95;

        public double getMinValue() {
            return this.minValue;
        }

        public void setMinValue(double value) {
            this.minValue = value;
        }

        public double getMaxValue() {
            return this.maxValue;
        }

        public void setMaxValue(double value) {
            this.maxValue = value;
        }

        public double getStandardDeviation95() {
            return this.standardDeviation95;
        }

        public void setStandardDeviation95(double value) {
            this.standardDeviation95 = value;
        }
    }

    @XmlAccessorType(value=XmlAccessType.FIELD)
    @XmlType(name="")
    public static class PedigreeMatrix {
        @XmlAttribute(name="reliability", required=true)
        protected int reliability;
        @XmlAttribute(name="completeness", required=true)
        protected int completeness;
        @XmlAttribute(name="temporalCorrelation", required=true)
        protected int temporalCorrelation;
        @XmlAttribute(name="geographicalCorrelation", required=true)
        protected int geographicalCorrelation;
        @XmlAttribute(name="furtherTechnologyCorrelation", required=true)
        protected int furtherTechnologyCorrelation;

        public int getReliability() {
            return this.reliability;
        }

        public void setReliability(int value) {
            this.reliability = value;
        }

        public int getCompleteness() {
            return this.completeness;
        }

        public void setCompleteness(int value) {
            this.completeness = value;
        }

        public int getTemporalCorrelation() {
            return this.temporalCorrelation;
        }

        public void setTemporalCorrelation(int value) {
            this.temporalCorrelation = value;
        }

        public int getGeographicalCorrelation() {
            return this.geographicalCorrelation;
        }

        public void setGeographicalCorrelation(int value) {
            this.geographicalCorrelation = value;
        }

        public int getFurtherTechnologyCorrelation() {
            return this.furtherTechnologyCorrelation;
        }

        public void setFurtherTechnologyCorrelation(int value) {
            this.furtherTechnologyCorrelation = value;
        }
    }
}

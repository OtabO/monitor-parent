package bee.monitor.entity;

/**
 * Created by zhangsx on 15/8/18.
 * 统计对应关系,相应前缀后缀对应计算方式和单位
 */
public class CountKV {
    private String prefix;
    private String suffix;
    private String calculatorName;
    private String unit;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getCalculatorName() {
        return calculatorName;
    }

    public void setCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}

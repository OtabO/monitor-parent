package bee.monitor.entity;

import java.util.List;
import java.util.Map;

/**
 * Created by zhangsx on 15/8/18.
 * 配置中心元数据
 */
public class MetaData {
    private List<String> profixs;
    private List<String> suffixs;
    //类型 例:业务指标 or 技术指标
//    private List<String> types;
//    private Map<String,String> calculators;
    private List<String> units;
    private List<String> calculators;

    public List<String> getCalculators() {
        return calculators;
    }

    public void setCalculators(List<String> calculators) {
        this.calculators = calculators;
    }

    public List<String> getProfixs() {
        return profixs;
    }

    public void setProfixs(List<String> profixs) {
        this.profixs = profixs;
    }

    public List<String> getSuffixs() {
        return suffixs;
    }

    public void setSuffixs(List<String> suffixs) {
        this.suffixs = suffixs;
    }

//    public Map<String, String> getCalculators() {
//        return calculators;
//    }
//
//    public void setCalculators(Map<String, String> calculators) {
//        this.calculators = calculators;
//    }

    public List<String> getUnits() {
        return units;
    }

    public void setUnits(List<String> units) {
        this.units = units;
    }
}

package org.zxp.esclientrhl.util;

/**
 * @program: esdemo
 * @description: mapping注解对应的数据载体类
 * @author: X-Pacific zhang
 * @create: 2019-01-29 15:09
 **/
public class MappingData {

    String field_name;
    /**
     * 数据类型（包含 关键字类型）
     * @return
     */
    String datatype;
    /**
     * 间接关键字
     * @return
     */
    boolean keyword;

    /**
     * 关键字忽略字数
     * @return
     */
    int ignore_above;
    /**
     * 是否支持autocomplete，高效全文搜索提示
     * @return
     */
    boolean autocomplete;
    /**
     * 是否支持suggest，高效前缀搜索提示
     * @return
     */
    boolean suggest;
    /**
     * 索引分词器设置
     * @return
     */
    String analyzer;
    /**
     * 搜索内容分词器设置
     * @return
     */
    String search_analyzer;
//    /**
//     * 是否分析字段
//     * @return
//     */
//    String analyzedtype;

    private boolean allow_search;

    private String copy_to;


    public String getField_name() {
        return field_name;
    }

    public void setField_name(String field_name) {
        this.field_name = field_name;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public boolean isKeyword() {
        return keyword;
    }

    public void setKeyword(boolean keyword) {
        this.keyword = keyword;
    }

    public int getIgnore_above() {
        return ignore_above;
    }

    public void setIgnore_above(int ignore_above) {
        this.ignore_above = ignore_above;
    }

    public boolean isAutocomplete() {
        return autocomplete;
    }

    public void setAutocomplete(boolean autocomplete) {
        this.autocomplete = autocomplete;
    }

    public boolean isSuggest() {
        return suggest;
    }

    public void setSuggest(boolean suggest) {
        this.suggest = suggest;
    }

    public String getAnalyzer() {
        return analyzer;
    }

    public void setAnalyzer(String analyzer) {
        this.analyzer = analyzer;
    }

    public String getSearch_analyzer() {
        return search_analyzer;
    }

    public void setSearch_analyzer(String search_analyzer) {
        this.search_analyzer = search_analyzer;
    }

//    public String getAnalyzedtype() {
//        return analyzedtype;
//    }
//
//    public void setAnalyzedtype(String analyzedtype) {
//        this.analyzedtype = analyzedtype;
//    }


    public String getCopy_to() {
        return copy_to;
    }

    public void setCopy_to(String copy_to) {
        this.copy_to = copy_to;
    }

    public boolean isAllow_search() {
        return allow_search;
    }

    public void setAllow_search(boolean allow_search) {
        this.allow_search = allow_search;
    }
}

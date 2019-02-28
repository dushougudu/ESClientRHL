package org.zxp.esclientrhl.annotation;


import org.zxp.esclientrhl.enums.Analyzer;
import org.zxp.esclientrhl.enums.DataType;

import java.lang.annotation.*;

/**
 * @program: esdemo
 * @description: 对应索引结构mapping的注解，在es entity field上添加
 * @author: X-Pacific zhang
 * @create: 2019-01-25 16:57
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface ESMapping {
    /**
     * 数据类型（包含 关键字类型）
     */
    DataType datatype() default DataType.text_type;
    /**
     * 间接关键字
     */
    boolean keyword() default true;
    /**
     * 关键字忽略字数
     */
    int ignore_above() default 256;
    /**
     * 是否支持autocomplete，高效全文搜索提示
     */
    boolean autocomplete() default false;
    /**
     * 是否支持suggest，高效前缀搜索提示
     */
    boolean suggest() default false;
    /**
     * 索引分词器设置（研究类型）
     */
    Analyzer analyzer() default Analyzer.standard;
    /**
     * 搜索内容分词器设置
     */
    Analyzer search_analyzer() default Analyzer.standard;
    //6+版本已经改变方式
//    /**
//     * 是否分析字段
//     * @return
//     */
//    AnalyzedType analyzedtype() default AnalyzedType.analyzed;

    /**
     * 是否允许被搜索
     */
    boolean allow_search() default true;

    /**
     * 拷贝到哪个字段，代替_all
     */
    String copy_to() default "";
}

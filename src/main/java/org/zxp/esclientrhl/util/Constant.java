package org.zxp.esclientrhl.util;

/**
 * @program: esdemo
 * @description: 常量类
 * @author: X-Pacific zhang
 * @create: 2019-01-22 09:52
 **/
public class Constant {
    //非分页，默认的查询条数
    public static int DEFALT_PAGE_SIZE = 200;
    //搜索建议默认条数
    public static int COMPLETION_SUGGESTION_SIZE = 10;
    //高亮字段默认tag
    public static String HIGHLIGHT_TAG = "";
    //创建索引mapping时，是否默认创建keyword
    public static boolean DEFAULT_KEYWORDS = true;

    public static String DEFAULT_ES_HOST = "127.0.0.1:9200";
    //SCROLL查询 2小时
    public static long DEFAULT_SCROLL_TIME = 2;
    //SCROLL查询 每页默认条数
    public static int DEFAULT_SCROLL_PERPAGE = 100;


    public static double[] DEFAULT_PERCSEGMENT = {50.0,95.0,99.0};
 }

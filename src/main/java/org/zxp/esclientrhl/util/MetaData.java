package org.zxp.esclientrhl.util;

/**
 * 元数据载体类
 */
public class MetaData{
    public MetaData(String indexname, String indextype) {
        this.indexname = indexname;
        this.indextype = indextype;
    }
    String indexname = "";
    String indextype = "";

    boolean printLog = false;

    public boolean isPrintLog() {
        return printLog;
    }

    public void setPrintLog(boolean printLog) {
        this.printLog = printLog;
    }

    public String getIndexname() {
        return indexname;
    }
    public void setIndexname(String indexname) {
        this.indexname = indexname;
    }
    public String getIndextype() {
        return indextype;
    }
    public void setIndextype(String indextype) {
        this.indextype = indextype;
    }

    int number_of_shards;
    int number_of_replicas;

    public int getNumber_of_shards() {
        return number_of_shards;
    }

    public void setNumber_of_shards(int number_of_shards) {
        this.number_of_shards = number_of_shards;
    }

    public int getNumber_of_replicas() {
        return number_of_replicas;
    }

    public void setNumber_of_replicas(int number_of_replicas) {
        this.number_of_replicas = number_of_replicas;
    }

    public MetaData(String indexname, String indextype, int number_of_shards, int number_of_replicas) {
        this.indexname = indexname;
        this.indextype = indextype;
        this.number_of_shards = number_of_shards;
        this.number_of_replicas = number_of_replicas;
    }

    public MetaData(int number_of_shards, int number_of_replicas) {
        this.number_of_shards = number_of_shards;
        this.number_of_replicas = number_of_replicas;
    }
}
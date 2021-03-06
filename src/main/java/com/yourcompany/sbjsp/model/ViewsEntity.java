package com.yourcompany.sbjsp.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by WildGrowth on 23.03.2018.
 */
@Entity
@Table(name = "VIEWS", schema = "information_schema", catalog = "")
public class ViewsEntity {
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String viewDefinition;
    private String checkOption;
    private String isUpdatable;
    private String definer;
    private String securityType;
    private String characterSetClient;
    private String collationConnection;

    @Basic
    @Column(name = "TABLE_CATALOG", nullable = false, length = 512)
    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Basic
    @Column(name = "TABLE_SCHEMA", nullable = false, length = 64)
    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Basic
    @Column(name = "TABLE_NAME", nullable = false, length = 64)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "VIEW_DEFINITION", nullable = false, length = -1)
    public String getViewDefinition() {
        return viewDefinition;
    }

    public void setViewDefinition(String viewDefinition) {
        this.viewDefinition = viewDefinition;
    }

    @Basic
    @Column(name = "CHECK_OPTION", nullable = false, length = 8)
    public String getCheckOption() {
        return checkOption;
    }

    public void setCheckOption(String checkOption) {
        this.checkOption = checkOption;
    }

    @Basic
    @Column(name = "IS_UPDATABLE", nullable = false, length = 3)
    public String getIsUpdatable() {
        return isUpdatable;
    }

    public void setIsUpdatable(String isUpdatable) {
        this.isUpdatable = isUpdatable;
    }

    @Basic
    @Column(name = "DEFINER", nullable = false, length = 93)
    public String getDefiner() {
        return definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer;
    }

    @Basic
    @Column(name = "SECURITY_TYPE", nullable = false, length = 7)
    public String getSecurityType() {
        return securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    @Basic
    @Column(name = "CHARACTER_SET_CLIENT", nullable = false, length = 32)
    public String getCharacterSetClient() {
        return characterSetClient;
    }

    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    @Basic
    @Column(name = "COLLATION_CONNECTION", nullable = false, length = 32)
    public String getCollationConnection() {
        return collationConnection;
    }

    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewsEntity that = (ViewsEntity) o;

        if (tableCatalog != null ? !tableCatalog.equals(that.tableCatalog) : that.tableCatalog != null) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (viewDefinition != null ? !viewDefinition.equals(that.viewDefinition) : that.viewDefinition != null)
            return false;
        if (checkOption != null ? !checkOption.equals(that.checkOption) : that.checkOption != null) return false;
        if (isUpdatable != null ? !isUpdatable.equals(that.isUpdatable) : that.isUpdatable != null) return false;
        if (definer != null ? !definer.equals(that.definer) : that.definer != null) return false;
        if (securityType != null ? !securityType.equals(that.securityType) : that.securityType != null) return false;
        if (characterSetClient != null ? !characterSetClient.equals(that.characterSetClient) : that.characterSetClient != null)
            return false;
        if (collationConnection != null ? !collationConnection.equals(that.collationConnection) : that.collationConnection != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableCatalog != null ? tableCatalog.hashCode() : 0;
        result = 31 * result + (tableSchema != null ? tableSchema.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (viewDefinition != null ? viewDefinition.hashCode() : 0);
        result = 31 * result + (checkOption != null ? checkOption.hashCode() : 0);
        result = 31 * result + (isUpdatable != null ? isUpdatable.hashCode() : 0);
        result = 31 * result + (definer != null ? definer.hashCode() : 0);
        result = 31 * result + (securityType != null ? securityType.hashCode() : 0);
        result = 31 * result + (characterSetClient != null ? characterSetClient.hashCode() : 0);
        result = 31 * result + (collationConnection != null ? collationConnection.hashCode() : 0);
        return result;
    }
}

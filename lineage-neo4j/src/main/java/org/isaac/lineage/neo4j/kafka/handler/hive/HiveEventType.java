package org.isaac.lineage.neo4j.kafka.handler.hive;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/23 11:43
 * @since 1.0.0
 */
public enum HiveEventType {

    /**
     * CreateTable event
     */
    HIVE_TABLE("hive_table");

    private final String name;

    HiveEventType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package com.walsoft.rich_exception.category.database;

/**
 * Standardized error codes for database-related exceptions.
 * <p>
 * Grouping strategy:
 * <ul>
 * <li><b>DB-0xx:</b> Infrastructure and Connectivity</li>
 * <li><b>DB-1xx:</b> Data Integrity and Constraints</li>
 * <li><b>DB-2xx:</b> Persistence Logic</li>
 * <li><b>DB-3xx:</b> Query Execution</li>
 * <li><b>DB-4xx:</b> Security and Access</li>
 * </ul>
 */
public enum RichDatabaseExceptionCodes {

    // --- INFRASTRUCTURE & CONNECTIVITY (0xx) ---

    /** [DB-001] Unable to establish a connection to the database server. */
    CONNECTION_FAILED("DB-001"),

    /** [DB-002] The connection attempt timed out. */
    CONNECTION_TIMEOUT("DB-002"),

    /** [DB-003] No connections available in the connection pool. */
    POOL_EXHAUSTED("DB-003"),

    // --- DATA INTEGRITY & CONSTRAINTS (1xx) ---

    /** [DB-101] A unique constraint or primary key violation occurred. */
    DUPLICATE_KEY("DB-101"),

    /** [DB-102] A foreign key constraint was violated. */
    FOREIGN_KEY_VIOLATION("DB-102"),

    /** [DB-103] A 'Not Null' constraint was violated. */
    NULL_CONSTRAINT_VIOLATION("DB-103"),

    // --- PERSISTENCE LOGIC (2xx) ---

    /** [DB-201] The requested entity was not found in the database. */
    ENTITY_NOT_FOUND("DB-201"),

    /** [DB-202] Concurrent modification detected (Optimistic Locking). */
    OPTIMISTIC_LOCK_FAILED("DB-202"),

    // --- QUERY EXECUTION (3xx) ---

    /** [DB-301] The SQL statement has invalid syntax or is malformed. */
    SYNTAX_ERROR("DB-301"),

    /** [DB-302] The execution of a specific query exceeded the allowed time limit. */
    QUERY_TIMEOUT("DB-302"),

    // --- SECURITY & ACCESS (4xx) ---

    /** [DB-401] The current user does not have permission to perform this operation. */
    ACCESS_DENIED("DB-401"),

    /** [DB-402] The requested schema or database catalog does not exist. */
    SCHEMA_NOT_FOUND("DB-402");

    private final String code;

    RichDatabaseExceptionCodes(String code) {
        this.code = code;
    }

    /**
     * @return The unique alphanumeric error code.
     */
    public String getCode() {
        return code;
    }
}
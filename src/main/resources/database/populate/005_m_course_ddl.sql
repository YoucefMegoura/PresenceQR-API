--
-- @author youcefmegoura
-- @created 11/02/2023
--

CREATE TABLE m_course
(
    m_course_id bigint PRIMARY KEY,
    isactif     boolean   DEFAULT true  NOT NULL,
    created     timestamp DEFAULT NOW() NOT NULL,
    updated     timestamp DEFAULT NOW() NOT NULL,
    name        varchar(255)            NOT NULL
);

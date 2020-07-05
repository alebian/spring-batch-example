CREATE TABLE IF NOT EXISTS passwords (
    original VARCHAR (255),
    md5 CHAR (32),
    sha1 CHAR (40),
    sha256 CHAR (64),
    sha512 CHAR (128),
    PRIMARY KEY (original)
);

CREATE UNIQUE INDEX ON passwords (original);
CREATE INDEX ON passwords (md5);
CREATE INDEX ON passwords (sha1);
CREATE INDEX ON passwords (sha256);
CREATE INDEX ON passwords (sha512);

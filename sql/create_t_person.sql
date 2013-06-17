--<ScriptOptions statementTerminator=";"/>

DROP TABLE "public"."t_person";

CREATE TABLE "public"."t_person" (
		"person_id" TEXT,
		"name" TEXT,
		"age" INT4,
		"updt_date" TIMESTAMPTZ,
		"country" TEXT
	);


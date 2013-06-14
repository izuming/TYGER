--<ScriptOptions statementTerminator=";"/>

DROP TABLE "public"."t_person";

CREATE TABLE "public"."t_person" (
		"person_id" TEXT(2147483647),
		"name" TEXT(2147483647),
		"age" INT4,
		"updt_date" TIMESTAMPTZ,
		"country" TEXT(2147483647)
	);


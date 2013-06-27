--<ScriptOptions statementTerminator=";"/>

DROP TABLE "public"."t_event";

CREATE TABLE t_event (
		event_id INT4,
		title TEXT,
		subtitle TEXT,
		sponsor_name TEXT,
		event_detail TEXT,
		place TEXT,
		url TEXT,
		open_start_time TIMESTAMP,
		open_end_time TIMESTAMP,
		acceptance_start_time TIMESTAMP,
		acceptance_end_time TIMESTAMP,
		stop_flg BOOL,
		delete_flg BOOL,
		updt_time TIMESTAMPTZ
	);


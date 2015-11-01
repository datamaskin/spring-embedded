INSERT INTO OPSCHD_RAW_EVNT(EVENT_SUB_TYPE, 
							CREATE_TIMESTAMP, 
							ENTITY_ID, 
							EVENT_TYPE, 
							MESSAGE_TEXT, 
							EVENT_MESSAGE_ID, 
							DOMAIN_CODE) 
							VALUES('subevent' ,CURRENT_TIMESTAMP ,'1' ,'entityid', '<message></message>', 'msgid','domaincode');
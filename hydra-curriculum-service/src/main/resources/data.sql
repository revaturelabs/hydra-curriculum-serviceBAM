/* List of Curriculums Created in same month and same time
    Curriculum ID's will begin at 100s
*/
INSERT INTO CURRICULUM (ID, CREATOR_ID, DATE_CREATED, MASTER_VERSION, MODIFIER_ID, NAME, WEEK_DURATION, VERSION) VALUES (100, 50, TO_TIMESTAMP('02/MAY/2018 12:00:00'), true, 0, 'Java', 10, 1);
INSERT INTO CURRICULUM (ID, CREATOR_ID, DATE_CREATED, MASTER_VERSION, MODIFIER_ID, NAME, WEEK_DURATION, VERSION) VALUES (101, 50, TO_TIMESTAMP('02/MAY/2018 12:00:00'), true, 0, '.NET', 10, 1);

/* List of Curriculums Created in different month */
INSERT INTO CURRICULUM (ID, CREATOR_ID, DATE_CREATED, MASTER_VERSION, MODIFIER_ID, NAME, WEEK_DURATION, VERSION) VALUES (102, 50, TO_TIMESTAMP('02/JUN/2018 12:00:00'), true, 0, 'Java', 10, 2);
INSERT INTO CURRICULUM (ID, CREATOR_ID, DATE_CREATED, MASTER_VERSION, MODIFIER_ID, NAME, WEEK_DURATION, VERSION) VALUES (103, 50, TO_TIMESTAMP('02/JUL/2018 12:00:00'), true, 0, 'Java', 10, 3);
INSERT INTO CURRICULUM (ID, CREATOR_ID, DATE_CREATED, MASTER_VERSION, MODIFIER_ID, NAME, WEEK_DURATION, VERSION) VALUES (104, 50, TO_TIMESTAMP('02/AUG/2018 12:00:00'), true, 0, '.NET', 10, 2);
INSERT INTO CURRICULUM (ID, CREATOR_ID, DATE_CREATED, MASTER_VERSION, MODIFIER_ID, NAME, WEEK_DURATION, VERSION) VALUES (105, 50, TO_TIMESTAMP('02/SEP/2018 12:00:00'), true, 0, '.NET', 10, 3);


/* 
    Curriculum ID's will begin at 200s
    
    Curriculum_subtopic learning 'Loops' 
    1000 - Loops
*/
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (201, 100, 1000);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (202, 101, 1000);

INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (203, 102, 1000);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (204, 103, 1000);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (205, 104, 1000);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (206, 105, 1000);


/* Curriculum_Subtopic learning 'OOP'
    1001 - OOP
*/
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (207, 100, 1001);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (208, 101, 1001);

INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (209, 102, 1001);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (210, 103, 1001);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (211, 104, 1001);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (212, 105, 1001);


/* Curriculum Subtopic learning 'Select Queries' 
    1002 - Select Queries
*/
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (213, 100, 1002);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (214, 101, 1002);

INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (215, 102, 1002);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (216, 103, 1002);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (217, 104, 1002);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (218, 105, 1002);

/* Curriculum Subtopic learning 'Joins' 
    1003 - Joins
*/
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (219, 100, 1003);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (220, 101, 1003);

INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (221, 102, 1003);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (222, 103, 1003);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (223, 104, 1003);
INSERT INTO CURRICULUM_SUBTOPIC (ID, CURRICULUM_ID, SUBTOPIC_ID) VALUES (224, 105, 1003);

/* Schedule IDs will begin at 300s */
INSERT INTO SCHEDULE (ID, CURRICULUM_ID) VALUES (301, 100);
INSERT INTO SCHEDULE (ID, CURRICULUM_ID) VALUES (302, 101);

INSERT INTO SCHEDULE (ID, CURRICULUM_ID) VALUES (303, 102);
INSERT INTO SCHEDULE (ID, CURRICULUM_ID) VALUES (304, 103);
INSERT INTO SCHEDULE (ID, CURRICULUM_ID) VALUES (305, 104);
INSERT INTO SCHEDULE (ID, CURRICULUM_ID) VALUES (306, 105);


/* Scheule Date ID's will begin at 400s */
/* Week 1, Day 1 is Loops 
   Week 1, Day 2 is OOP
   
   Week 2, Day 1 is Select Queries
   Week 3, Day 2 is Joins
*/
INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (401, 1, 1, TO_TIMESTAMP('02/APR/2018 1:00:00'), TO_TIMESTAMP('02/APR/2018 2:00:00'));
INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (402, 1, 2, TO_TIMESTAMP('03/APR/2018 2:00:00'), TO_TIMESTAMP('03/APR/2018 3:00:00'));
INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (403, 2, 1, TO_TIMESTAMP('09/APR/2018 3:00:00'), TO_TIMESTAMP('09/APR/2018 4:00:00'));       
INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (404, 2, 2, TO_TIMESTAMP('10/APR/2018 4:00:00'), TO_TIMESTAMP('10/APR/2018 5:00:00'));

INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (405, 1, 1, TO_TIMESTAMP('02/APR/2019 1:00:00'), TO_TIMESTAMP('02/APR/2019 2:00:00'));
INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (406, 1, 2, TO_TIMESTAMP('03/APR/2019 2:00:00'), TO_TIMESTAMP('03/APR/2019 3:00:00'));
INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (407, 2, 1, TO_TIMESTAMP('09/APR/2019 3:00:00'), TO_TIMESTAMP('09/APR/2019 4:00:00'));       
INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (408, 2, 2, TO_TIMESTAMP('10/APR/2019 4:00:00'), TO_TIMESTAMP('10/APR/2019 5:00:00'));

INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (409, 1, 1, TO_TIMESTAMP('02/APR/2020 1:00:00'), TO_TIMESTAMP('02/APR/2020 2:00:00'));
INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (410, 1, 2, TO_TIMESTAMP('03/APR/2020 2:00:00'), TO_TIMESTAMP('03/APR/2020 3:00:00'));
INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (411, 2, 1, TO_TIMESTAMP('09/APR/2020 3:00:00'), TO_TIMESTAMP('09/APR/2020 4:00:00'));       
INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (412, 2, 2, TO_TIMESTAMP('10/APR/2020 4:00:00'), TO_TIMESTAMP('10/APR/2020 5:00:00'));

INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (413, 1, 1, TO_TIMESTAMP('02/APR/2021 1:00:00'), TO_TIMESTAMP('02/APR/2021 2:00:00'));
INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (414, 1, 2, TO_TIMESTAMP('03/APR/2021 2:00:00'), TO_TIMESTAMP('03/APR/2021 3:00:00'));
INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (415, 2, 1, TO_TIMESTAMP('09/APR/2021 3:00:00'), TO_TIMESTAMP('09/APR/2021 4:00:00'));       
INSERT INTO SCHEDULED_DATE (ID, WEEK, DAY, START_TIME, END_TIME) VALUES (416, 2, 2, TO_TIMESTAMP('10/APR/2021 4:00:00'), TO_TIMESTAMP('10/APR/2021 5:00:00'));


/*  Scheduled Subtopic IDs will begin at 500
    Date - scheduled date ID
    Schedule - parent schedule ID
    
    1000 - loops
    1001 - OOP
    1002 - Select Queries
    1003 - Joins
*/
INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (501, 1000, 401, 301);
INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (502, 1000, 402, 302);
INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (503, 1000, 403, 303);
INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (504, 1000, 404, 304);

INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (505, 1001, 405, 301);
INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (506, 1001, 406, 302);
INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (507, 1001, 407, 303);
INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (508, 1001, 408, 304);

INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (509, 1002, 409, 301);
INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (510, 1002, 410, 302);
INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (511, 1002, 411, 303);
INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (512, 1002, 412, 304);

INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (513, 1003, 413, 301);
INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (514, 1003, 414, 302);
INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (515, 1003, 415, 303);
INSERT INTO SCHEDULED_SUBTOPICS (ID, SUBTOPIC_ID, DATE, SCHEDULE) VALUES (516, 1003, 416, 304);
-- USERS

INSERT INTO users
    (id, name)
VALUES
    (1, 'Donald');

INSERT INTO users
    (id, name)
VALUES
    ( 2, 'Kevin');

INSERT INTO users
    (id, name)
VALUES
    ( 3, 'Tattiana');

INSERT INTO users
    ( id, name)
VALUES
    (4, 'Rahel');

INSERT INTO users
    (id, name)
VALUES
    (5, 'Jasmine');

INSERT INTO users
    (id, name)
VALUES
    (6, 'Loveness');


-- POSTS

INSERT INTO posts
    (id, author, content, title,user_id)
VALUES
    (1, 'Donald', 'awesome', 'iPhone', 1);

INSERT INTO posts
    (id, author, content, title,user_id)
VALUES
    ( 2, 'jordan', 'amazing', 'iPad', 1);

INSERT INTO posts
    (id, author, content, title,user_id)
VALUES
    (3, 'charles', 'wonderful', 'iPhone', 2);

-- COMMENTS

INSERT INTO comments
    (id, name, post_id)
VALUES
    (1, 'awesome', 1);

INSERT INTO comments
    (id, name, post_id)
VALUES
    (2, 'amazing', 1);

INSERT INTO comments
    (id, name, post_id)
VALUES
    (3, 'wonderful', 2);

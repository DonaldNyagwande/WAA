-- USERS

INSERT INTO users
    (id, name)
VALUES
    (1, 'Donald');

INSERT INTO users
    (id, name)
VALUES
    ( 2, 'Mike');

INSERT INTO users
    (id, name)
VALUES
    ( 3, 'Youcef');

INSERT INTO users
    ( id, name)
VALUES
    (4, 'San');

INSERT INTO users
    (id, name)
VALUES
    (5, 'Sebastian');

INSERT INTO users
    (id, name)
VALUES
    (6, 'Hermon');


-- POSTS

INSERT INTO posts
    (id, author, content, title,user_id)
VALUES
    (1, 'james', 'awesome', 'iPhone', 1);

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

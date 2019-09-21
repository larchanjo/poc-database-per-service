# Context

One of the advantages of using microservices architecture is the loose coupling but most services need to persist in some kind of database.

# Problem

What’s the database architecture in a microservices application?

# Solution

Keep each microservices's persistent data private to that service and accessible only via API.

## Private-tables-per-service

Each service owns a set of tables that must only be accesed by that service

### Advantages

Cost

### Disadvantages

One point of failure, this is a anti-pattern
You can't change the database, it is like a lock-i

## Schema-per-service

Each service has a database schema that's private to that service

### Advantages

Cost

### Disadvantages

One point of failure, this is a anti-pattern
You can't change the database, it is like a lock-in

## Database-per-service

Each service has it's own database server

### Advantages

You can select the best database for your use case, SQL, NoSQL(Document, Key-value, Column or Graph)
Loose coupling
Resilience, because if the database downs it is isolated to the context of the service

### Disadvantages

Cost
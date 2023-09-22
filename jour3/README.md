# Day 3 - Data Access with Spring Boot

Welcome to Day 3 of the Java Spring development training program at La Plateforme! This day is focused on accessing and managing data using Spring Boot, Java Persistence (JPA), and H2 database.

## My Day 3 Accomplishments

In today's session, I dived into data access with Spring Boot and explored Java Persistence (JPA) along with H2 database integration. Here's an overview of the tasks I completed:

### Job 01 - Understanding JPA

- Researched the Java Persistence API (JPA) and its integration with Spring Data JPA.

**Question: What is JPA, and how does it facilitate database access?**

_Answer: JPA (Java Persistence API) is a Java standard for object-relational mapping (ORM) that simplifies database access and management in Java applications. It provides a convenient way to interact with databases by mapping Java objects to database tables, allowing developers to work with data using object-oriented principles._

### Job 02 - Configuring an H2 Database

- Configured an in-memory H2 database for the application.
- Modified the `application.yml` file to include the necessary properties.

**Question: What is the objective of having a functional H2 database integrated into your application?**

_Answer: The objective of having a functional H2 database integrated into your application is to provide a lightweight, in-memory database solution for development and testing purposes. It allows for efficient data storage and retrieval within the application, enhancing its functionality and enabling thorough testing without the need for an external database server._

### Job 03 - Creating a JPA Entity

- Created a `Person` class and marked it as a JPA entity.
- Added attributes like `id`, `name`, and `age` to the entity.

**Question: What is the importance of annotations like @Entity in the context of JPA?**

_Answer: Annotations like @Entity are crucial in JPA (Java Persistence API) as they define Java objects as entities that can be mapped to database tables. @Entity marks a class as a persistent entity, allowing it to be stored and queried in a relational database. It's a fundamental part of the ORM (Object-Relational Mapping) process, simplifying database interaction in Java applications._

### Job 04 - Implementing a JPA Repository

- Created a `PersonRepository` interface that extends `JpaRepository`.
- Experimented with predefined methods provided by Spring Data JPA.

**Question: How does Spring Data simplify database query creation?**

_Answer: Spring Data simplifies database query creation by providing high-level abstractions and interfaces. It offers repository interfaces that developers can extend, allowing them to define custom query methods using method names. Spring Data JPA, for example, generates SQL queries based on method names, reducing the need for writing complex SQL queries manually and enhancing code readability._

### Job 05 - Using the Repository in a Controller

- Utilized the `PersonRepository` to create and read entities.
- Created a page to display a list of persons.

**Question: How can you create and read entities with Spring Data JPA?**

_Answer: With Spring Data JPA, you can create and read entities effortlessly. To create, define an entity class with the @Entity annotation and a repository interface extending JpaRepository. To read, use repository methods like findById() or findAll(). Spring Data JPA handles database interactions, making it easy to perform CRUD (Create, Read, Update, Delete) operations on entities._

### Job 06 - Updating and Deleting Data

- Added functionality to update and delete persons from the database via the web page.

<!-- Job 06 Question will be added here -->

## Key Takeaways

- Explored the Java Persistence API (JPA) and its role in simplifying database access in Java applications.
- Configured an in-memory H2 database for development purposes.
- Created a JPA entity to represent persistent data in the application.
- Leveraged Spring Data JPA to interact with the database using repository interfaces.
- Built a web page to display and manipulate data retrieved from the database.

Day 3 has equipped me with valuable skills in data access and management with Spring Boot. I'm excited to continue my journey and explore more advanced topics in Java Spring!

Thank you for being a part of this learning experience at La Plateforme!

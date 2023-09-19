# Day 2 - MVC and Thymeleaf

Welcome to Day 2 of the Java Spring development training program at La Plateforme! This day is dedicated to exploring the Model-View-Controller (MVC) architecture and using Thymeleaf as a templating engine in Spring Boot.

## My Day 2 Accomplishments

In today's session, I delved into the world of MVC and Thymeleaf in Spring Boot. Here's an overview of the tasks I completed:

### Job 01 - Understanding MVC

- Researched the Model-View-Controller (MVC) architecture and its usage in Spring Boot.

**Question: How does the MVC model help structure a web application?**

_Answer: The MVC (Model-View-Controller) pattern helps structure a web application by separating it into three interconnected components: Model (data), View (user interface), and Controller (logic). This separation enhances maintainability, modularity, and testability while promoting a clear division of responsibilities._

### Job 02 - Creating a Controller and Using Thymeleaf

- Created a controller, `ViewController`, and a `view.html` file.
- Utilized Thymeleaf to display a message.

**Question: What is the difference between Thymeleaf and traditional HTML templates?**

_Answer: Thymeleaf is a template engine that allows dynamic content generation in web applications. It adds server-side processing capabilities to HTML templates. In contrast, traditional HTML templates are static and do not support dynamic content generation. Thymeleaf uses special attributes (prefixed by "th:") to integrate dynamic data, making it suitable for building dynamic web pages in Spring applications._

### Job 03 - Passing Data to the View

- Modified `ViewController` to pass a list of objects to `view.html`.
- Used Thymeleaf to iterate over this list.

**Question: How can you pass data from a controller to a view in Spring?**

_Answer: In Spring, you can pass data from a controller to a view by adding attributes to the model object within the controller's method. These attributes can then be accessed and displayed in the view, allowing you to send dynamic data to the user interface._

### Job 04 - Handling Form Submission

- Added a simple form to `view.html`.
- Modified `ViewController` to handle form submissions and display a welcome message.

**Question: How does Spring facilitate form handling?**

_Answer: Spring facilitates form handling by providing annotations like `@PostMapping` and `@RequestParam` to simplify the processing of form submissions. It allows developers to map form data directly to method parameters and return views with updated data, streamlining the handling of user input in web applications._

### Job 05 - Form Validation

- Enhanced the form by adding an age field.
- Utilized annotations to validate the age field.
- Displayed errors in `view.html` when necessary.

<!-- Job 05 Question will be added here -->

## Key Takeaways

- Gained insights into the Model-View-Controller (MVC) architecture and its significance in web application development.
- Explored the usage of Thymeleaf as a templating engine for rendering dynamic content.
- Learned to pass data from controllers to views in a Spring application.
- Delved into form handling and validation with Spring.

Day 2 has provided me with valuable knowledge in structuring web applications, handling user input, and creating dynamic views. I'm eager to continue exploring Spring Boot and enhancing my Java development skills!

Thank you for joining me on this learning journey at La Plateforme!

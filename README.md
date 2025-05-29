# Peer-to-Peer Skill Exchange App

## Overview
This project is a role-based platform designed to enable users to exchange skills by offering and requesting learning sessions, facilitating peer-to-peer collaboration. The backend is built using Java and Spring Boot, leveraging RESTful APIs, MySQL for persistence, and JWT-based Spring Security for authentication and authorization.

## Features
- Role-based user management (e.g., User, Admin)
- Secure user registration and login with JWT authentication
- Create, offer, and request skill exchange sessions
- Manage skill sessions including session scheduling and confirmation
- REST API endpoints for frontend or mobile integration
- Secure password hashing and token-based session management

## Technologies Used
- Java 17+
- Spring Boot
- Spring Security (JWT)
- Spring Data JPA (Hibernate)
- MySQL
- Maven (build tool)
- Lombok (optional)
- Postman (API testing)

## Getting Started

### Prerequisites
- Java 17 or above installed
- MySQL server installed and running
- Maven installed and configured

### Installation & Setup

1. **Clone the repository**

   ```bash
   git clone https://github.com/yourusername/skillexchange.git
   cd skillexchange
## Configure the Database

1. Create a MySQL database named `skillexchange_db`

2. Update the database credentials in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/skillexchange_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

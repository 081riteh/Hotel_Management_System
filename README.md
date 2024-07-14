# Hotel Management System

## Overview

The Hotel Management System is a console-based application developed in Java. It is designed to manage various aspects of hotel operations, check-ins/check-outs, billing, room management, food-ordering, and reporting. The system uses JDBC to interact with a relational database (phpMyAdmin) for storing and retrieving hotel data.

## Features

- **Check-In/Check-Out**: Manage guest arrivals and departures.
- **Room Management**: Assign and track room status (available, occupied, maintenance).
- **Billing and Invoicing**: Generate and manage bills for guests.
- **Customer Service**: Order food, Read and write feedback. 

## Software Requirements

To run this project, you need the following software installed on your system:

- **Java Development Kit (JDK) 8 or higher**: The programming language used for developing the application.
- **JDBC**: Java Database Connectivity API for database operations.
- **IDE** :eclipse or intelliJ for writing code and add jar files to it.
- **mysql-connector**:  Add jdbc mysql connector given in the github in your IDE.
- **MySQL**: The database used for storing hotel data (phpMyAdmin).
- **Git**: Version control system.

## Installation and Setup

### Step 1: Clone the Repository

```bash
git clone https://github.com/081riteh/Hotel_Management_System.git
cd hotel_management_system
```

### Step 2: Set Up the Database

### Step 3. Install MySQL (Xampp server) and create a database named `hotel`.

### Step 4: Configure the Database Connection

Update the `db.properties` file with your database credentials:

```properties
db.url=jdbc:mysql://localhost:3306/hotel
db.username=root
db.password=yourpassword
```

### Step 4: Run the Application

Run the application using the following command:

```bash
java startApp.java
```

## Project Structure

- **src/startApp.java**: Contains the main application code.
  - **Backend/**: Handles database connections and operations using JDBC.
  - **Frontend/**: Contains the frontend part of the application.
  - **Business Logic/**: Contains the business logic and operations.
  - **Interfaces/**: Contains the interfaces of all the functionalities.

## Explanation of the Project

### Backend

The backend is built using Java and JDBC for database interactions. Key components include:

- **Models**: Define the structure of the data (Guest, Room, Reservation, Bill).
- **Services**: Handle the business logic and interact with the database through JDBC.
- **Utilities**: Provide helper methods for common tasks like input validation and date formatting.

### Database

MySQL is used to store information about guests, rooms, reservations, and bills. The database schema includes tables for each of these entities and establishes relationships between them.

### Console Interface

The application provides a console-based interface for interacting with the system. Users can input commands to perform various operations like making a reservation, checking in a guest, generating a bill, and more.

## Contribution

If you would like to contribute to the project, please fork the repository and submit a pull request. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

If you have any questions or need further assistance, please contact sritehkumar2000@gmail.com.

---

Thank you for using the Hotel Management System! We hope it helps you efficiently manage your hotel's operations.

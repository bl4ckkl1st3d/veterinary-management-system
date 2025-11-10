# Veterinary Management System

This is a Java-based desktop application for managing a veterinary clinic. It provides a graphical user interface (GUI) for clinic staff to manage patient records, user accounts, and other clinic operations.

The system features role-based access control, with different interfaces and permissions for Administrators, Veterinarians, and Staff members.

## Features

* **User Authentication:** Secure login system for all users.
* **Password Recovery:** A "Forgot Password" feature for account recovery.
* **Role-Based Access Control:** The application displays different modules based on the user's role:
    * **Administrator:** Can manage user accounts (Add, Search).
    * **Veterinarian:** Can manage patient/animal records (Add, Edit, Search).
    * **Staff:** Has a dedicated module for staff-related tasks.

## Technology Stack

* **Language:** Java
* **UI Framework:** Java Swing
* **IDE:** Apache NetBeans (indicated by `.form` and `nbproject` files)
* **Build Tool:** Apache Ant (indicated by `build.xml`)
* **Database:** A SQL database (a schema is provided in `schema_dump.sql`)

## Getting Started

To run this project, you will need the Java Development Kit (JDK), Apache NetBeans, and a SQL database.

### Prerequisites

* [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) (e.g., JDK 8 or 11)
* [Apache NetBeans IDE](https://netbeans.apache.org/download/index.html)
* A SQL Database Server (e.g., [MySQL](https://www.mysql.com/), [PostgreSQL](https://www.postgresql.org/), or a package like [XAMPP](https://www.apachefriends.org/index.html))

### Installation and Setup

1.  **Clone the Repository**
    ```bash
    git clone [https://github.com/your-username/veterinary-management-system.git](https://github.com/your-username/veterinary-management-system.git)
    cd veterinary-management-system
    ```

2.  **Set up the Database**
    * Start your SQL database server.
    * Create a new database (e.g., `veterinary_db`).
    * Import the database schema using the provided `schema_dump.sql` file. This will create all the necessary tables.

3.  **Open the Project in NetBeans**
    * Launch the Apache NetBeans IDE.
    * Go to `File > Open Project...`.
    * Navigate to and select the cloned repository folder. NetBeans will automatically recognize the project structure.

4.  **Configure Database Connection**
    * You will likely need to update the database connection settings (URL, username, and password) in the Java source code to match your local database setup.
    * Look for the database connection logic (often in the `login.java` file or a dedicated database utility class) and update the credentials.

### Running the Application

1.  In the NetBeans project navigator, expand the `Source Packages` folder.
2.  Navigate to the `softeng` package.
3.  Locate the `main.java` or `login.java` file (this is the typical entry point).
4.  Right-click the file and select **Run File** to launch the application.

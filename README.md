[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Hotel Booking System

---

## Problem Statement (max 150 words)

Design and implement a console-based Hotel Booking System in Java that manages hotel room
reservations. The system should allow users to view available rooms, check room details, book
rooms, and cancel bookings. Different room types such as Single Room and Double Room will be
represented using inheritance, while common attributes and behaviors will be defined using an
abstract class. The system will demonstrate important Object-Oriented Programming principles
including abstraction, inheritance, polymorphism, and exception handling. It should also handle
errors such as attempting to book an already reserved room or entering an invalid room number.
The application will be menu-driven and modular, allowing efficient interaction with the system and
proper management of hotel bookings.

---

## Target User

Hotel receptionists, hotel managers, and hotel staff who need to manage room availability,
bookings, and cancellations efficiently in a small hotel or guest house.

---

## Core Features

- View all available hotel rooms
- Display room details (room number, type, price, booking status)
- Book a room for a customer
- Cancel an existing booking
- Error handling for invalid booking or unavailable rooms
- Menu-driven console interface

---

## OOP Concepts Used

- Abstraction: Using an abstract Room class to define common properties and behaviors.
- Inheritance: SingleRoom and DoubleRoom classes inherit from the Room class.
- Polymorphism: Methods like displayDetails() are overridden in different room types.
- Encapsulation: Private variables with controlled access through methods.
- Exception Handling: Custom exceptions to handle errors such as booking an already booked
room.

---

## Proposed Architecture Description

The system follows a modular object-oriented architecture. The abstract Room class defines the
basic structure and functionality common to all rooms. Specific room types such as SingleRoom
and DoubleRoom extend this class and implement their own details using polymorphism. The Hotel
class acts as the central management component that stores room objects and manages booking
and cancellation operations. A custom exception class handles error situations like attempting to
book an already reserved room. The main class provides a menu-driven interface that allows the
user to interact with the system and perform different booking operations. These components work
together to provide an organized and efficient hotel booking management system.

---

## How to Run

**Prerequisites**

* Java JDK (version 8 or above) installed
* Java added to system `PATH`

**Steps**

1. Navigate to the source folder:

```bash id="0d5q2k"
cd Desktop/HotelBookingSystem/src
```

2. Compile the program:

```bash id="qj9g9c"
javac *.java
```

3. Run the application:

```bash id="0u3rjz"
java Main
```

**Usage**

* `1` View rooms
* `2` Book room
* `3` Cancel booking
* `4` Exit

**Notes**

* Compile before running after changes
* Data is stored in `rooms.txt` if persistence is enabled
* Java is case-sensitive

---

## Git Discipline Notes
Minimum 10 meaningful commits required.

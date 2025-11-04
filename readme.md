# Task Tracker

A Spring Boot application for managing tasks and task lists. This application provides REST APIs to create, read, update, and delete tasks and task lists.

## Technologies

- Java 21
- Spring Boot 3.5.5
- PostgreSQL
- Maven
- Docker

## Prerequisites

- Java 21 or higher
- Docker and Docker Compose
- Maven (or use the included Maven wrapper)

## Features

### Task Management
- Create, view, update, and delete task lists
- Add and manage tasks within lists
- Set task priorities (HIGH, MEDIUM, LOW)
- Track task status (OPEN, CLOSED)
- Add descriptions and due dates to tasks
- Filter tasks by status or priority
- Search tasks by title or description

### Task List Organization
- Group related tasks into separate lists
- Name and categorize task lists
- View all tasks across lists
- Sort tasks by priority or due date
- Archive completed task lists

### API Features
- RESTful endpoints for all operations
- JSON-based request/response format
- Pagination for large task lists
- Error handling and validation
- Secure endpoints with authentication

## Getting Started

1. Clone the repository:
```sh
git clone https://github.com/SiddhantKandi/Task-Tracker.git
# Homework Planner Software (Course Tracker App)

## Overview
The Homework Planner Software — also known as the Course Tracker App — is a student-focused academic management tool designed to help university students track assignments, monitor grades, predict GPA trends, and manage deadlines in one unified platform.

Our goal is to centralize all academic planning tools that are currently dispersed across platforms like Blackboard, Galaxy, and others, into one cohesive, intelligent application.

## Key Features

### 1. Calendar Views
- Monthly View – Displays all days in a month with assignment/event snippets.
- Weekly View – Highlights assignments and deadlines for each day of the week.
- Daily View – Lists events and assignments for a single day, sorted by start time.
- Agenda View (Optional) – Shows all upcoming events in a continuous list.

### 2. Notifications
- Enable/disable notifications by assignment type.
- Receive alerts for assignments due soon.
- Daily progress updates and custom reminders.

### 3. Time Tracker
- Track time spent on each task or assignment.
- Provide analytical summaries of time management.

### 4. Grade View
- Display current grades per course.
- Show GPA impact and performance trends.
- Set grade goals and view completion summaries.

### 5. Future Predictions
- Predict GPA based on current grades.
- Model “what-if” grade scenarios for future semesters.
- Display required grades to achieve a target GPA.

### 6. Blackboard Integration
- Syncs data in real-time with Blackboard.

### 7. Galaxy Integration
- Automatically imports course and grade data from Galaxy.

### 8. Events
- Create, edit, and view academic events seamlessly.

## Software Design Overview

### Architecture
We are employing the Model-View-Controller (MVC) architectural pattern to maintain a clean separation of concerns:
- Model – Handles data such as assignments, grades, and events.
- View – Provides intuitive interfaces for the user.
- Controller – Manages logic between the user interface and backend processes.

This structure allows for scalability, maintainability, and integration with external systems (e.g., Blackboard, Galaxy).

## Functional Requirements
1. Manage and visualize assignment schedules in multiple calendar views.
2. Provide notifications for upcoming deadlines.
3. Track time spent on coursework.
4. Display and analyze grades dynamically.
5. Predict GPA trends based on current or speculative grades.
6. Integrate seamlessly with Blackboard and Galaxy.

## Non-Functional Requirements
- Performance: Application should respond within 2 seconds for all user interactions.
- Reliability: Ensure 99% uptime for all cloud services.
- Usability: Simple and intuitive interface, accessible to non-technical users.
- Security: Encrypted storage for all user academic data.
- Maintainability: Modular code structure using MVC for ease of updates.
- Portability: Available as both a web and mobile application.

## Team Members & Roles

| Name | Role | Responsibilities |
|------|------|------------------|
| Onyeze J. Chineke | Research & Product Strategy | Analyze existing products, identify differentiation points. |
| Noah Stephen Ferenczhalmy | GitHub & Testing Lead | Manage GitHub repository setup, implement unit testing. |
| Collin McAlister | Design & Architecture Lead | Draft system diagrams and architectural blueprints. |
| Nidhi Parvathala | Documentation & Cost Analysis | Prepare reports and cost requirement analysis. |
| Sebastian Sarinana | Visual Media Designer | Develop presentations and visual deliverables. |
| Jesus Rafael Silva | Project Scheduling | Manage project timeline, milestones, and staffing plans. |
| Kayla Michelle Vaughn | Video Production | Record and edit video demonstrations. |

## Tools & Technologies
- Languages: Python / JavaScript / HTML / CSS
- Frameworks: React.js, Django / Flask
- Database: SQLite / PostgreSQL
- Integrations: Blackboard API, Galaxy Portal
- Version Control: Git + GitHub

## Project Setup

### Step 1: Clone Repository
```
git clone https://github.com/3354-team10/homework-planner.git
cd homework-planner
```

### Step 2: Install Dependencies
```
npm install
```
or
```
pip install -r requirements.txt
```

### Step 3: Run Application
```
npm start
```
or
```
python manage.py runserver
```

## Milestones
| Deliverable | Description | Due Date |
|--------------|--------------|-----------|
| Deliverable #1 | Project Scope & Initial Diagrams | Oct 19, 2025 |
| Deliverable #2 | Prototype & User Stories | TBD |
| Deliverable #3 | Final Software Product | TBD |

## License
This project is developed as part of the UTD SE/CS/CE 3354 – Software Engineering course.
All content is for educational purposes only.

## Repository Information
Repository Name: 3354-team10
URL: (Add your actual GitHub repo link here)
Instructor: Dr. [Instructor Name]
Course: SE/CS/CE 3354 – Software Engineering

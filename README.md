The Forest helps users stay focused by growing a virtual tree. The twist is that the tree only grows if the user avoids distractions and stays focused on their task. If the user exits the app or starts using their phone for other activities, the tree wilts and dies. Over time, users can grow an entire forest of trees, representing their focused sessions.

How the Study Forest Website Works:
Start a Task You open the website, set a timer (usually 30 minutes), and plant your virtual tree. As long as you stay in the website and focus on your task, your tree keeps growing.
Stay Focused If you leave the website or get distracted by other phone apps (like checking Instagram), your tree wilts and dies. It’s a little reminder to stay on track.
Earn Coins When your focus session ends, you earn coins based on how long you stayed focused. These coins are your reward for being productive.
Plant Real Trees The real magic happens here: you can use the coins you've earned to plant actual trees in the real world, through Forest’s partnership with reforestation organizations. It’s a great way to make your productivity count for something bigger than just getting your work done.
Track Your Progress The app also shows you stats on how much time you’ve spent focusing, how many trees you’ve grown, and how much real-world environmental impact you’ve made. It’s a nice way to see your efforts add up!

Backend:
Handles requests to grow trees, reset data, and retrieve saved progress.
Uses Spring Boot to manage REST APIs and JPA to interact with the database.
Frontend:
Timer and tree growth visualization are implemented in JavaScript.
AJAX calls interact with the backend to save and load data.
Database:
H2 (in-memory) stores study time and tree count.

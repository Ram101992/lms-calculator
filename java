<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>LMS Cost Calculator</title>
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <div class="calculator-container">
    <h1>LMS Cost Calculator</h1>
    <form id="lms-calculator">
      <label for="users">Number of Users:</label>
      <input type="number" id="users" placeholder="e.g., 100" required>
      
      <label>Features Required:</label>
      <div>
        <input type="checkbox" id="course-authoring" value="100">
        <label for="course-authoring">Course Authoring</label>
      </div>
      <div>
        <input type="checkbox" id="gamification" value="50">
        <label for="gamification">Gamification</label>
      </div>
      <div>
        <input type="checkbox" id="mobile-app" value="75">
        <label for="mobile-app">Mobile App</label>
      </div>
      <div>
        <input type="checkbox" id="api-integration" value="200">
        <label for="api-integration">API Integration</label>
      </div>
      <div>
        <input type="checkbox" id="reporting" value="150">
        <label for="reporting">Reporting & Analytics</label>
      </div>
      
      <label for="storage">Storage Requirements (GB):</label>
      <input type="number" id="storage" placeholder="e.g., 50" required>
      
      <label for="support">Support Level:</label>
      <select id="support">
        <option value="0">Basic (Free)</option>
        <option value="100">Premium (+$100/month)</option>
        <option value="200">24/7 (+$200/month)</option>
      </select>
      
      <label for="setup">Setup & Customization:</label>
      <input type="checkbox" id="setup" value="500">
      
      <label for="contract">Contract Length (Months):</label>
      <input type="number" id="contract" placeholder="e.g., 12" required>
      
      <label for="training">Training & Onboarding:</label>
      <input type="checkbox" id="training" value="300">
      
      <button type="button" id="calculate-btn">Calculate</button>
    </form>
    
    <div id="results" class="hidden">
      <h2>Estimated Costs</h2>
      <p><strong>Monthly Cost:</strong> $<span id="monthly-cost">0</span></p>
      <p><strong>One-Time Setup Fee:</strong> $<span id="setup-fee">0</span></p>
      <p><strong>Annual Cost:</strong> $<span id="annual-cost">0</span></p>
    </div>
  </div>
  <script src="script.js"></script>
</body>
</html>

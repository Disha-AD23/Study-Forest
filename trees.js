// Select the "Plant a Tree" button and the forest container
const plantTreeButton = document.getElementById('plantTreeBtn');
const forestContainer = document.getElementById('forest');

// Function to create a new tree
function plantTree() {
    const tree = document.createElement('div');
    tree.classList.add('tree');

    const leaves = document.createElement('div');
    leaves.classList.add('leaves');

    tree.appendChild(leaves);

    // Randomly position the tree in the forest
    const randomX = Math.random() * (forestContainer.offsetWidth - 50);
    tree.style.left = `${randomX}px`;

    // Add event listener to grow the tree on click
    tree.addEventListener('click', () => growTree(tree));

    forestContainer.appendChild(tree);
}

// Function to grow the tree
function growTree(tree) {
    tree.classList.toggle('grow');
}

// Attach event listener to the "Plant a Tree" button
plantTreeButton.addEventListener('click', plantTree);

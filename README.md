# Lab 8: GitHub Issues and Pull Requests

AI Usage level 0: No AI allowed

[Video Walkthrough](TODO!!)

[Lab Resources Repository](https://github.com/CSCI3081WFa26/lab-resources)

The goal of this assignment is to get comfortable using GitHub Issues and Pull Requests (PRs)[^1].

GitHub Issues are like a discussion board attached to the repository.
They can be used to plan work, report bugs, and talk about the project.
Pull requests are a request to merge changes from one branch onto another branch (usually `main`).
They describe the purpose of the changes and what changes are made.

While you aren't working with other people here, remember that the goal of using issues and pull requests is to communicate with other people working on the project.

### FiveStudents Software

In this lab, you will be working on the FiveStudents software.
This is the same codebase you worked on in Lab 7.

You can still run the program with this command:

```sh
./gradlew run --args='<item name> <toppings>'
```

`<item name>` is the fast food item.
`<toppings>` is a list of toppings, separated by commas, without spaces in-between.

## Lab Instructions

You will walk through identifying, reporting, and resolving **two bugs**.

These steps would are often done by different people, with a different person identifying and reporting a bug than the person who fixes it.
In this lab, you will be doing both sides.

Make sure to do these steps **twice**:

1. Find a bug in the software.
2. Create a GitHub Issue to report the bug on Github.
    - You should add a **title, a summary of the bug, your version of the FiveStudents software (1.0), your operating system, steps to reproduce the bug, the expected behavior, and the observed behavior.**
3. Label the issue as a bug and assign the issue to yourself on GitHub.
4. Fix the bug in the code.
    - Make your changes for the first bug on a branch called `fix1`, and a branch called `fix2` for the second bug.
5. Push your branch and create a pull request on GitHub, merging the fix branch onto `main`.
6. Link the pull request to the issue for that bug on Github.
    - You can do this by going to the issue, clicking on "Development" in the bottom right, and selecting the pull request.
7. Merge the pull request into the `main` branch using the GitHub web interface.
    - Make sure you don't delete the `fix1` or `fix2` branches when you merge them.

The [Video Walkthrough](TODO!!) shows how to do each of these steps for the first bug.
You will need to do these steps again for the second bug on your own.

**The first bug can be found with the input `hamburger grilledmushrooms`.**
You will need to find the second bug on your own.

Push all your branches to Github, and submit the final commit ID[^2] on gradescope.

Make sure your code compiles!

### FiveStudents Specification

_This is the same as from Lab 7. You don't have to re-read it if you don't want to._

- The shop makes three types of fast food items: `HotDog`, `Hamburger`, and `Sandwich`.
- A `HotDog` has 520 reward points earned, a `Hamburger` has 870 reward points, and a `Sandwich` has 290 reward points.
- Each fast food item can have any number of toppings (multiple toppings of the same type are allowed).
- The shop offers three types of toppings: `GrilledOnions`, ` GrilledMushrooms`, and `JalapenoPeppers`.
- Adding toppings increases the total reward points earned by purcahasing a fast food item.
    - The `GrilledOnions` topping increases the total reward points by 10 each time it is added to the fast food item.
    - The `GrilledMushrooms` topping increases total by 20 each time it is added.
    - The `JalapenoPeppers` topping increases total by 5 each time it is added.
- The software will take in two arguments. All arguments will be lowercase.
    - The first argument will be the name of the fast food item (`hotdog`, `hamburger`, or `sandwich`).
    - The second argument will be a comma-seperated list of toppings for the fast food item, without spaces (Example: `grilledmushrooms,jalapenopeppers`).
- The software will print out information about the fast food item.
    - The first line will contain the number of total reward points earned by purchasing the item.
    - The second line will contain a description of the fast food item, made up of the item name followed by the names of it's toppings, seperated by spaces (Example: `hotdog grilled mushrooms jalapeno peppers`).

[^1]: Pull requests are also called "Change Requests" sometimes. Change Request is closer to what it actually means now. You are requesting a change to the code. "Pull Request" comes from before large Git remote platforms like GitHub. You would ask another person to "pull" your code into the repository on their computer.
[^2]: "Commit hash" is another name for commit ID. You can find it by running `git log -1`.

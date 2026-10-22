# Lab 8: GitHub Issues and Pull Requests

AI Usage level 0: No AI allowed

[Video Walkthrough](TODO!!)

[Lab Resources Repository](https://github.com/CSCI3081WFa26/lab-resources)

The goal of this assignment is to get comfortable using GitHub Issues and Pull Requests (PRs)[^1].

GitHub Issues are like a discussion board attached to the repository.
They can be used to plan work, report bugs, and talk about the project.
Pull Requests are a request to merge changes from one branch onto another branch (usually merge changes from a development branch onto `dev` or `main`).
They have a description to describe the purpose of the changes and what changes are made.

While you aren't working with other people here, remember that the goal of using Issues and Pull Requests is to communicate with other people working on the project.

## Lab Instructions

You will walk through identifying, reporting, and resolving **two bugs*.

These steps would are often done by different people, with a different person identifying and reporting a bug than the person who fixes it.
In this lab, you will be doing both sides.

Make sure to do these steps **twice**:

1. Find a bug in the software.
2. Create a GitHub issue to report the bug on Github.
3. Label the issue as a bug and assign the issue to yourself.
4. Fix the bug in the code.
5. Push your branch and create a Pull Request on GitHub.
6. Link the Pull Request to the Issue on Github.
7. Merge the Pull Request into the `main` branch using the GitHub web interface.

The [Video Walkthrough](TODO!!) shows how to do each of these steps for the first bug.
You will need to do these steps again for the second bug on your own.

<!--

Above here is rewritten so far.

Below here is TODO.

-->

**The code provided in REPO is an implementation of the FiveStudents software**. You can see the requirements in Section "FiveStudents Requirements" (these requirements are the same as the ones of "Lab 7: Design Patterns"). The implementation contains **two bugs**. The first bug can be revealed by running the program with the following inputs `hamburger grilledmushrooms`. You should identify the second bug by inspecting the code. (You can assume that the inputs to the program are well-formatted. That is, the second bug can be triggered with a well-formatted input.)

For each bug, you should:
* Create a GitHub issue to report the bug on GitHub
	* In the issues, you need to specify the **title, a summary, the version of the FiveStudents software (1.0), the operating system, the steps to reproduce, the expected behavior, and the observed behavior**.
* Label the issues as a bug and assign the issue to yourself on GitHub
* Fix the bug in the code
	* Change the code to fix the bug in a branch callled `fix1` for the first bug and `fix2` for the second bug.
* Create a GitHub pull request for the fix on GitHub
	* The pull request should be based on the branch containing the fix
* Link the pull request to the issue on GitHub
* Merge the pull request into the main branch of REPO on GitHub


### FiveStudents Requirements

A fast food store wants to create a software called FiveStudents to take care of fast food orders. The shop makes three types of fast food items: `HotDog`, `Hamburger`, and `Sandwich`. A `HotDog` has 520 calories, a `Hamburger` has 870 calories, and a `Sandwich` has 290 calories. Each fast food item can have any number of toppings (multiple toppings of the same type are allowed). The shop offers three types of toppings: `GrilledOnions`, ` GrilledMushrooms
`, and `JalapenoPeppers`. Adding toppings increases the calories of a fast food item. The `GrilledOnions` topping increases calories by 10 each time it is added to the fast food item. The `GrilledMushrooms` topping increases calories by 20 each time it is added. The `JalapenoPeppers` topping increases calories by 5 each time it is added. When the FiveStudents software creates a fast food item we want to compute the calories of the item and its description. For example, if a customer orders a hotdog with grilled mushrooms and jalapeno peppers, the calories of the item are 545 and the description for the item is `hotdog grilled mushrooms jalapeno peppers`. The `FiveStudents` system computes the calories using the `getCalories` method from the `FastFoodItem` class and generates the fast food item description using the `getDescription` method from the same class. The FiveStudents software creates fast food items using two inputs: the fast food item type (i.e., `hotdog`, `hamburger`, or `sandwich`) and the toppings (e.g., `grilledmushrooms,jalapenopeppers`). The list of toppings is comma separated. The software makes the fast food item using the `makeFastFoodItem(String,String)` method.

#### Running the FiveStudents Software
In REPO, you can run the FiveStudents software from the terminal using:
*
`./gradlew run --args='hotdog grilledmushrooms,jalapenopeppers'`.

With these parameters, the output of the system will be:

```
545
hotdog grilled mushrooms jalapeno peppers
```

### Performing and Submitting the Solution

* Perform and submit your solution by:
	* Following the instructions in this assignment and the video tutorial
	* Pushing all the branches to the remote repository
	* Submitting the commit ID of your solution on Gradescope. You can get your commit ID by running `git log -1`. (The commit ID you should be submitting is the one corresponding to the pull request of `fix2` being merged into `main`.)
	* Do not delete the `fix1` and `fix2` branches after performing the pull requests.

### Notes
* We provide a video tutorial for this lab at this [link](https://mediaspace.umn.edu/media/t/1_hqshzij9), courtesy of Dr. Mattia Fazzini.
* Before submitting, make sure that your code compiles
* You can perform multiple commits as you produce your solution. This is not only fine, but actually very much encouraged.

### Additional References
* [GitHub Issues](https://guides.github.com/features/issues/)
* [GitHub Pull Requests](https://guides.github.com/activities/hello-world/)

[^1]: Pull Requests are also called "Change Requests" sometimes. Change Request is closer to what it actually means now. You are requesting a change to the code. "Pull Request" comes from before large Git remote platforms like GitHub. You would ask another person to "Pull" your code into the repository on their computer.


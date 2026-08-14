# Lab 8: GitHub Issues and Pull Requests

AI Usage level 0: No AI allowed

In this assignment, you are asked to use [GitHub issues](https://guides.github.com/features/issues/) and [pull requests](https://guides.github.com/activities/hello-world/) to resolve software bugs. You will use what you learn in this lab in the project iterations.

For this assignment you will need Gradle, Java, and IntelliJ IDEA. We suggest you use a lab machine (in [Keller Hall 1-262](https://cse.umn.edu/cseit/classrooms-labs)), as Gradle, Java, and IntelliJ IDEA are already installed on the machine. You can also access a lab machine remotely using this link https://csel-kh1262-X.cselabs.umn.edu, where X is the machine identifier. For more information on how to access the lab machines remotely, please refer to the "Lab 1: Git" instructions. Finally, [VOLE3D](https://cse.umn.edu/cseit/self-help-guides/virtual-online-linux-environment-vole) also has the same technologies and that is another option available to you.

Before starting the lab, please remember the following important items:

**IMPORTANT: Inside the lab machine, only files saved to your home folder (e.g., `/home/butle547`) will be persisted across sessions. If you log out, make sure your progress is pushed to GitHub or saved in the home folder.**

One of the reasons you might not be able to log into a lab machine is that you reached your CSE Labs Account disk quota. To free space, please use these [instructions](https://cse.umn.edu/cseit/self-help-guides/disk-quota-free-your-space). (In some cases, you might need to SSH into a CSE classroom or lab machine to complete the instructions.)

Remember to log out from the lab machine when you completed your work session (especially if you are working remotely), as this operation will allow other students to use the same machine.

## Lab Instructions

In the following instructions, we use the term "REPO" to indicate the repository that Github Classroom created for you. **Make sure you use this repository and not a repository you created on your own.** Please contact us on Piazza in case you experience issues with the creation of your repository.

At a high level, in this lab you need to identify, report, and resolve **two bugs**. Specifically, to complete this lab assignment, you will to perform the following tasks **twice**.

 * Create a GitHub issue to report a bug on GitHub
 * Label the issues as a bug and assign the issue to yourself on GitHub
 * Fix the bug in the code
 * Create a GitHub pull request for the fix on GitHub
 * Link the pull request to the issue on GitHub
 * Merge the pull request into the main branch of REPO on GitHub

You need to perform this task **twice** as there are **two bugs** in the REPO code. The video tutorial of this lab shows how to perform the tasks for one of the bugs.

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

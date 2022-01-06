# Contributing

## Commit Policy
1. Multiple people should not be adding code to or working on the same file at the same time.
2. Do not change the formatting of (reorganize) any existing folders or files without prior discussion
3. Make sure that you have first pulled and merged before making a commit.
4. Do not commit files that you don't remember changing or files with broken code.
5. Make sure to resolve any conflicts when you pull or push
6. If you do need to commit code with some problems, save it to a separate branch instead of the master.
7. Each main feature should be worked on through a separate branch designated for that feature. All commits regarding that feature should be made only to that branch.
   * Branches should only be used for large project features (don't make a new branch for cb work or about pages unless necessary)
   * When that feature is completely working, you must create a pull request that will be reviewed before merging the branch with the master

## Making Commits
1. Try to make each commit focused on a specific feature. Break apart large commits based on those specific features.
2. Make sure all of your commmits have clear descriptions that explain the changes made
  * When updating the ReadMe, include a description at least when making significant changes.
3. You should be aiming commit your working code each day after or during class.

## Creating Branches
**Make a new branch whenever you start working on a new feature**
1. On IntelliJ go to **Git** > **New Branches...**
2. Set a descriptive name for the branch
3. Check the option for **Checkout Branch** to switch to that branch
4. Publish the branch so everyone can access it

## Creating Pull Requests
**Create a pull request after you have finished working on a branch and want to merge it with the master**
1. On InteliJ fo to **Git** > **Github** > **Create Pull Request**
2. Select the project you want to send the request to under **Base Fork**
3. Select the branch in the project that you want your changes to be applied to under **Base Branch**
4. Review the commits that you will be making under **Show Diff**
5. Give a brief title and description to explain what changes will be applied
* Once your changes are reviewed by at least one person (Sam), the branch will be merged with the master

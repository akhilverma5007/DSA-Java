// GIT -> Git is a Version Control System.
// It allows multiple developers (like you and your friends) to work simultaneously on the same project. 
// It tracks changes made by each developer and stores those changes systematically, enabling collaboration 
// and ensuring that everyone's work is synchronized. 
// That which person made, which change where in the project, at what time.

/* Commands
> ls (listing)
> cd (Change Directory)
> git init (Initialize an empty repository)
> git clone [url] (Clone a github repository)
> touch names.txt (Create a emplty text file)
> cat names.txt (to read the file)
> git status (status for tracked/untracked files)
> git add . | git names.txt (. means everything untracked)
> git commit -m "Message" (save to the history of project)
> git log (to see git logs)
> git reset [commit] (To remove above commits copy below commit)

Git Stash (You dont want to delete, but keep the files in backstage)
First get the files on stage( git add .)
> git stash (go backstage)
> git stash pop (come front)
> git stash clear (clear the stashing area)
*/

// GITHUB(More tools like this: Bitbucket, Gitlab) -> It is a platform/tool which allows us to host our git repositories, 
// and people from different places can contribute or change.

/* Commands
> git remote add origin [github repository url] (means you're adding a url to the folder)
> git push origin main (main is branch, its my personal)
> git remote add upstram [url] (From where you have forked it that is called upstream url)
> git remote -v (lists urls attached with the folder)

BRANCHES (Never commit on master/main branch as someone else also being working on the same file, and some of you both changes will be overwrited)
> git branch newbranch (create new branch)
> git checkout newbranch (checkout to the branch)
> git branch (current branch)
> git branch -D [branch name] (delte a branch)
> git branch -a (list of branches)

PULL REQUEST
When you create your own copy and make some changes and you want to that changes to visible in main project, then you raise a pull request, then it gets merged by owner.
Only one branch can be assoicated to one pull request, everytime you create a pull request create a new branch.
*/

/* GIT MERGE (sync origin with upsteam)
> git log
> git fetch --all --prune (fetch all branches including ince that are deleted also)
> git reset --hard upstream/main
> git checkout main
> git push origin main

// OR you can do 
> git pull upsteam main (same above thing)
 */

 /* SQUASHING YOUR COMMITS
 > touch abc1
 > git add .; git commit -m "changes 1" 
 > touch abc2
 > git add .; git commit -m "changes 2" 
 > touch abc3
 > git add .; git commit -m "changes 3" 

 //HERE COMES REBASE COMMANDS
 > git rebase -i [commit url]
 pick / s
  */


  // MERGE CONFLICTS / do manually (if two person made a change in the same line of a file) 
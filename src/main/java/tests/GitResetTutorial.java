package tests;

public class GitResetTutorial {
	/*
	 * 1. Cum mutam un fisier din staging area in working directory
	 * 
	 *  --> git reset
	 *  
	 * 2. Cum sterg ultimul commit facut pe local repository
	 * 
	 * --> git reset HEAD^
	 * 
	 * 3. Cum sterg mai multe commituri din local repository
	 * 
	 * --> git reset HEAD~2
	 * 
	 * 4. Care sunt optiunile cand stergem pentru fisiere
	 * 
	 * soft --> sterge commitul si muta fisierele in stanging area
	 * 
	 * --> git reset --soft commit_id
	 * 
	 * mixed --> sterge commitul si muta fisierele in working directory
	 * 
	 * --> git reset --mixed commit_id
	 * 
	 * hard --> sterge commitul si fisierele
	 * 
	 * --> git reset --hard commit_id
	 * 
	 * 5. Cum sterg un merge ()
	 * 
	 *  --> git reset --hard commit_id  (daca nu vreau sa tin fisierele pe master) daca vreau, atunci execut
	 *  cu --soft sau --mixed
	 * 
	 * 6. Cum sterg un commit de pe remote repository
	 * 
	 * Sterg doar de pe remote si pastrez pe local
	 * 
	 * --> git push origin +HEAD^:master
	 * 
	 * Sterg si de pe local si de pe remote
	 * 
	 * --> git reset HEAD^
	 * --> git push origin +HEAD
	 */
	
	

}

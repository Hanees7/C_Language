You are given a score that the player has achieved in a 100 point game.

Print some text based on below conditions:

If the score is 100, print "Perfect score"
If the score is less than 100, but greater or equal to 80, print "Almost perfect score"
If the score is less than 80, print "Nice try"
Sample 1:
Input
Output
100
Perfect score
Sample 2:
Input
Output
85
Almost perfect score
Sample 3:
Input
Output
60
Nice try
OUTPUT :
function printScore(score) {
    // Complete this function
if(score == 100){
    console.log("Perfect score")
}
else if(score < 100 && score>= 80){
        console.log("Almost perfect score")
    }
    else{
        console.log("Nice try")
    }
}

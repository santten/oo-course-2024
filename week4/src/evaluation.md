> Submit the answer of this assignment as a pdf file. The file should contain the source codes of the relevant classes as well as an explanation of how you used GitHub Copilot to write the code. For each assignment, evaluate the applicability of GitHub Copilot for your own coding style. What are the benefits and drawbacks of using GitHub Copilot?

This markdown file acts as a placeholder to fulfill the role for this paragraph - it doesn't really correspond with any specific task and doesn't make sense within the context of the rest of the assignment, but I hope doing some introspection here will suffice?

### Task 1

The first task involved making a Calculator class. I wrote some parts of it myself, but the ones that utilized Copilot are listed here:

#### Getter and Setter
```java
    public int getCurValue() {
        return curValue;
    }

    public void setCurValue(int curValue) {
        this.curValue = curValue;
    }
```

I utilized Copilot for typing this getter-and-setter for the curValue class variable. I often do this in my other coding too, getters and setters are the kind of mundane task I think AI is the best at: simple in theory, easy to check if it's right, and repetitive (seeing as it has to be done often when it comes to OOP).

#### Sum Method
```
    public void sum(int num) {
        // adds passed num value to the current value of calculator
        this.curValue += num;
    }
```

I also asked Copilot to write this sum-method, seeing as it was required in the assignment. If I was coding this otherwise, I probably wouldn't have bothered, seeing as it only output one line of code and it is not convoluted enough to justify going to AI for it. I did write the comment (as instruction) and the signature myself though.

#### Main Method

```
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userInput;

        do {
            System.out.print("Enter Your Integer: ");
            int num = scanner.nextInt();
            calculator.sum(num);
            System.out.println("CURRENT NUMBER: " + calculator.getCurValue());

            System.out.print("Add Another Number? [Y/N]: ");
            userInput = scanner.next();
        } while (userInput.equalsIgnoreCase("y"));

        System.out.println("FINAL NUMBER: " + calculator.getCurValue());
        scanner.close();
    }
```

I did initially want to write the main method myself, but it turned out to be a little clumsy and I wasn't sure what I wanted. Coming up with an AI prompt solidified for me what I wanted the main method to do, but at that point it was faster to just send the prompt to it anyway. I modified the System.out -messages a little bit to fit my own style more. If this task was more important, I would've probably modified it further: current main method doesn't use the reset() method, which is making my IDE complain and I'd let the user skip the Y/N question about adding another number. Overall, the AI output okay code and it corresponds to the prompt I gave it.

#### In Conclusion

Copilot was (and has been for a while before this assignment) a useful shortcut to code faster. However, I believe it's quality can only be as good as the one prompting it can write - and writing with my own hands would be better. I also generally worry about missing out on learning better understanding of subjects as a student, so I try to avoid using it unless the task is very easy and mundane (like getters and setters) or if I'm seriously in a big hurry (hasn't happened in this class yet, but I've been there on other classes).

### Task 2

Task 2 was about using Copilot to explain code in a README.md file. Overall, I don't think using Copilot to write is a good idea. I think its (and other LLMs out at the moment of writing this for that matter) output is uninspired and makes communication less interesting. 

In some purposes it works well, but I'm kind of worried that in the future a lot of work-related communication might just be two AI-prompters summarizing and generating text back and forth. I prefer human-to-human communication. I understand that a lot of coders don't see the value of writing quality text, especially if one has always been heavily more interested in mathematics and computing only: however, I find language and writing skills important in many ways. 

In general, I'd rather read poorly written human text than AI text, because it often manages to convey emotion, genuine personality and intention in a way that AI can't (and probably never will be able to...).

All that being said, using it to summarize code seems okay. It's another tedious task that can be automated, I don't see why not. An AI generated code summary can be more useful than no code summary at all. In this task I was more than happy to let Copilot do this part rather than copying these things over by hand.
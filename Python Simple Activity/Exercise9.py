class Letter :
    header = "Dear "
    footer = "Sincerely, \n\n"
    text = ""

    def getText (self):
        return self.header+self.text+self.footer
    def __init__(self, letterFrom, letterTo):
        self.header+=letterTo+ ": \n\n"
        self.footer+=letterFrom+ "\n"
        return
    def addLine (self,line) : 
        self.text+=line+ "\n"

letter= Letter ("Mary","John")
letter.addLine ("I am sorry we must part.")
letter.addLine ("I wish you all the best. \n")

print(letter.getText())
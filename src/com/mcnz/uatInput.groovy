/* 
* jenkins-shared-library/src/com/mcnz/uatInput.groovy
* https://github.com/learn-devops-fast/jenkins-shared-library.git
*/

package com.mcnz

public class uatInput {
    
    def buildIsUatApproved() {
        def file = new File("/var/jenkins_home/approved.txt")
        
        if (file.exists()) {
            return true
        } else {
            println "Approval file does not exist at /var/jenkins_home/approved.txt"
            return false
        }
    }
}

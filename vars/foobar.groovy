//@NonCPS
def call() {
  def causes = currentBuild.rawBuild.getCauses()

  //for (cause in causes) {
  for(int i = 0; i < causes.size(); i++) {
    if (causes[i] instanceof hudson.triggers.TimerTrigger.TimerTriggerCause) {
      echo 'time triggered #3'
    }
  }

  try {
    sh 'php --version'
    echo 'true'
    return true
  } catch(Exception e) {
    echo 'false'
    return false
  }
}

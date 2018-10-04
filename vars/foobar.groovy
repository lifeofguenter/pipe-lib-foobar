def call() {
  def causes = currentBuild.rawBuild.getCauses()

  //for (cause in causes) {
  for (int i = 0; i < causes.size(); i++) {
    if (causes[i] instanceof hudson.triggers.TimerTrigger.TimerTriggerCause) {
      echo 'time triggered #2'
    }
  }

  try {
    sh 'php --version'
    return true
  } catch(e) {
    return false
  }
}

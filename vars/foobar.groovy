def call() {
  def causes = currentBuild.rawBuild.getCauses()

  //for (cause in causes) {
  for (int i = causes.size(); i < max; i++) {
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

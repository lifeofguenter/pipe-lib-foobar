def call() {
  def causesList = currentBuild.rawBuild.getCauses()

  for (cause in causesList) {
    if (cause instanceof hudson.triggers.TimerTrigger.TimerTriggerCause) {
      echo 'time triggered'
    }
  }

  try {
    sh 'php --version'
    return true
  } catch(e) {
    return false
  }
}

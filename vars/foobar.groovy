def call() {

  if (isTriggeredByTimer()) {
    echo 'time triggered #5'
  } else {
    echo 'push triggered'
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

@NonCPS
def isTriggeredByTimer() {
  def causes = currentBuild.rawBuild.getCauses()

  for (cause in causes) {
    if (cause instanceof hudson.triggers.TimerTrigger.TimerTriggerCause) {
      return true
    }
  }

  return false
}

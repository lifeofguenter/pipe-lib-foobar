@NonCPS

def call() {
  def causes = currentBuild.rawBuild.getCauses()

  for (cause in causes) {
    if (cause instanceof hudson.triggers.TimerTrigger.TimerTriggerCause) {
      echo 'time triggered #3'
    }
  }

  def r = sh(returnStatus: true, script: 'php --version')
  if (r > 0) {
    echo 'false'
    return false
  }

  echo 'true'
  return true
}

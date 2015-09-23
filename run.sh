export GRADLE_OPTS="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=51014"

export root_dir=$0/..
gradle -p $root_dir jettyRun
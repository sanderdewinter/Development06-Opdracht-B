
#Making sure the user is root, if not prompt user for root access.
[ "$(whoami)" != "root" ] && exec sudo -- "$0" "$@"

#if argument is Jenkins, install Jenkins
if [ $1 = "Jenkins" ];
then
	wget -q -O - https://jenkins-ci.org/debian/jenkins-ci.org.key | sudo apt-key add -
	sudo sh -c 'echo deb http://pkg.jenkins-ci.org/debian binary/ > /etc/apt/sources.list.d/jenkins.list'
	sudo apt-get update
	sudo apt-get install jenkins
fi
